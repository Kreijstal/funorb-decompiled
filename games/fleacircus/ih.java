/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends ni {
    private int field_o;
    private pc field_n;
    static sf field_l;
    static String field_m;

    final void k(int param0) {
        this.field_o = param0 * this.field_i;
    }

    final void m(int param0) {
        this.field_i = (this.field_o - -7) / param0;
    }

    ih(byte[] param0) {
        super(param0);
    }

    final int f(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (param0 != 47) {
          this.m(-38);
          fieldTemp$2 = this.field_i;
          this.field_i = this.field_i + 1;
          return this.field_k[fieldTemp$2] - this.field_n.a(995108848) & 255;
        } else {
          fieldTemp$3 = this.field_i;
          this.field_i = this.field_i + 1;
          return this.field_k[fieldTemp$3] - this.field_n.a(995108848) & 255;
        }
    }

    public static void j(int param0) {
        field_m = null;
        if (param0 != 8) {
            return;
        }
        field_l = null;
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_k[fieldTemp$0] = (byte)(this.field_n.a(995108848) + param1);
        if (param0 != 8) {
            this.field_n = (pc) null;
        }
    }

    final int b(int param0, byte param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = fleas.field_A ? 1 : 0;
        var3 = this.field_o >> 41183555;
        if (param1 == -87) {
          var4 = 8 + -(this.field_o & 7);
          var5 = 0;
          this.field_o = this.field_o + param0;
          L0: while (true) {
            if (var4 >= param0) {
              L1: {
                if (var4 == param0) {
                  var5 = var5 + (ek.field_d[var4] & this.field_k[var3]);
                  break L1;
                } else {
                  var5 = var5 + (this.field_k[var3] >> var4 + -param0 & ek.field_d[param0]);
                  break L1;
                }
              }
              return var5;
            } else {
              incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((ek.field_d[var4] & this.field_k[incrementValue$2]) << param0 - var4);
              param0 = param0 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          ih.j(33);
          var4 = 8 + -(this.field_o & 7);
          var5 = 0;
          this.field_o = this.field_o + param0;
          L2: while (true) {
            if (var4 >= param0) {
              L3: {
                if (var4 == param0) {
                  var5 = var5 + (ek.field_d[var4] & this.field_k[var3]);
                  break L3;
                } else {
                  var5 = var5 + (this.field_k[var3] >> var4 + -param0 & ek.field_d[param0]);
                  break L3;
                }
              }
              return var5;
            } else {
              incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((ek.field_d[var4] & this.field_k[incrementValue$3]) << param0 - var4);
              param0 = param0 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final static void l(int param0) {
        if (param0 != 255) {
          field_l = (sf) null;
          af.a(ef.field_j, true, oa.field_o, (byte) 54);
          ud.field_c = true;
          return;
        } else {
          af.a(ef.field_j, true, oa.field_o, (byte) 54);
          ud.field_c = true;
          return;
        }
    }

    ih(int param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 66) {
                break L1;
              } else {
                ih.j(-43);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (param1 <= var5_int) {
                break L0;
              } else {
                fieldTemp$2 = this.field_i;
                this.field_i = this.field_i + 1;
                param3[param2 + var5_int] = (byte)(this.field_k[fieldTemp$2] + -this.field_n.a(995108848));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ih.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void a(int[] param0, byte param1) {
        try {
            this.field_n = new pc(param0);
            if (param1 != 12) {
                this.e(-95, -126);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ih.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_m = "Flea Circus";
    }
}
