/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class it {
    static wk field_a;
    static boolean field_b;

    final static wk[] a(int param0, wk param1) {
        wk[] var2 = null;
        Object var3 = null;
        wk[] var4 = null;
        if (param0 != 17) {
          var3 = null;
          it.a(-86, true, 3, (vh) null, -126);
          var4 = new wk[9];
          var2 = var4;
          var4[4] = param1;
          return var2;
        } else {
          var4 = new wk[9];
          var2 = var4;
          var4[4] = param1;
          return var2;
        }
    }

    final static nc a(String param0, kl param1, kl param2, byte param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param1.a(param4, 110);
        var6 = param1.a((byte) -15, var5, param0);
        if (param3 != -87) {
          field_a = null;
          return ue.a(param1, var5, param2, (byte) -118, var6);
        } else {
          return ue.a(param1, var5, param2, (byte) -118, var6);
        }
    }

    final static void a(int param0, boolean param1, int param2, vh param3, int param4) {
        vh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        vh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        if (param1) {
          return;
        } else {
          param3.b(1, 12);
          param3.b(true, 17);
          param3.b(true, param2);
          stackOut_1_0 = (vh) param3;
          stackOut_1_1 = 1;
          stackIn_3_0 = stackOut_1_0;
          stackIn_3_1 = stackOut_1_1;
          ((vh) (Object) stackIn_3_0).b(stackIn_3_1 != 0, param4);
          param3.b(1, param0);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, String param5) {
        bv var6 = null;
        int var7 = 0;
        Object var8 = null;
        bv var9 = null;
        var9 = vl.field_n;
        var6 = var9;
        if (param1 <= -71) {
          var9.h(32161, param4);
          var9.field_q = var9.field_q + 1;
          var7 = var9.field_q;
          var9.b(1, param2);
          if (param2 != 2) {
            if (param5 != null) {
              int discarded$5 = sf.a(15901, param5, (vh) (Object) var9);
              var9.e(-var7 + var9.field_q, 5930);
              return;
            } else {
              var9.b(true, param0);
              var9.e(-var7 + var9.field_q, 5930);
              return;
            }
          } else {
            var9.b(param3, 13851);
            if (param5 != null) {
              int discarded$6 = sf.a(15901, param5, (vh) (Object) var9);
              var9.e(-var7 + var9.field_q, 5930);
              return;
            } else {
              var9.b(true, param0);
              var9.e(-var7 + var9.field_q, 5930);
              return;
            }
          }
        } else {
          var8 = null;
          nc discarded$7 = it.a((String) null, (kl) null, (kl) null, (byte) -14, (String) null);
          var9.h(32161, param4);
          var9.field_q = var9.field_q + 1;
          var7 = var9.field_q;
          var9.b(1, param2);
          if (param2 == 2) {
            var9.b(param3, 13851);
            if (param5 != null) {
              int discarded$8 = sf.a(15901, param5, (vh) (Object) var9);
              var9.e(-var7 + var9.field_q, 5930);
              return;
            } else {
              var9.b(true, param0);
              var9.e(-var7 + var9.field_q, 5930);
              return;
            }
          } else {
            if (param5 != null) {
              int discarded$9 = sf.a(15901, param5, (vh) (Object) var9);
              var9.e(-var7 + var9.field_q, 5930);
              return;
            } else {
              var9.b(true, param0);
              var9.e(-var7 + var9.field_q, 5930);
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 4) {
            field_b = true;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
    }
}
