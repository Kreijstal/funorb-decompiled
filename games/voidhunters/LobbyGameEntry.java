/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyGameEntry extends Widget {
    Widget field_Wb;
    Widget field_wb;
    String field_Vb;
    byte[] field_Pb;
    boolean field_xb;
    int field_Db;
    Widget field_Jb;
    int field_Kb;
    Widget field_Hb;
    int field_ec;
    boolean field_Qb;
    Widget field_bc;
    int field_Cb;
    Widget field_vb;
    Widget[] field_Zb;
    Widget field_Tb;
    boolean field_cc;
    Widget field_Rb;
    boolean field_Gb;
    int field_Bb;
    boolean field_ac;
    int field_Fb;
    int field_zb;
    Widget field_Sb;
    Widget field_Mb;
    Widget field_Ab;
    long field_Ob;
    Widget field_Lb;
    Widget field_dc;
    boolean field_fc;
    Widget field_Yb;
    long field_Nb;
    boolean field_Xb;
    Widget field_yb;
    Widget field_Eb;
    String[] field_Ib;
    int field_Ub;

    LobbyGameEntry(int param0) {
        super(0L, (Widget) null);
        this.field_Pb = new byte[param0];
    }

    final int getGameId(byte param0) {
        if (param0 == -13) {
          return (int)this.getSecondaryKey(26390);
        }
        LobbyGameEntry var3 = (LobbyGameEntry) null;
        this.comesBefore((LobbyGameEntry) null, -117);
        return (int)this.getSecondaryKey(26390);
    }

    final boolean isSecondaryDetached(byte param0) {
        if (param0 >= 21) {
          return !this.isSecondaryLinked((byte) 87) ? true : false;
        }
        this.getGameId((byte) -41);
        return !this.isSecondaryLinked((byte) 87) ? true : false;
    }

    final boolean comesBefore(LobbyGameEntry param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_24_0 = false;
        boolean stackIn_30_0 = false;
        boolean stackIn_36_0 = false;
        boolean stackIn_41_0 = false;
        int stackIn_48_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        boolean stackIn_63_0 = false;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        LobbyGameEntry var7 = null;
        try {
          if (!this.field_ac) {
            stackIn_6_0 = (6 == this.field_ec) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var3_int = stackIn_6_0;
          if (param1 >= -120) {
            var7 = (LobbyGameEntry) null;
            this.comesBefore((LobbyGameEntry) null, -66);
          }
          if (!param0.field_ac) {
            stackIn_14_0 = (param0.field_ec == 6) ? 1 : 0;
          } else {
            stackIn_14_0 = 1;
          }
          var4 = stackIn_14_0;
          stackIn_17_0 = (var4 != 0) ? 0 : 1;
          if (stackIn_17_0 == var3_int) {
            stackIn_19_0 = var3_int;
            return stackIn_19_0 != 0;
          }
          if (var3_int == 0) {
            if (param0.field_cc != this.field_cc) {
              stackIn_24_0 = this.field_cc;
              return stackIn_24_0;
            }
            if (this.field_cc &&
              this.field_Cb != param0.field_Cb) {
              stackIn_30_0 = !(this.field_Cb >= param0.field_Cb);
              return stackIn_30_0;
            }
          }
          if (param0.field_fc != this.field_fc) {
            stackIn_36_0 = !(this.field_fc);
            return stackIn_36_0;
          }
          if (!this.field_fc) {
            stackIn_41_0 = !(param0.field_Ob <= this.field_Ob);
            return stackIn_41_0;
          }
          if (this.field_Gb) {
            stackIn_48_0 = 1;
          } else {
            stackIn_48_0 = (this.field_Bb == 2) ? 1 : 0;
          }
          var5 = stackIn_48_0;
          if (!param0.field_Gb) {
            stackIn_54_0 = (param0.field_Bb == 2) ? 1 : 0;
          } else {
            stackIn_54_0 = 1;
          }
          var6 = stackIn_54_0;
          stackIn_57_0 = (var6 != 0) ? 0 : 1;
          if (stackIn_57_0 != var5) {
            stackIn_63_0 = !(param0.field_Ob >= this.field_Ob);
            return stackIn_63_0;
          }
          stackIn_59_0 = var5;
          return stackIn_59_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_66_0 = var3;
          stackIn_66_1 = new StringBuilder().append("mm.A(");
          if (param0 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
