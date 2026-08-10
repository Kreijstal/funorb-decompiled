/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String field_g;
    static String field_b;
    private int field_h;
    String field_f;
    private int field_d;
    private sa[] field_a;
    private int field_e;
    float field_c;

    final static db[] a(String param0, String param1, sh param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var6 = null;
        db[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 22306) {
                break L1;
              } else {
                var6 = (int[]) null;
                td.a((int[]) null, false);
                break L1;
              }
            }
            var4_int = param2.c(param0, (byte) -89);
            var5 = param2.a(param1, -27964, var4_int);
            stackIn_3_0 = ij.a(var5, (byte) -117, param2, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("td.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int[] param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        ng stackIn_12_0 = null;
        ng stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        c var4_ref_c = null;
        int var4 = 0;
        int var5_int = 0;
        c var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (gg.field_b != uf.field_m) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!param1) {
                L1: {
                  var2_long = rf.c(0);
                  if (0 == sc.field_f) {
                    break L1;
                  } else {
                    if (0 <= kk.field_r) {
                      break L1;
                    } else {
                      L2: {
                        stackIn_12_0 = eb.field_f;

                        if (param1) {
                          stackIn_13_0 = (ng) ((Object) stackIn_12_0);
                          stackIn_13_1 = 0;
                          break L2;
                        } else {
                          stackIn_13_0 = (ng) ((Object) stackIn_12_0);
                          stackIn_13_1 = 1;
                          break L2;
                        }
                      }
                      var4_ref_c = (c) ((Object) ((ng) (Object) stackIn_13_0).a(stackIn_13_1 != 0));
                      if (var4_ref_c == null) {
                        break L1;
                      } else {
                        if ((var2_long ^ -1L) >= (var4_ref_c.field_l ^ -1L)) {
                          break L1;
                        } else {
                          var4_ref_c.b((byte) -119);
                          a.field_c = var4_ref_c.field_h.length;
                          ig.field_a.field_h = 0;
                          var5_int = 0;
                          L3: while (true) {
                            if (a.field_c <= var5_int) {
                              vh.field_b = df.field_a;
                              df.field_a = wl.field_i;
                              wl.field_i = pg.field_d;
                              pg.field_d = var4_ref_c.field_k;
                              stackIn_19_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              ig.field_a.field_j[var5_int] = var4_ref_c.field_h[var5_int];
                              var5_int++;
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L4: while (true) {
                  L5: {
                    if (-1 < (kk.field_r ^ -1)) {
                      ig.field_a.field_h = 0;
                      if (!a.b(1, 10343)) {
                        stackIn_26_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        kk.field_r = ig.field_a.i((byte) -76);
                        ig.field_a.field_h = 0;
                        a.field_c = param0[kk.field_r];
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  if (!dc.d(2)) {
                    stackIn_31_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if (sc.field_f != 0) {
                      L6: {
                        var4 = sc.field_f;
                        if (0.0 == ug.field_u) {
                          break L6;
                        } else {
                          var4 = (int)((double)var4 + q.field_a.nextGaussian() * ug.field_u);
                          if (-1 >= (var4 ^ -1)) {
                            break L6;
                          } else {
                            var4 = 0;
                            break L6;
                          }
                        }
                      }
                      var5 = new c((long)var4 + var2_long, kk.field_r, new byte[a.field_c]);
                      var6 = 0;
                      L7: while (true) {
                        if (a.field_c <= var6) {
                          eb.field_f.b(125, var5);
                          kk.field_r = -1;
                          continue L4;
                        } else {
                          var5.field_h[var6] = ig.field_a.field_j[var6];
                          var6++;
                          continue L7;
                        }
                      }
                    } else {
                      vh.field_b = df.field_a;
                      df.field_a = wl.field_i;
                      wl.field_i = pg.field_d;
                      pg.field_d = kk.field_r;
                      kk.field_r = -1;
                      stackIn_34_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var2);

            stackIn_44_1 = new StringBuilder().append("td.E(");

            if (param0 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L8;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0 != 0;
                } else {
                  return stackIn_34_0 != 0;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int[] param1, int param2, byte[] param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = param0;
            L1: while (true) {
              if (qg.field_b.length <= var5_int) {
                break L0;
              } else {
                param2 = qg.field_b[var5_int];
                var6 = var5_int << 637584772;
                L2: while (true) {
                  incrementValue$5 = param2;
                  param2--;
                  if (0 == incrementValue$5) {
                    var5_int++;
                    continue L1;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param4 = bf.field_a[incrementValue$6];
                    dupTemp$7 = param3[param4];
                    dupTemp$8 = param1[dupTemp$7];
                    param1[dupTemp$7] = dupTemp$8 + 1;
                    bf.field_a[dupTemp$8] = param4;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("td.B(").append(param0).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param4 + ')');
        }
    }

    private final void a(byte param0, sa param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 37) {
              var4_float = (float)param2 / 100.0f + (float)(1 + this.field_h);
              this.field_c = var4_float * (float)this.field_d / (float)(this.field_e - -1);
              if (0 == param2) {
                this.field_f = param1.field_b;
                return;
              } else {
                this.field_f = param1.field_e + " - " + param2 + "%";
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("td.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final boolean a(int param0) {
        sa var2;
        int var3;
        sa var4;
        L0: {
          var3 = Lexicominos.field_L ? 1 : 0;
          if (param0 <= -38) {
            break L0;
          } else {
            this.field_e = -36;
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_e > this.field_h) {
            var4 = this.field_a[this.field_h];
            var2 = var4;
            if (var4.field_d.c(88)) {
              L2: {
                if (var4.field_i < 0) {
                  break L2;
                } else {
                  if (var4.field_d.c(5, var4.field_i)) {
                    break L2;
                  } else {
                    this.a((byte) 37, var2, var4.field_d.b((byte) -91, var4.field_i));
                    return false;
                  }
                }
              }
              L3: {
                if (var4.field_f == null) {
                  break L3;
                } else {
                  if (var4.field_d.a(var4.field_f, 10762)) {
                    break L3;
                  } else {
                    this.a((byte) 37, var2, var4.field_d.b(var4.field_f, (byte) 121));
                    return false;
                  }
                }
              }
              L4: {
                if ((var4.field_i ^ -1) <= -1) {
                  break L4;
                } else {
                  if (var4.field_f != null) {
                    break L4;
                  } else {
                    if (var4.field_e == null) {
                      break L4;
                    } else {
                      if (!var4.field_d.a((byte) -126)) {
                        this.a((byte) 37, var2, var4.field_d.a(false));
                        return false;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              this.field_h = this.field_h + 1;
              continue L1;
            } else {
              this.a((byte) 37, var4, 0);
              return false;
            }
          } else {
            return true;
          }
        }
    }

    private td() throws Throwable {
        throw new Error();
    }

    public static void b(int param0) {
        field_b = null;
        field_g = null;
        if (param0 == 0) {
            return;
        }
        field_b = (String) null;
    }

    static {
        field_b = "This password contains repeated characters, and would be easy to guess";
        field_g = "TUTORIAL";
    }
}
