package ct1

import acmi.l2.clientmod.util.defaultio.DefaultIO
import groovy.transform.CompileStatic

@DefaultIO
@CompileStatic
class TreeCtrl extends DefaultProperty {
    boolean saveExpandedNode
    int multiExpand

    // @formatter:off
    @Deprecated boolean getUnk100() { saveExpandedNode }
    @Deprecated void setUnk100(boolean unk100) { this.saveExpandedNode = unk100 }

    @Deprecated int getUnk101() { multiExpand }
    @Deprecated void setUnk101(int unk101) { this.multiExpand = unk101 }
    // @formatter:on
}
