package etoa2_4

import acmi.l2.clientmod.util.IOUtil

class EditBox extends DefaultProperty {
    Type type = Type.NORMAL
    int maxLength
    int showCursor = -1
    boolean chatMarkOn
    int offsetX = -9999
    boolean candidateBoxShowUpPos = true
    int useAutoCompletion = 0

    @Override
    EditBox read(InputStream input) {
        super.read(input)

        use(IOUtil) {
            type = Type.values()[input.readInt()]
            maxLength = input.readInt()
            showCursor = input.readInt()
            chatMarkOn = input.readBoolean()
            offsetX = input.readInt()
            candidateBoxShowUpPos = input.readBoolean()
            useAutoCompletion = input.readInt()
        }

        this
    }

    @Override
    EditBox write(OutputStream output) {
        super.write(output)

        use(IOUtil) {
            output.writeInt(type.ordinal())
            output.writeInt(maxLength)
            output.writeInt(showCursor)
            output.writeBoolean(chatMarkOn)
            output.writeInt(offsetX)
            output.writeBoolean(candidateBoxShowUpPos)
            output.writeInt(useAutoCompletion)
        }

        this
    }

    enum Type {
        NORMAL,
        CHAT,
        PASSWORD,
        COUNT,    //number with delimiters
        NUMBER,
        UNK5,
        TYPE6,
    }

    @Deprecated int getUnk102() { showCursor }
    @Deprecated void setUnk102(int unk102) { this.showCursor = unk102 }

    @Deprecated boolean getUnk103() { chatMarkOn }
    @Deprecated void setUnk103(boolean unk103) { this.chatMarkOn = unk103 }

    @Deprecated int getUnk104() { offsetX }
    @Deprecated void setUnk104(int unk104) { this.offsetX = unk104 }

    @Deprecated boolean getUnk105() { candidateBoxShowUpPos }
    @Deprecated void setUnk105(boolean unk105) { this.candidateBoxShowUpPos = unk105 }

    @Deprecated int getUnk106() { useAutoCompletion }
    @Deprecated void setUnk106(int unk106) { this.useAutoCompletion = unk106 }
}
