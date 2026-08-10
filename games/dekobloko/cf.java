/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cf {
    static int field_f;
    static w field_d;
    static String field_c;
    nf[] field_a;
    static String field_b;
    static w field_h;
    static String field_e;
    static String field_j;
    static boolean field_i;
    static String field_g;

    final static String a(int param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = client.field_A ? 1 : 0;
        if (param1 <= (long)param0) {
            return null;
        }
        if (6582952005840035281L <= param1) {
            return null;
        }
        if (0L == param1 % 37L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (0L != var4) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (-1L != (param1 ^ -1L)) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = db.field_g[(int)(var7 + -(37L * param1))];
            if (!(var9 != 95)) {
                var10 = -1 + var6.length();
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        mk var4 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2 instanceof byte[]) {
                var3 = (byte[]) (param2);
                if (!param0) {
                  stackIn_9_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_7_0 = jd.a(0, var3);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                if (!(param2 instanceof mk)) {
                  L1: {
                    if (param1 > 18) {
                      break L1;
                    } else {
                      cf.a(52, 9L);
                      break L1;
                    }
                  }
                  throw new IllegalArgumentException();
                } else {
                  var4 = (mk) (param2);
                  stackIn_12_0 = var4.a(256);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("cf.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final int a(boolean param0) {
        int var2;
        nf[] var3;
        int var4;
        nf var5;
        int var7;
        int var6;
        var7 = client.field_A ? 1 : 0;
        var2 = -1;
        if (!param0) {
          L0: {
            if (this.field_a != null) {
              var3 = this.field_a;
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.b(-6375);
                    if (var2 < var6) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return 85;
        }
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == -1) {
          L0: {
            L1: {
              if (this.field_a == null) {
                break L1;
              } else {
                if ((this.field_a.length ^ -1) >= -1) {
                  break L1;
                } else {
                  stackIn_6_0 = this.field_a[this.field_a.length + -1].field_i - this.field_a[0].field_c;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0;
        } else {
          return -39;
        }
    }

    public static void a(byte param0) {
        if (param0 != 126) {
            field_g = (String) null;
        }
        field_c = null;
        field_d = null;
        field_h = null;
        field_g = null;
        field_e = null;
        field_j = null;
        field_b = null;
    }

    final static String a(int param0) {
        if (!(ca.field_vb >= 2)) {
            return ef.field_U;
        }
        if (!(null == vj.field_a)) {
            if (!vj.field_a.a((byte) 121)) {
                return fe.field_a;
            }
            return eb.field_n;
        }
        if (!sk.field_f.a((byte) 121)) {
            return ng.field_l;
        }
        if (!(sk.field_f.a("commonui", (byte) 118))) {
            return bn.field_d + " - " + sk.field_f.a(-128, "commonui") + "%";
        }
        if (!(rc.field_k.a((byte) 121))) {
            return ne.field_d;
        }
        if (param0 != -11777) {
            cf.a(-68);
        }
        if (!rc.field_k.a("commonui", (byte) 124)) {
            return un.field_a + " - " + rc.field_k.a(-125, "commonui") + "%";
        }
        if (!ph.field_Fb.a((byte) 121)) {
            return bk.field_Ob;
        }
        if (!(ph.field_Fb.a(false))) {
            return bg.field_c + " - " + ph.field_Fb.b((byte) -61) + "%";
        }
        return wm.field_k;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        nf var5 = null;
        int var6 = client.field_A ? 1 : 0;
        nf[] var7 = this.field_a;
        nf[] var3 = var7;
        if (param0 != -94) {
            cf.a(102);
        }
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (param1 < var5.field_a.length) {
                return var5.field_a[param1];
            }
            param1 = param1 - (var5.field_a.length - 1);
        }
        return 0;
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        nf var6 = null;
        int var7 = 0;
        int var8 = client.field_A ? 1 : 0;
        if (param2 != -31917) {
            cf.a(-31, -100L);
        }
        if (null == this.field_a || this.field_a.length == 0 || param1 < this.field_a[0].field_c) {
            return -1;
        }
        if (param1 > this.field_a[this.field_a.length - 1].field_i) {
            return -1;
        }
        if (1 == this.field_a.length) {
            return this.field_a[0].a(param0, 109);
        }
        int var4 = 0;
        for (var5 = 0; this.field_a.length > var5; var5++) {
            var6 = this.field_a[var5];
            if (var6.field_c <= param1) {
                if (!(param1 > var6.field_i)) {
                    var7 = var6.a(param0, 109);
                    if (-1 == var7) {
                        return -1;
                    }
                    return var4 + var7;
                }
            }
            var4 = var4 + (-1 + var6.field_a.length);
        }
        return -1;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        nf var4 = null;
        int var5 = client.field_A ? 1 : 0;
        if (param0) {
            return -107;
        }
        for (var3 = 0; var3 < this.field_a.length; var3++) {
            var4 = this.field_a[var3];
            if (var4.field_a.length > param1) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_a.length);
        }
        return this.field_a.length;
    }

    final int a(byte param0, int param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            if (param0 == 64) {
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L1: while (true) {
                if (var7 <= var8) {
                  if (var5_int > 0) {
                    stackIn_17_0 = (param3 - param1 << -139770712) / var5_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return 0;
                  }
                } else {
                  L2: {
                    var9 = param2.charAt(var8);
                    if (-61 != (var9 ^ -1)) {
                      if (var9 != 62) {
                        if (var6 != 0) {
                          break L2;
                        } else {
                          if (var9 != 32) {
                            break L2;
                          } else {
                            var5_int++;
                            break L2;
                          }
                        }
                      } else {
                        var6 = 0;
                        break L2;
                      }
                    } else {
                      var6 = 1;
                      break L2;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -43;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("cf.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_17_0;
        }
    }

    final static void a(int param0, byte param1, int[] param2, int param3, int param4) {
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var10 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 57) {
                break L1;
              } else {
                var9 = (int[]) null;
                cf.a(-62, (byte) 71, (int[]) null, 113, -87);
                break L1;
              }
            }
            param4--;
            L2: while (true) {
              if (param4 < 0) {
                break L0;
              } else {
                var10 = param2;
                var5 = var10;
                var6 = param0;
                var7 = param3;
                var10[var6] = var7 - -(lb.a(16711422, var10[var6]) >> -59233087);
                param0++;
                param4--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5_ref);

            stackIn_10_1 = new StringBuilder().append("cf.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_f = 640;
        field_e = "FIGHT!";
        field_j = "Quit";
        field_b = "Game options changed (<%0>)";
        field_g = "Honour";
    }
}
