/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq {
    static String field_f;
    private int[][] field_k;
    private int field_e;
    private int field_a;
    private fd[] field_c;
    static int[] field_d;
    private int field_g;
    static String field_b;
    private nj field_j;
    private int field_h;
    boolean field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        L0: {
          if (param5 < ap.field_e) {
            el.a(param1, (byte) -124, param2, param5, param0, param4, param7, param3);
            break L0;
          } else {
            if (ib.field_a < param0) {
              el.a(param1, (byte) -124, param2, param5, param0, param4, param7, param3);
              break L0;
            } else {
              if (param7 < ua.field_e) {
                el.a(param1, (byte) -124, param2, param5, param0, param4, param7, param3);
                break L0;
              } else {
                if (cj.field_D < param4) {
                  el.a(param1, (byte) -124, param2, param5, param0, param4, param7, param3);
                  break L0;
                } else {
                  fn.a(param0, param5, param7, param4, param1, (byte) -11, param2, param3);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (param6 == 0) {
            break L1;
          } else {
            aq.a(-63, 66, 94, 110, -117, 90, -38, -16);
            break L1;
          }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        for (var2 = 0; var2 < this.field_h; var2++) {
            this.field_k[var2] = null;
        }
        this.field_c = null;
        if (param0) {
            this.field_g = 40;
        }
        this.field_k = (int[][]) null;
        this.field_j.c(0);
        this.field_j = null;
    }

    final int[] a(int param0, byte param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int var3;
        fd var4;
        fd var5;
        int var6;
        var6 = Vertigo2.field_L ? 1 : 0;
        var3 = 28 % ((param1 - 6) / 48);
        if (this.field_h != this.field_g) {
          if (-2 == (this.field_h ^ -1)) {
            L0: {
              stackIn_15_0 = this;

              if (this.field_a == param0) {
                stackIn_16_0 = this;
                stackIn_16_1 = 0;
                break L0;
              } else {
                stackIn_16_0 = this;
                stackIn_16_1 = 1;
                break L0;
              }
            }
            ((aq) (this)).field_i = stackIn_16_1 != 0;
            this.field_a = param0;
            return this.field_k[0];
          } else {
            L1: {
              var4 = this.field_c[param0];
              var5 = var4;
              var5 = var4;
              if (var4 != null) {
                this.field_i = false;
                break L1;
              } else {
                L2: {
                  this.field_i = true;
                  if (this.field_h <= this.field_e) {
                    var5 = (fd) ((Object) this.field_j.c((byte) -127));
                    var4 = new fd(param0, var5.field_n);
                    this.field_c[var5.field_r] = null;
                    var5.c(2);
                    break L2;
                  } else {
                    var4 = new fd(param0, this.field_e);
                    this.field_e = this.field_e + 1;
                    break L2;
                  }
                }
                this.field_c[param0] = var4;
                break L1;
              }
            }
            this.field_j.a(var4, (byte) 27);
            return this.field_k[var4.field_n];
          }
        } else {
          L3: {
            stackIn_3_0 = this;

            if (null != this.field_c[param0]) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L3;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L3;
            }
          }
          ((aq) (this)).field_i = stackIn_4_1 != 0;
          this.field_c[param0] = nb.field_F;
          return this.field_k[param0];
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_d = null;
        field_f = null;
        if (param0 > -80) {
            aq.b(79);
        }
    }

    final static void a(mp param0, byte param1, int param2, int param3) {
        try {
            int var4_int = 57 / ((param1 - -27) / 53);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "aq.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int[][] a(int param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 100) {
            this.field_j = (nj) null;
        }
        if (this.field_h != this.field_g) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = 0; var2 < this.field_h; var2++) {
            this.field_c[var2] = nb.field_F;
        }
        return this.field_k;
    }

    aq(int param0, int param1, int param2) {
        this.field_e = 0;
        this.field_a = -1;
        this.field_j = new nj();
        this.field_i = false;
        this.field_h = param0;
        this.field_g = param1;
        this.field_c = new fd[this.field_g];
        this.field_k = new int[this.field_h][param2];
    }

    static {
        field_d = new int[]{100, 100, 200, 300, 200, 300, 300, 500, 300, 1000, 300, 300, 200};
        field_b = "Decline invitation to <%0>'s game";
        field_f = "Offline";
    }
}
