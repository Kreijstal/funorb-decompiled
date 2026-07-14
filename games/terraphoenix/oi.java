/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends gb implements n {
    static ci field_J;
    private eb[] field_K;
    private int[] field_L;
    private pk field_I;
    static java.awt.Color field_H;
    private int field_F;
    private String field_N;
    static String[] field_M;
    private si field_G;

    final void a(int param0, int param1, int param2, int param3) {
        Object var6 = null;
        super.a(param0, -126, param2, param3);
        if (param1 >= -106) {
          var6 = null;
          eb discarded$3 = ((oi) this).a((byte) 29, (sc) null, (String) null);
          int discarded$4 = ((oi) this).field_I.a(((oi) this).field_N, param0 - (-((oi) this).field_w - 14), 10 + (param3 - -((oi) this).field_u), -28 + ((oi) this).field_p, ((oi) this).field_n, 16777215, -1, 0, 0, ((oi) this).field_I.field_s);
          return;
        } else {
          int discarded$5 = ((oi) this).field_I.a(((oi) this).field_N, param0 - (-((oi) this).field_w - 14), 10 + (param3 - -((oi) this).field_u), -28 + ((oi) this).field_p, ((oi) this).field_n, 16777215, -1, 0, 0, ((oi) this).field_I.field_s);
          return;
        }
    }

    private final void b(int param0, int param1) {
        eb[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        eb[] var7 = null;
        var6 = Terraphoenix.field_V;
        if (param0 > ((oi) this).field_F) {
          var7 = new eb[param0];
          var3 = var7;
          var4 = new int[param0];
          var5 = 0;
          L0: while (true) {
            if (((oi) this).field_F <= var5) {
              ((oi) this).field_K = var3;
              ((oi) this).field_L = var4;
              if (param1 != 20682) {
                return;
              } else {
                ((oi) this).field_F = param0;
                return;
              }
            } else {
              var7[var5] = ((oi) this).field_K[var5];
              var4[var5] = ((oi) this).field_L[var5];
              var5++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    oi(si param0, pk param1, String param2) {
        super(0, 0, 288, 0, (cj) null);
        ((oi) this).field_F = 0;
        ((oi) this).field_N = param2;
        ((oi) this).field_G = param0;
        ((oi) this).field_I = param1;
        int var4 = null == ((oi) this).field_N ? 0 : ((oi) this).field_I.a(((oi) this).field_N, 260, ((oi) this).field_I.field_s);
        ((oi) this).a(0, (byte) 126, 288, 0, var4 + 22);
    }

    public static void f(byte param0) {
        field_H = null;
        int var1 = 38 / ((84 - param0) / 35);
        field_J = null;
        field_M = null;
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Terraphoenix.field_V;
        var6 = 0;
        L0: while (true) {
          if (((oi) this).field_F > var6) {
            if (param0 != ((oi) this).field_K[var6]) {
              var6++;
              var6++;
              continue L0;
            } else {
              var7 = ((oi) this).field_L[var6];
              if (0 == (var7 ^ -1)) {
                ((oi) this).field_G.h((byte) -126);
                var6 = -43 / ((param4 - -5) / 57);
                return;
              } else {
                bm.a(((oi) this).field_L[var6], (byte) 1);
                var6 = -43 / ((param4 - -5) / 57);
                return;
              }
            }
          } else {
            var6 = -43 / ((param4 - -5) / 57);
            return;
          }
        }
    }

    final void a(int param0, String param1, byte param2) {
        int var5 = 53 / ((param2 - 0) / 41);
        int var4 = ((oi) this).field_F;
        this.b(1 + var4, 20682);
        ((oi) this).field_K[var4] = ((oi) this).a((byte) 23, (sc) this, param1);
        ((oi) this).field_L[var4] = param0;
    }

    final eb a(byte param0, sc param1, String param2) {
        eb var4 = null;
        int var5 = 0;
        Object var6 = null;
        if (param0 != 23) {
          var6 = null;
          ((oi) this).a(-103, (String) null, (byte) -64);
          var4 = new eb(param2, param1);
          var4.field_l = (cj) (Object) new ic();
          var5 = -2 + ((oi) this).field_n;
          ((oi) this).a(0, (byte) 107, ((oi) this).field_p, 0, 34 + ((oi) this).field_n);
          var4.a(var5, (byte) 85, ((oi) this).field_p - 14, 7, 30);
          ((oi) this).b((byte) 95, (gl) (Object) var4);
          return var4;
        } else {
          var4 = new eb(param2, param1);
          var4.field_l = (cj) (Object) new ic();
          var5 = -2 + ((oi) this).field_n;
          ((oi) this).a(0, (byte) 107, ((oi) this).field_p, 0, 34 + ((oi) this).field_n);
          var4.a(var5, (byte) 85, ((oi) this).field_p - 14, 7, 30);
          ((oi) this).b((byte) 95, (gl) (Object) var4);
          return var4;
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -22417) {
            oi.f((byte) 108);
            jl.field_I.a((byte) -43, 0, 0);
            return;
        }
        jl.field_I.a((byte) -43, 0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new ci(128, 160);
        field_H = new java.awt.Color(10040319);
        field_M = new String[]{"Capture objective", "The alien with this icon is holding the data you need. Kill it at all costs.", "Once dead, the alien will drop the equipment on the floor. Send a soldier to pick it up by clicking on it's square.", "After the equipment is in your possession, get your whole remaining squad to the flashing areas of the map to complete your objective."};
    }
}
