/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyGame extends SceneWidget {
    SceneWidget field_Jb;
    boolean field_Ob;
    static String field_Hb;
    static String field_Xb;
    SceneWidget field_Wb;
    boolean field_Mb;
    long field_Lb;
    boolean field_dc;
    SceneWidget field_ic;
    int field_nc;
    SceneWidget[] field_ac;
    SceneWidget field_jc;
    boolean field_cc;
    SceneWidget field_Kb;
    SceneWidget field_Nb;
    String field_pc;
    int field_ec;
    int field_Qb;
    int field_Rb;
    static String field_fc;
    SceneWidget field_Gb;
    SceneWidget field_Fb;
    boolean field_Pb;
    SceneWidget field_Yb;
    SceneWidget field_Zb;
    SceneWidget field_gc;
    long field_kc;
    String[] field_Ub;
    SceneWidget field_Vb;
    int field_bc;
    SceneWidget field_rc;
    boolean field_oc;
    int field_mc;
    int field_Ib;
    byte[] field_Eb;
    SceneWidget field_Sb;
    SceneWidget field_qc;
    int field_Tb;
    boolean field_hc;
    SceneWidget field_lc;

    final int getGameId(byte param0) {
        if (param0 != 8) {
          this.field_Eb = (byte[]) null;
          return (int)this.getSecondaryKey(true);
        }
        return (int)this.getSecondaryKey(true);
    }

    LobbyGame(int param0) {
        super(0L, (SceneWidget) null);
        this.field_Eb = new byte[param0];
    }

    final boolean isUnlisted(int param0) {
        if (param0 == 433) {
          return !this.isSecondaryLinked(0) ? true : false;
        }
        this.field_Wb = (SceneWidget) null;
        return !this.isSecondaryLinked(0) ? true : false;
    }

    public static void releaseStatics(byte param0) {
        field_Xb = null;
        field_Hb = null;
        field_fc = null;
        int var1 = -86 / ((28 - param0) / 46);
    }

    final boolean comesBeforeGame(byte param0, LobbyGame param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_1 = 0;
        boolean stackIn_31_0 = false;
        boolean stackIn_38_0 = false;
        int stackIn_42_0 = 0;
        boolean stackIn_47_0 = false;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_67_0 = 0;
        boolean stackIn_71_0 = false;
        boolean stackIn_75_0 = false;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (!this.field_cc) {
            stackIn_6_0 = (6 == this.field_Qb) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var3_int = stackIn_6_0;
          if (!param1.field_cc) {
            stackIn_12_0 = (param1.field_Qb == 6) ? 1 : 0;
          } else {
            stackIn_12_0 = 1;
          }
          var4 = stackIn_12_0;
          stackIn_15_0 = (var4 != 0) ? 0 : 1;
          if (stackIn_15_0 == var3_int) {
            stackIn_18_0 = var3_int;
            return stackIn_18_0 != 0;
          }
          if (param0 <= 23) {
            this.field_Qb = 92;
          }
          if (var3_int == 0) {
            stackIn_25_0 = (this.field_hc) ? 0 : 1;
            if (param1.field_hc) {
              stackIn_28_1 = 0;
            } else {
              stackIn_28_1 = 1;
            }
            if (stackIn_25_0 != stackIn_28_1) {
              stackIn_31_0 = this.field_hc;
              return stackIn_31_0;
            }
            if (this.field_hc &&
              this.field_Ib != param1.field_Ib) {
              stackIn_38_0 = !(param1.field_Ib <= this.field_Ib);
              return stackIn_38_0;
            }
          }
          stackIn_42_0 = (param1.field_dc) ? 0 : 1;
          if (stackIn_42_0 == (this.field_dc ? 1 : 0)) {
            stackIn_47_0 = !(this.field_dc);
            return stackIn_47_0;
          }
          if (!this.field_dc) {
            stackIn_75_0 = !(param1.field_Lb <= this.field_Lb);
            return stackIn_75_0;
          }
          if (this.field_Mb) {
            stackIn_55_0 = 1;
          } else {
            stackIn_55_0 = (2 == this.field_Tb) ? 1 : 0;
          }
          var5 = stackIn_55_0;
          if (!param1.field_Mb) {
            stackIn_61_0 = (param1.field_Tb == 2) ? 1 : 0;
          } else {
            stackIn_61_0 = 1;
          }
          var6 = stackIn_61_0;
          stackIn_63_0 = var5;
          if (var6 != 0) {
            stackIn_64_1 = 0;
          } else {
            stackIn_64_1 = 1;
          }
          if (stackIn_63_0 == stackIn_64_1) {
            stackIn_67_0 = var5;
            return stackIn_67_0 != 0;
          }
          stackIn_71_0 = !(param1.field_Lb >= this.field_Lb);
          return stackIn_71_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_78_0 = var3;
          stackIn_78_1 = new StringBuilder().append("eq.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    static {
        field_Xb = "Allow spectators?";
    }
}
