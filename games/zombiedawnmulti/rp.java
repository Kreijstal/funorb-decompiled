/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp {
    int field_k;
    static ja[] field_r;
    static String field_b;
    private int field_a;
    static cj field_l;
    int field_i;
    private int field_v;
    int[] field_t;
    private byte[] field_o;
    private int field_u;
    private int field_h;
    long field_f;
    long field_n;
    static int field_q;
    int[] field_p;
    int[] field_c;
    static int field_d;
    static int field_j;
    int[] field_s;
    int[] field_m;
    int[] field_g;
    static String field_e;

    public static void a(int param0) {
        if (param0 != 5) {
          return;
        }
        try {
          field_b = null;
          field_l = null;
          field_e = null;
          field_r = null;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "rp.I(" + param0 + ')');
        }
    }

    private final int b(int param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          fieldTemp$3 = this.field_u;
          this.field_u = this.field_u + 1;
          var2_int = 255 & this.field_o[fieldTemp$3];
          if (param0 != -1458) {
            this.field_a = 15;
          }
          fieldTemp$4 = this.field_u;
          this.field_u = this.field_u + 1;
          var3 = 255 & this.field_o[fieldTemp$4];
          fieldTemp$5 = this.field_u;
          this.field_u = this.field_u + 1;
          var4 = this.field_o[fieldTemp$5] & 255;
          stackIn_4_0 = var4 | (var2_int << 16 | var3 << 8);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.J(" + param0 + ')');
        }
    }

    final void e(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 >= 0 &&
            param1 < this.field_t.length) {
            if (param0 != -6821) {
              field_l = (cj) null;
            }
            this.field_f = this.field_f | 1L << param1;
            this.field_t[param1] = cr.a(param1, -107);
            this.c((byte) -103);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.S(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= 0 &&
            param2 < this.field_t.length) {
            this.field_t[param2] = this.field_t[param2] + param1;
            var4_int = -102 / ((param0 + 43) / 40);
            if (this.field_t[param2] >= cr.a(param2, -94)) {
              this.e(-6821, param2);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "rp.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_25_0 = false;
        boolean stackIn_31_0 = false;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_24_0;
        boolean[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2 = new boolean[63];
          var3 = 0;
          while (true) {
            stackIn_3_0 = ~var3;
            stackIn_3_1 = -64;
            if (stackIn_3_0 > stackIn_3_1) {
              var4 = em.field_ab[var3];
              stackIn_22_0 = 0;
              if (var7 == 0) {
                var5 = stackIn_22_0;
                while (var4.length > var5) {
                  var6 = var4[var5];
                  stackIn_3_0 = -256;
                  stackIn_3_1 = ~var6;
                  if (stackIn_3_0 != stackIn_3_1) {
                    if (this.c(127, var3)) {
                      this.field_f = this.field_f | 1L << var6;
                      this.field_t[var6] = cr.a(var6, -117);
                    }
                    if (this.field_t[var3] >= cr.a(var3, -81)) {
                      this.field_f = this.field_f | 1L << var3;
                    }
                    var2[var6] = true;
                  }
                  var5++;
                }
                var3++;
                continue;
              }
            } else {
              stackIn_22_0 = 0;
            }
            var3 = stackIn_22_0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var3 >= 63))) {
              stackOut_24_0 = var2[var3];
              stackIn_39_0 = stackOut_24_0 ? 1 : 0;
              stackIn_25_0 = stackOut_24_0;
              if (var7 == 0) {
                stackIn_31_0 = !(stackIn_25_0);
                if (stackIn_31_0 & this.c(127, var3) &&
                  this.field_t[var3] >= cr.a(var3, -112)) {
                  this.field_f = this.field_f | 1L << var3;
                }
                var3++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_39_0 = param0;
            }
            if (stackIn_39_0 < 22) {
              field_j = -28;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "rp.H(" + param0 + ')');
        }
    }

    final void a(int param0, byte[] param1) {
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_38_2 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_21_0Lifetime1;
        int stackIn_21_1Lifetime1;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          this.field_o = param1;
          this.field_u = param0;
          this.field_a = this.d((byte) 45);
          boolean decompiledSharedTail0 = !(this.field_a >= 4);
          if (!decompiledSharedTail0) {
            this.field_i = this.d((byte) 97);
            this.field_k = (12 & this.field_i) >> 2;
            decompiledSharedTail0 = (var6 != 0);
          }
          if (decompiledSharedTail0) {
            this.field_c[0] = this.b(-1458);
            this.field_p[0] = this.b(param0 - 1458);
            this.field_c[1] = this.b(-1458);
            this.field_p[1] = this.b(-1458);
          }
          var3_int = 0;
          L4: while (true) {
            if (var3_int < 5) {
              this.field_m[var3_int] = this.d((byte) 69);
              stackIn_21_0 = ~this.field_a;
              stackIn_21_1 = -4;
              if (var6 != 0) {
                if (stackIn_21_0 > stackIn_21_1) {
                  this.field_s[var3_int] = this.d((byte) 97);
                  var3_int++;
                  return;
                }
                break L4;
              }
              if (stackIn_21_0 <= stackIn_21_1) {
                this.field_g[var3_int] = this.d((byte) 83);
              } else {
                this.field_g[var3_int] = 255;
              }
              var3_int++;
              continue;
            }
            var3_int = 0;
            while (true) {
              stackIn_21_0Lifetime1 = ~var3_int;
              stackIn_21_1Lifetime1 = -4;
              if (stackIn_21_0Lifetime1 <= stackIn_21_1Lifetime1) {
                break;
              }
              this.field_s[var3_int] = this.d((byte) 97);
              var3_int++;
              if (var6 != 0) {
                return;
              }
            }
            break;
          }
          if (1 <= this.field_a) {
            this.field_v = this.d(-16777216);
            this.field_h = this.d((byte) 84);
            this.field_n = this.c(param0 ^ 16741);
            this.a((byte) 62);
            var3_int = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var3_int >= 63))) {
              if (var6 == 0) {
                stackIn_37_0 = this.field_t;
                stackIn_37_1 = var3_int;
                if (this.d(var3_int, 53)) {
                  stackIn_38_2 = cr.a(var3_int, -95);
                } else {
                  stackIn_38_2 = 0;
                }
                stackIn_37_0[stackIn_37_1] = stackIn_38_2;
                var3_int++;
                continue;
              }
              break;
            }
            if ((decompiledNaturalLoopExit0) &&
              (this.field_a < 4)) {
              return;
            }
            var3_int = this.d((byte) 79);
            var4 = 0;
            do {
              if (var4 >= var3_int) {
                this.a((byte) 106);
                break;
              }
              var5 = this.d((byte) 85);
              this.field_t[var5] = this.f((byte) -53);
              var4++;
            } while (var6 == 0);
            if (this.field_a < 5) {
              return;
            }
            this.field_f = this.c(16741);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_57_0 = var3;
          stackIn_57_1 = new StringBuilder().append("rp.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(')').toString());
        }
    }

    final boolean g(int param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 4) {
            this.d(-106, -13);
          }
          stackIn_4_0 = this.a(param0, (byte) 6, 1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.W(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = 0;
          while (true) {
            stackIn_3_0 = 63;
            stackIn_3_1 = var2_int;
            if (stackIn_3_0 > stackIn_3_1) {
              stackOut_4_0 = this.c(127, var2_int);
              stackIn_23_0 = stackOut_4_0 ? 1 : 0;
              stackIn_5_0 = stackOut_4_0;
              if (var7 == 0) {
                if (!stackIn_5_0) {
                  var3 = 1;
                  var4 = em.field_ab[var2_int];
                  var5 = 0;
                  while (var4.length > var5) {
                    var6 = var4[var5];
                    stackIn_3_0 = var6;
                    stackIn_3_1 = 255;
                    if (stackIn_3_0 != stackIn_3_1 &&
                      !this.d(var6, 53)) {
                      var3 = 0;
                    }
                    var5++;
                  }
                  if (var3 != 0) {
                    this.field_n = this.field_n | 1L << var2_int;
                  }
                }
                var2_int++;
                continue;
              }
            } else {
              stackIn_23_0 = param0;
            }
            if (stackIn_23_0 > -90) {
              this.field_a = 70;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "rp.T(" + param0 + ')');
        }
    }

    final int g(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = 3;
          var3 = 0;
          var4 = -88 % ((param0 - 68) / 53);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 >= 3))) {
            stackIn_17_0 = -49;
            stackIn_17_1 = ~this.field_s[var3];
            if (var5 == 0) {
              if (stackIn_17_0 != stackIn_17_1) {
                if (this.field_s[var3] == 44) {
                  var2_int++;
                }
              } else {
                var2_int++;
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_17_0 = 5;
            stackIn_17_1 = var2_int;
          }
          if (stackIn_17_0 < stackIn_17_1) {
            var2_int = 5;
          }
          stackIn_20_0 = var2_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.D(" + param0 + ')');
        }
    }

    final int b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1) {
            stackIn_7_0 = ((this.field_i & 1) != 0) ? 1 : 0;
            return stackIn_7_0;
          }
          stackIn_2_0 = 1;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.C(" + param0 + ')');
        }
    }

    private final int f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_u = this.field_u + 2;
          if (param0 == -53) {
            stackIn_4_0 = (255 & this.field_o[-1 + this.field_u]) + ((255 & this.field_o[this.field_u - 2]) << 8);
            return stackIn_4_0;
          }
          stackIn_2_0 = 116;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.V(" + param0 + ')');
        }
    }

    final static void e(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_12_0 = 0;
        ml stackIn_55_0 = null;
        RuntimeException decompiledCaughtException = null;
        ga var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        Object var3_ref = null;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ml var6 = null;
        String var7 = null;
        ml var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3_refLifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        ml var6Lifetime1;
        int var3Lifetime1;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var1 = s.field_e;
          var2 = var1.g(31365);
          if (var2 == 0) {
            if (bh.field_f == null) {
              bh.field_f = new sc(128);
              fn.field_d = 0;
            }
            stackIn_12_0 = (var1.g(31365) != 1) ? 0 : 1;
            var3 = stackIn_12_0;
            var4_ref_String = var1.f((byte) -29);
            if (var3 == 0) {
              var5 = var4_ref_String;
            }
            if (var3 != 0 ||
              var9 != 0) {
              var5 = var1.f((byte) -19);
            }
            var6 = md.a((byte) -55, var4_ref_String);
            var7 = var1.f((byte) -89);
            var8 = tg.a((CharSequence) ((Object) var4_ref_String), false);
            if (var8 == null) {
              var8 = var4_ref_String;
            }
            if (var6 == null) {
              var6 = md.a((byte) 105, var7);
              if (null != var6) {
                bh.field_f.a(-1, var6, (long)var8.hashCode());
              }
            }
            if (var6 == null) {
              var6 = new ml();
              bh.field_f.a(-1, var6, (long)var8.hashCode());
              fieldTemp$0 = fn.field_d;
              fn.field_d = fn.field_d + 1;
              var6.field_Mb = fieldTemp$0;
              jf.field_d.a(var6, false);
            }
            var6.field_Hb = var4_ref_String;
            var6.field_Pb = var5;
            var6.field_Kb = var7;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (1 == ge.field_zb) {
                ge.field_zb = 2;
              }
              return;
            }
            if (3 == var2) {
              if (2 == ge.field_zb) {
                ge.field_zb = 1;
              }
              return;
            }
            if (var2 != 4) {
              bd.a("F1: " + ci.a(0), (Throwable) null, false);
              ak.a((byte) -119);
              var3Lifetime1 = 67 % ((-12 - param0) / 48);
              return;
            }
            ge.field_zb = 1;
            var3_ref = var1.f((byte) -119);
            ta.field_ob = ((String) (var3_ref)).intern();
            var4 = var1.g(31365);
            gi.a((byte) -97, var4);
            return;
          }
          if (ol.field_o == null) {
            ol.field_o = new sc(128);
            dc.field_Fb = 0;
          }
          var3_refLifetime1 = var1.f((byte) -49);
          if (((String) (var3_refLifetime1)).equals("")) {
            var3_refLifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.f((byte) -14);
          var5Lifetime1 = var1.f((byte) -45);
          var6Lifetime1 = dn.a(var4_ref_StringLifetime1, false);
          if (null == var6Lifetime1) {
            var6Lifetime1 = dn.a(var5Lifetime1, false);
            if (var6Lifetime1 != null) {
              ol.field_o.a(-1, var6Lifetime1, (long)tg.a((CharSequence) ((Object) var4_ref_StringLifetime1), false).hashCode());
            }
          }
          if (var6Lifetime1 == null) {
            var6Lifetime1 = new ml();
            ol.field_o.a(-1, var6Lifetime1, (long)tg.a((CharSequence) ((Object) var4_ref_StringLifetime1), false).hashCode());
            fieldTemp$1 = dc.field_Fb;
            dc.field_Fb = dc.field_Fb + 1;
            var6Lifetime1.field_Mb = fieldTemp$1;
            ro.field_M.a(var6Lifetime1, false);
          }
          if (null != var3_refLifetime1) {
            var3_refLifetime1 = ((String) (var3_refLifetime1)).intern();
          }
          var6Lifetime1.field_Nb = (String) (var3_refLifetime1);
          var6Lifetime1.field_Kb = var5Lifetime1;
          var6Lifetime1.field_Hb = var4_ref_StringLifetime1;
          var6Lifetime1.a(true);
          var7_ref = (ml) (ro.field_M.c(116));
          L15: while (true) {
            if (var7_ref != null) {
              stackIn_55_0 = var6Lifetime1;
              if (var9 != 0) {
                break L15;
              }
              if (md.a(stackIn_55_0, (byte) -49, var7_ref)) {
                var7_ref = (ml) (ro.field_M.b(6));
                continue;
              }
            }
            stackIn_55_0 = var7_ref;
            break;
          }
          if (stackIn_55_0 == null) {
            ro.field_M.a(var6Lifetime1, false);
            if (var9 == 0) {
              return;
            }
          }
          vc.a(var7_ref, var6Lifetime1, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "rp.K(" + param0 + ')');
        }
    }

    private final void a(long param0, int param1) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          fieldTemp$8 = this.field_u;
          this.field_u = this.field_u + 1;
          this.field_o[fieldTemp$8] = (byte)(int)(param0 >> 56);
          fieldTemp$9 = this.field_u;
          this.field_u = this.field_u + 1;
          this.field_o[fieldTemp$9] = (byte)(int)(param0 >> 48);
          fieldTemp$10 = this.field_u;
          this.field_u = this.field_u + 1;
          this.field_o[fieldTemp$10] = (byte)(int)(param0 >> 40);
          fieldTemp$11 = this.field_u;
          this.field_u = this.field_u + 1;
          this.field_o[fieldTemp$11] = (byte)(int)(param0 >> 32);
          fieldTemp$12 = this.field_u;
          this.field_u = this.field_u + 1;
          this.field_o[fieldTemp$12] = (byte)(int)(param0 >> 24);
          fieldTemp$13 = this.field_u;
          this.field_u = this.field_u + 1;
          this.field_o[fieldTemp$13] = (byte)(int)(param0 >> 16);
          if (param1 != -30502) {
            this.e(13, 118);
          }
          fieldTemp$14 = this.field_u;
          this.field_u = this.field_u + 1;
          this.field_o[fieldTemp$14] = (byte)(int)(param0 >> 8);
          fieldTemp$15 = this.field_u;
          this.field_u = this.field_u + 1;
          this.field_o[fieldTemp$15] = (byte)(int)param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "rp.P(" + param0 + ',' + param1 + ')');
        }
    }

    private final int d(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_u = this.field_u + 4;
          if (param0 == -16777216) {
            stackIn_4_0 = (255 & this.field_o[-1 + this.field_u]) + (((this.field_o[-3 + this.field_u] & 255) << 16) + (-16777216 & this.field_o[this.field_u - 4] << 24)) + ((this.field_o[this.field_u - 2] & 255) << 8);
            return stackIn_4_0;
          }
          stackIn_2_0 = 34;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.G(" + param0 + ')');
        }
    }

    final boolean d(int param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 53) {
            field_j = 53;
          }
          stackIn_7_0 = (0L != (1L << param0 & this.field_f));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.Q(" + param0 + ',' + param1 + ')');
        }
    }

    final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_i = this.field_i ^ 1;
          if (param0 >= -102) {
            return;
          }
          if (fb.field_e != null) {
            fb.field_e.b((byte) 37);
          }
          we.field_g[47] = vn.field_d[ll.field_k.b((byte) -1)];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.O(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -1) {
            this.field_a = -48;
          }
          fieldTemp$1 = this.field_u;
          this.field_u = this.field_u + 1;
          this.field_o[fieldTemp$1] = (byte)tq.b(255, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.B(" + param0 + ',' + param1 + ')');
        }
    }

    final byte[] f(int param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_33_0 = 0;
        byte[] stackIn_37_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_18_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          this.field_a = 5;
          this.field_o = new byte[hd.field_u];
          this.field_u = 0;
          this.b(this.field_a, -1);
          this.field_i = this.field_i & -13;
          this.field_i = this.field_i | this.field_k << 2;
          this.b(this.field_i, -1);
          var2_int = 0;
          do {
            if (var2_int >= 5) {
              var2_int = 0;
              break;
            }
            this.b((int) (byte)this.field_m[var2_int], -1);
            this.b((int) (byte)this.field_g[var2_int], param0 ^ 16612);
            var2_int++;
          } while (var4 == 0);
          do {
            if (var2_int >= 3) {
              this.f(79, this.field_v);
              this.b(this.field_h, -1);
              this.a(this.field_n, -30502);
              fieldTemp$0 = this.field_u;
              this.field_u = this.field_u + 1;
              var2_int = fieldTemp$0;
              break;
            }
            this.b((int) (byte)this.field_s[var2_int], -1);
            var2_int++;
          } while (var4 == 0);
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 >= 63))) {
            stackOut_18_0 = this.c(param0 + 16740, var3);
            stackIn_33_0 = stackOut_18_0 ? 1 : 0;
            stackIn_19_0 = stackOut_18_0;
            if (var4 == 0) {
              if (stackIn_19_0 &&
                this.field_t[var3] != 0 &&
                !this.d(var3, 53)) {
                this.b(var3, -1);
                this.a((byte) -23, this.field_t[var3]);
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_33_0 = param0;
          }
          if (stackIn_33_0 != -16613) {
            field_l = (cj) null;
          }
          this.field_o[var2_int] = (byte)((this.field_u - var2_int) / 3);
          this.a(this.field_f, param0 ^ 14273);
          stackIn_37_0 = this.field_o;
          return stackIn_37_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.M(" + param0 + ')');
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param2 == 0) {
            stackIn_5_0 = this.c(127, param0);
            return stackIn_5_0;
          }
          if (this.c(127, param0)) {
            return true;
          }
          var4 = em.field_ab[param0];
          var5 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5 >= var4.length))) {
            var6 = var4[var5];
            stackIn_22_0 = ~var6;
            stackIn_22_1 = -256;
            if (var7 == 0) {
              if (stackIn_22_0 != stackIn_22_1 &&
                this.a(var6, (byte) 6, -1 + param2)) {
                return true;
              }
              var5++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_22_0 = param1;
            stackIn_22_1 = 6;
          }
          if (stackIn_22_0 != stackIn_22_1) {
            this.a(-101, 43, 112);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4_ref), "rp.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3_int >= 3))) {
            stackIn_11_0 = param0;
            stackIn_11_1 = this.field_s[var3_int];
            if (var4 == 0) {
              if (stackIn_11_0 == stackIn_11_1) {
                return true;
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = param1;
            stackIn_11_1 = -125;
          }
          if (stackIn_11_0 >= stackIn_11_1) {
            this.b((byte) -42);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final void f(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$0 = this.field_u;
        this.field_u = this.field_u + 1;
        this.field_o[fieldTemp$0] = (byte)tq.b(255, param1 >> 24);
        int fieldTemp$1 = this.field_u;
        this.field_u = this.field_u + 1;
        this.field_o[fieldTemp$1] = (byte)tq.b(param1 >> 16, 255);
        int fieldTemp$2 = this.field_u;
        this.field_u = this.field_u + 1;
        this.field_o[fieldTemp$2] = (byte)tq.b(255, param1 >> 8);
        if (param0 < 8) {
          return;
        }
        try {
          fieldTemp$3 = this.field_u;
          this.field_u = this.field_u + 1;
          this.field_o[fieldTemp$3] = (byte)tq.b(255, param1);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "rp.N(" + param0 + ',' + param1 + ')');
        }
    }

    private final int d(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 44) {
            stackIn_2_0 = 120;
            return stackIn_2_0;
          }
          fieldTemp$1 = this.field_u;
          this.field_u = this.field_u + 1;
          stackIn_4_0 = this.field_o[fieldTemp$1] & 255;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.BA(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        try {
          fieldTemp$0 = this.field_u;
          this.field_u = this.field_u + 1;
          this.field_o[fieldTemp$0] = (byte)tq.b(param1 >> 8, 255);
          fieldTemp$1 = this.field_u;
          this.field_u = this.field_u + 1;
          this.field_o[fieldTemp$1] = (byte)(tq.b(param1, 255) >> 0);
          if (param0 != -23) {
            this.field_c = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "rp.AA(" + param0 + ',' + param1 + ')');
        }
    }

    private final long c(int param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = (long)this.d(-16777216) & 4294967295L;
          if (param0 != 16741) {
            this.field_u = 18;
          }
          var4 = (long)this.d(-16777216) & 4294967295L;
          stackIn_4_0 = var4 + (var2_long << 32);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "rp.U(" + param0 + ')');
        }
    }

    final boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_12_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 126) {
            this.g(-39, 66);
          }
          if (param1 == 255) {
            return false;
          }
          stackIn_12_0 = ((1L << param1 & this.field_n) != 0L);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "rp.L(" + param0 + ',' + param1 + ')');
        }
    }

    rp() {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_a = 1;
        this.field_t = new int[63];
        this.field_p = new int[2];
        this.field_c = new int[2];
        this.field_s = new int[3];
        this.field_m = new int[5];
        this.field_g = new int[5];
        try {
          this.field_a = 1;
          this.field_c[0] = pd.a(-27486);
          this.field_c[1] = pd.a(-27486);
          this.field_p[0] = pd.a(-27486);
          this.field_p[1] = pd.a(-27486);
          this.field_i = 0;
          var1_int = 0;
          do {
            if (var1_int >= this.field_m.length) {
              var1_int = 0;
              break;
            }
            this.field_m[var1_int] = 255;
            var1_int++;
          } while (var2 == 0);
          do {
            if (this.field_g.length <= var1_int) {
              var1_int = 0;
              break;
            }
            this.field_g[var1_int] = 255;
            var1_int++;
          } while (var2 == 0);
          while (var1_int < this.field_s.length) {
            this.field_s[var1_int] = 255;
            var1_int++;
            if (var2 != 0) {
              return;
            }
          }
          this.field_n = ej.a((byte) -66);
          this.field_m[1] = 3;
          this.field_m[2] = 8;
          this.field_f = 0L;
          this.field_m[0] = 0;
          this.field_k = 0;
          this.field_s[0] = 58;
          this.field_s[2] = 53;
          this.field_s[1] = 59;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "rp.<init>()");
        }
    }

    static {
        field_b = "Meltdown";
        field_j = 5;
        field_d = 33;
        field_e = "You have 1 unread message!";
    }
}
