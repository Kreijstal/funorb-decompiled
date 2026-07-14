/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class psa extends l {
    private int field_S;
    private int[] field_Q;
    private boolean field_P;
    private int[] field_T;
    private mp field_R;

    final synchronized void a(int param0, int param1, byte param2, int param3) {
        int var5 = param3 * kta.field_d / 1000;
        if (param2 != -4) {
            return;
        }
        ((psa) this).c(-30515, param1, var5, param0);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var4 = ((psa) this).b((byte) 125);
          ((psa) this).a(((psa) this).field_S * var4 >> -1243146616, -81);
          super.b(param0, param1, param2);
          if (!((psa) this).field_P) {
            var5 = 1;
            var6 = 0;
            L1: while (true) {
              if (var6 >= 16) {
                if (var5 == 0) {
                  break L0;
                } else {
                  ((psa) this).field_P = true;
                  break L0;
                }
              } else {
                var7 = ((psa) this).field_Q[var6];
                if (var7 != 0) {
                  L2: {
                    ((psa) this).field_T[var6] = ((psa) this).field_T[var6] + var7 * param2;
                    var8 = ((psa) this).field_R.field_c[var6];
                    if (-1 <= (var7 ^ -1)) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  L3: {
                    stackOut_9_0 = stackIn_9_0;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var8 <= ((psa) this).field_T[var6] >> -745204436) {
                      stackOut_11_0 = stackIn_11_0;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L3;
                    } else {
                      stackOut_10_0 = stackIn_10_0;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L3;
                    }
                  }
                  L4: {
                    if ((stackIn_12_0 ^ stackIn_12_1) == 0) {
                      var5 = 0;
                      break L4;
                    } else {
                      ((psa) this).field_Q[var6] = 0;
                      ((psa) this).field_T[var6] = var8 << 320964460;
                      break L4;
                    }
                  }
                  super.a((byte) -105, ((psa) this).field_T[var6] >> 1908825036, var6);
                  var6++;
                  continue L1;
                } else {
                  var6++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        ((psa) this).a(var4, 118);
    }

    final synchronized void a(boolean param0, qua param1, byte param2, boolean param3) {
        this.f(-377538388);
        super.a(param0, param1, param2, param3);
    }

    psa(l param0) {
        super(param0);
        ((psa) this).field_Q = new int[16];
        ((psa) this).field_T = new int[16];
        ((psa) this).field_S = 256;
        this.f(-377538388);
    }

    final synchronized void c(int param0, int param1, int param2, int param3) {
        ((psa) this).field_P = false;
        if (!(((psa) this).field_R != null)) {
            ((psa) this).field_R = new mp();
        }
        ((psa) this).field_R.field_c[param3] = param1;
        int var5 = ((psa) this).field_T[param3];
        int var6 = (((psa) this).field_R.field_c[param3] << -1733763956) - var5;
        int var7 = 0;
        int var8 = 0;
        if (-1 < (var6 ^ -1)) {
            var8 = 1;
            var6 = -var6;
        }
        if (var6 > 0) {
            var7 = (var6 + 1) / (1 + param2);
        }
        ((psa) this).field_Q[param3] = var8 == 0 ? var7 : -var7;
        if (param0 != -30515) {
            Object var9 = null;
            ((psa) this).a(true, (qua) null, (byte) -65, false);
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        if (0 == (param2 ^ -1)) {
            ((psa) this).field_S = param1;
            return;
        }
        super.a(param0, param1, param2);
        ((psa) this).field_T[param2] = param1 << -377538388;
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != -377538388) {
            ((psa) this).field_P = true;
        }
        for (var2 = 0; 16 > var2; var2++) {
            ((psa) this).field_T[var2] = 1048576;
        }
        super.a((byte) -105, 256, -1);
    }

    public psa() {
        ((psa) this).field_Q = new int[16];
        ((psa) this).field_T = new int[16];
        ((psa) this).field_S = 256;
        this.f(-377538388);
    }

    static {
    }
}
