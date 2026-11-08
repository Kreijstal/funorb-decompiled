/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ScrollPane extends UiComponent {
    VerticalScrollbar field_Qb;
    static Random field_Mb;
    static String field_Lb;
    static String field_Nb;
    UiComponent field_Ob;
    UiComponent field_Pb;
    static UiComponent field_Kb;

    final boolean layoutAndScrollToContent(int param0, int param1, int param2, boolean param3, boolean param4, int param5) {
        int var7 = 30 / ((-77 - param2) / 39);
        return this.layoutAndScroll(param3, param4, this.field_Ob.field_R, param5, param0, param1, 99);
    }

    private final void applyScrollInput(boolean param0, int param1, boolean param2, int param3, int param4) {
        if (this.field_Qb.pollLineUp(true)) {
          this.field_Pb.field_Db = this.field_Pb.field_Db + param3;
        }
        if (this.field_Qb.pollLineDown(-14)) {
          this.field_Pb.field_Db = this.field_Pb.field_Db - param3;
        }
        if (this.field_Qb.pollPageUp((byte) -125)) {
          this.field_Pb.field_Db = this.field_Pb.field_Db + param4;
        }
        if (this.field_Qb.pollPageDown(-45)) {
          this.field_Pb.field_Db = this.field_Pb.field_Db - param4;
        }
        if (this.field_Y) {
          this.field_Pb.field_Db = this.field_Pb.field_Db - param1;
        }
        if (!param2) {
          if (-(this.field_Pb.field_Db + this.field_Pb.field_yb) > this.field_Pb.field_R + this.field_Pb.field_mb - this.field_Ob.field_R) {
            this.field_Pb.field_Db = -this.field_Pb.field_yb - (this.field_Pb.field_R + this.field_Pb.field_mb - this.field_Ob.field_R);
          }
          if (-(this.field_Pb.field_yb + this.field_Pb.field_Db) < 0) {
            this.field_Pb.field_Db = -this.field_Pb.field_yb;
          }
        } else {
          if (-(this.field_Pb.field_Db + this.field_Pb.field_yb) < 0) {
            this.field_Pb.field_Db = -this.field_Pb.field_yb;
          }
          if (-(this.field_Pb.field_yb + this.field_Pb.field_Db) > this.field_Pb.field_R - (-this.field_Pb.field_mb + this.field_Ob.field_R)) {
            this.field_Pb.field_Db = -this.field_Pb.field_yb - (-this.field_Ob.field_R + (this.field_Pb.field_mb + this.field_Pb.field_R));
          }
        }
        if (this.field_Qb.isThumbHeld(param0)) {
          this.field_Pb.field_yb = -this.field_Qb.getDraggedScrollOffset(this.field_Pb.field_R, param2, 0, this.field_Ob.field_R);
          this.field_Pb.field_Db = 0;
        }
        this.field_Qb.layoutThumb(113, -this.field_Pb.field_yb, this.field_Pb.field_R, this.field_Ob.field_R);
    }

    private final void layoutViewport(boolean param0, int param1, int param2) {
        this.field_Ob.field_Hb = this.field_Hb + (-param2 - param1);
        this.field_Pb.field_M = 0;
        if (!param0) {
          this.field_Ob.field_R = this.field_R;
          this.field_Pb.field_Hb = -param1 + this.field_Hb - param2;
          this.field_Qb.setBoundsAndLayout(-param2 + this.field_Hb, this.field_R, 0, param2, this.field_Pb.field_R, true, -this.field_Pb.field_yb, this.field_Ob.field_R);
          return;
        }
        this.field_Qb = (VerticalScrollbar) null;
        this.field_Ob.field_R = this.field_R;
        this.field_Pb.field_Hb = -param1 + this.field_Hb - param2;
        this.field_Qb.setBoundsAndLayout(-param2 + this.field_Hb, this.field_R, 0, param2, this.field_Pb.field_R, true, -this.field_Pb.field_yb, this.field_Ob.field_R);
    }

    final void layoutWithContentHeight(int param0, boolean param1, int param2, int param3) {
        if (param0 == -1) {
          this.applyScrollInput(true, param2, param1, param3, this.field_Ob.field_R);
          return;
        }
        this.field_Ob = (UiComponent) null;
        this.applyScrollInput(true, param2, param1, param3, this.field_Ob.field_R);
    }

    private final boolean layoutAndScroll(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        if (!param1) {
          if (!this.field_Y) {
            var8 = 0;
            this.field_Pb.layoutVerticalContent(-23983, param4, var8 != 0, this.field_Ob.field_R);
            this.applyScrollInput(true, param3, false, param5, param2);
            if (param6 > 45) {
              return var8 != 0;
            }
            field_Kb = (UiComponent) null;
            return var8 != 0;
          }
          if (param0) {
            var8Lifetime2 = 0;
            this.field_Pb.layoutVerticalContent(-23983, param4, var8Lifetime2 != 0, this.field_Ob.field_R);
            this.applyScrollInput(true, param3, false, param5, param2);
            if (param6 > 45) {
              return var8Lifetime2 != 0;
            }
            field_Kb = (UiComponent) null;
            return var8Lifetime2 != 0;
          }
          var8Lifetime3 = 1;
          this.field_Pb.layoutVerticalContent(-23983, param4, var8Lifetime3 != 0, this.field_Ob.field_R);
          this.applyScrollInput(true, param3, false, param5, param2);
          if (param6 > 45) {
            return var8Lifetime3 != 0;
          }
          field_Kb = (UiComponent) null;
          return var8Lifetime3 != 0;
        }
        var8Lifetime1 = 1;
        this.field_Pb.layoutVerticalContent(-23983, param4, var8Lifetime1 != 0, this.field_Ob.field_R);
        this.applyScrollInput(true, param3, false, param5, param2);
        if (param6 > 45) {
          return var8Lifetime1 != 0;
        }
        field_Kb = (UiComponent) null;
        return var8Lifetime1 != 0;
    }

    ScrollPane(long param0, UiComponent param1, UiComponent param2, VerticalScrollbar param3) {
        super(param0, (UiComponent) null);
        try {
          this.field_Ob = new UiComponent(0L, param2);
          this.field_Qb = new VerticalScrollbar(0L, param3);
          this.addChild((byte) 27, this.field_Ob);
          this.addChild((byte) -101, this.field_Qb);
          this.field_Pb = param1;
          this.field_Ob.addChild((byte) -125, param1);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "rb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_Nb = null;
        field_Mb = null;
        if (param0 >= -104) {
          ScrollPane.isAccountCreationFlagged(true);
          field_Lb = null;
          field_Kb = null;
          return;
        }
        field_Lb = null;
        field_Kb = null;
    }

    final static boolean isAccountCreationFlagged(boolean param0) {
        if (param0) {
          return true;
        }
        return PendingListRequest.field_q;
    }

    final void setBoundsAndLayout(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        if (param3) {
          this.field_R = param2;
          this.field_Hb = param0;
          this.field_yb = param4;
          this.field_M = param5;
          this.layoutViewport(!param3 ? true : false, param6, param1);
          return;
        }
        ScrollPane.isAccountCreationFlagged(true);
        this.field_R = param2;
        this.field_Hb = param0;
        this.field_yb = param4;
        this.field_M = param5;
        this.layoutViewport(!param3 ? true : false, param6, param1);
    }

    static {
        field_Lb = "Seriously offensive language";
        field_Nb = null;
        field_Mb = new Random();
    }
}
