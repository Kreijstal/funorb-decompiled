/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    int field_l;
    int field_x;
    int[] field_f;
    int field_d;
    int field_m;
    static String field_j;
    int field_t;
    int field_a;
    int field_e;
    static String field_b;
    static nq field_c;
    static String field_p;
    int field_v;
    int field_A;
    int field_y;
    int field_u;
    int field_q;
    int field_w;
    static boolean field_n;
    int field_i;
    int field_o;
    int[] field_h;
    static int field_k;
    int field_r;
    int[] field_g;
    int field_z;
    int field_s;

    final int[] b(byte param0) {
        int[] var2;
        int[] var3;
        int[] var4;
        int[] var5;
        int[] stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        L0: {
          var3 = new int[16];
          var5 = var3;
          var4 = var5;
          var2 = var4;
          stackIn_2_0 = (int[]) (var3);

          stackIn_2_1 = 3;

          if (this.field_t != 0) {
            stackIn_3_0 = (int[]) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = 200 * this.field_i / this.field_t;
            break L0;
          } else {
            stackIn_3_0 = (int[]) ((Object) stackIn_2_0);
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = 0;
            break L0;
          }
        }
        stackIn_3_0[stackIn_3_1] = stackIn_3_2;
        var3[2] = -this.field_r;
        var3[9] = -this.field_q;
        var3[0] = this.field_A;
        if (param0 <= -53) {
          var3[7] = -this.field_d;
          var3[6] = this.field_s;
          var3[11] = -this.field_a;
          var3[4] = this.field_x;
          var3[10] = this.field_y;
          if (0 != this.field_l) {
            L1: {
              var3[12] = (this.field_l + 2 * this.field_u) / (2 * this.field_l);
              var3[13] = (2 * this.field_w - -this.field_l) / (this.field_l * 2);
              var3[14] = (this.field_l + 2 * this.field_z) / (2 * this.field_l);
              stackIn_12_0 = (int[]) (var2);

              stackIn_12_1 = 15;

              if (this.field_a == 0) {
                stackIn_13_0 = (int[]) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = 100;
                break L1;
              } else {
                stackIn_13_0 = (int[]) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = (this.field_a + 201 * this.field_y) / ((this.field_y + this.field_a) * 2);
                break L1;
              }
            }
            stackIn_13_0[stackIn_13_1] = stackIn_13_2;
            var2[5] = this.field_o;
            var2[8] = this.field_m;
            var2[1] = this.field_v;
            return var2;
          } else {
            L2: {
              var5[14] = -1;
              var5[12] = -1;
              var5[13] = -1;
              stackIn_8_0 = (int[]) (var2);

              stackIn_8_1 = 15;

              if (this.field_a == 0) {
                stackIn_9_0 = (int[]) ((Object) stackIn_8_0);
                stackIn_9_1 = stackIn_8_1;
                stackIn_9_2 = 100;
                break L2;
              } else {
                stackIn_9_0 = (int[]) ((Object) stackIn_8_0);
                stackIn_9_1 = stackIn_8_1;
                stackIn_9_2 = (this.field_a + 201 * this.field_y) / ((this.field_y + this.field_a) * 2);
                break L2;
              }
            }
            stackIn_9_0[stackIn_9_1] = stackIn_9_2;
            var2[5] = this.field_o;
            var2[8] = this.field_m;
            var2[1] = this.field_v;
            return var2;
          }
        } else {
          return (int[]) null;
        }
    }

    final static void b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        nd[] var4 = null;
        sb var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        nd var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        nd[] var13 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = di.field_m * 100 / 1000 - 80;
            var2 = 465;
            var3 = 324 + (var1_int + 675);
            var13 = fe.field_C;
            var4 = var13;
            var5 = -99 % ((param0 - -2) / 55);
            var6 = 0;
            L1: while (true) {
              if (var13.length <= var6) {
                var4_ref = (sb) ((Object) rp.field_K.d(0));
                L2: while (true) {
                  if (var4_ref == null) {
                    L3: {
                      if (di.field_m != 0) {
                        break L3;
                      } else {
                        sg.a(true, false, 100, ra.field_c, tk.field_C);
                        sg.a(true, true, 800, n.field_l, tk.field_C);
                        break L3;
                      }
                    }
                    fieldTemp$0 = di.field_m + 1;
                    di.field_m = di.field_m + 1;
                    if (-951 == (fieldTemp$0 ^ -1)) {
                      jc.a(3, (byte) -113);
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    L4: {
                      var4_ref.field_o[var4_ref.field_q] = var4_ref.field_l;
                      var4_ref.field_i[var4_ref.field_q] = var4_ref.field_n;
                      fieldTemp$1 = var4_ref.field_q + 1;
                      var4_ref.field_q = var4_ref.field_q + 1;
                      if (fieldTemp$1 == 50) {
                        var4_ref.field_q = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var4_ref.field_p = var4_ref.field_p + var4_ref.field_r;
                    var4_ref.field_m = var4_ref.field_m + var4_ref.field_s;
                    var4_ref.field_j = var4_ref.field_j + var4_ref.field_m;
                    var4_ref.field_k = var4_ref.field_k + var4_ref.field_p;
                    var4_ref.field_n = var4_ref.field_n + var4_ref.field_j;
                    var4_ref.field_l = var4_ref.field_l + var4_ref.field_k;
                    var4_ref = (sb) ((Object) rp.field_K.a((byte) -71));
                    continue L2;
                  }
                }
              } else {
                L5: {
                  var7 = var13[var6];
                  if (var7.field_h == 0) {
                    break L5;
                  } else {
                    L6: {
                      var7.field_a = var7.field_a + var7.field_h;
                      if (200 <= var7.field_a) {
                        var7.field_h = -var7.field_h;
                        var8 = (float)(var7.field_e + -var2) / 500.0f;
                        var9 = (float)(var7.field_j - var3) / 500.0f;
                        var8 = (float)((double)var8 + (Math.random() - 0.5) / 5.0);
                        var9 = (float)((double)var9 + (Math.random() - 0.5) / 5.0);
                        var10 = 0.0f;
                        var11 = 0.0f;
                        rp.field_K.a((byte) -113, new sb((float)(var7.field_e - 5), (float)(var1_int + var7.field_j), 0.0f, 0.0f, var8 / 200.0f, var9 / 200.0f, var10, var11));
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (var7.field_a <= 0) {
                      var7.field_a = 0;
                      var7.field_h = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L7: {
                  if (var7.field_a != 0) {
                    break L7;
                  } else {
                    if (vc.a((byte) -39, 250) != 0) {
                      break L7;
                    } else {
                      if (75 < di.field_m) {
                        var7.field_h = 10;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "um.E(" + param0 + ')');
        }
    }

    final String[] a(int param0) {
        String[] array$0 = null;
        String[] array$1 = null;
        String[] var2;
        int var3;
        int var4;
        String[] var5;
        String[] stackIn_8_0;
        int stackIn_8_1;
        String stackIn_8_2;
        int stackIn_8_3;
        String[] stackIn_8_4;
        String[] stackIn_8_5;
        int stackIn_8_6;
        String[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        String stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        String[] stackIn_9_4 = null;
        String[] stackIn_9_5 = null;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        String[] stackIn_12_0;
        int stackIn_12_1;
        String stackIn_12_2;
        int stackIn_12_3;
        String[] stackIn_12_4;
        String[] stackIn_12_5;
        int stackIn_12_6;
        String[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        int stackIn_13_3 = 0;
        String[] stackIn_13_4 = null;
        String[] stackIn_13_5 = null;
        int stackIn_13_6 = 0;
        int stackIn_13_7 = 0;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          var5 = new String[16];
          var2 = var5;
          var5[0] = Integer.toString(this.field_A);
          var5[1] = Integer.toString(this.field_v);
          var5[2] = Integer.toString(this.field_r);
          if (this.field_t != 0) {
            var3 = (this.field_i * 20 - -this.field_t) / (this.field_t * 2);
            var2[3] = var3 / 10 + ej.field_j + var3 % 10;
            break L0;
          } else {
            var5[3] = qc.field_t;
            break L0;
          }
        }
        var2[4] = Integer.toString(this.field_x);
        var2[5] = Integer.toString(this.field_o);
        var2[6] = Integer.toString(this.field_s);
        var2[7] = Integer.toString(this.field_d);
        var2[8] = Integer.toString(this.field_m);
        if (param0 > 111) {
          var2[9] = Integer.toString(this.field_q);
          var2[10] = Integer.toString(this.field_y);
          var2[11] = Integer.toString(this.field_a);
          if (this.field_l != 0) {
            L1: {
              var2[12] = re.a(jl.field_O, 4371, new String[]{Integer.toString((this.field_l + this.field_u * 2) / (this.field_l * 2))});
              var2[13] = re.a(jl.field_O, 4371, new String[]{Integer.toString((2 * this.field_w - -this.field_l) / (2 * this.field_l))});
              var2[14] = re.a(jl.field_O, 4371, new String[]{Integer.toString((this.field_l + 2 * this.field_z) / (this.field_l * 2))});
              array$0 = new String[1];
              stackIn_12_0 = (String[]) (var2);

              stackIn_12_1 = 15;

              stackIn_12_2 = jl.field_O;

              stackIn_12_3 = 4371;

              stackIn_12_4 = (String[]) (array$0);

              stackIn_12_5 = (String[]) (array$0);

              stackIn_12_6 = 0;

              if (this.field_a != 0) {
                stackIn_13_0 = (String[]) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = (String) ((Object) stackIn_12_2);
                stackIn_13_3 = stackIn_12_3;
                stackIn_13_4 = (String[]) ((Object) stackIn_12_4);
                stackIn_13_5 = (String[]) ((Object) stackIn_12_5);
                stackIn_13_6 = stackIn_12_6;
                stackIn_13_7 = (this.field_y * 201 + this.field_a) / (2 * (this.field_a + this.field_y));
                break L1;
              } else {
                stackIn_13_0 = (String[]) ((Object) stackIn_12_0);
                stackIn_13_1 = stackIn_12_1;
                stackIn_13_2 = (String) ((Object) stackIn_12_2);
                stackIn_13_3 = stackIn_12_3;
                stackIn_13_4 = (String[]) ((Object) stackIn_12_4);
                stackIn_13_5 = (String[]) ((Object) stackIn_12_5);
                stackIn_13_6 = stackIn_12_6;
                stackIn_13_7 = 100;
                break L1;
              }
            }
            stackIn_13_5[stackIn_13_6] = Integer.toString(stackIn_13_7);
            stackIn_13_0[stackIn_13_1] = re.a(stackIn_13_2, stackIn_13_3, stackIn_13_4);
            return var2;
          } else {
            L2: {
              var2[14] = qc.field_t;
              var2[12] = qc.field_t;
              var2[13] = qc.field_t;
              array$1 = new String[1];
              stackIn_8_0 = (String[]) (var2);

              stackIn_8_1 = 15;

              stackIn_8_2 = jl.field_O;

              stackIn_8_3 = 4371;

              stackIn_8_4 = (String[]) (array$1);

              stackIn_8_5 = (String[]) (array$1);

              stackIn_8_6 = 0;

              if (this.field_a != 0) {
                stackIn_9_0 = (String[]) ((Object) stackIn_8_0);
                stackIn_9_1 = stackIn_8_1;
                stackIn_9_2 = (String) ((Object) stackIn_8_2);
                stackIn_9_3 = stackIn_8_3;
                stackIn_9_4 = (String[]) ((Object) stackIn_8_4);
                stackIn_9_5 = (String[]) ((Object) stackIn_8_5);
                stackIn_9_6 = stackIn_8_6;
                stackIn_9_7 = (this.field_y * 201 + this.field_a) / (2 * (this.field_a + this.field_y));
                break L2;
              } else {
                stackIn_9_0 = (String[]) ((Object) stackIn_8_0);
                stackIn_9_1 = stackIn_8_1;
                stackIn_9_2 = (String) ((Object) stackIn_8_2);
                stackIn_9_3 = stackIn_8_3;
                stackIn_9_4 = (String[]) ((Object) stackIn_8_4);
                stackIn_9_5 = (String[]) ((Object) stackIn_8_5);
                stackIn_9_6 = stackIn_8_6;
                stackIn_9_7 = 100;
                break L2;
              }
            }
            stackIn_9_5[stackIn_9_6] = Integer.toString(stackIn_9_7);
            stackIn_9_0[stackIn_9_1] = re.a(stackIn_9_2, stackIn_9_3, stackIn_9_4);
            return var2;
          }
        } else {
          return (String[]) null;
        }
    }

    final static bi[] a(int param0, bc param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        bi[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vd.a(param0, param1, param2, 2)) {
              L1: {
                if (param3 <= -70) {
                  break L1;
                } else {
                  field_p = (String) null;
                  break L1;
                }
              }
              stackIn_6_0 = ti.a(-126);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("um.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bi[]) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_p = null;
        int var1 = 109 / ((param0 - 63) / 51);
        field_b = null;
        field_j = null;
    }

    um(int param0) {
        this.field_e = param0;
        this.field_h = new int[100];
        this.field_g = new int[100];
        this.field_f = new int[100];
    }

    static {
        field_b = "Please enter a year between <%0> and <%1>";
        field_p = "Invite";
    }
}
