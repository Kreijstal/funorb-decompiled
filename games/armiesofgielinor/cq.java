/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends tc {
    int field_k;
    static byte[][] field_z;
    bg field_n;
    int field_B;
    static int[] field_u;
    int field_D;
    String field_r;
    int field_A;
    wk field_m;
    int field_t;
    boolean field_l;
    int field_x;
    static int field_F;
    int field_v;
    om field_p;
    static String field_C;
    String field_w;
    String field_q;
    int field_o;
    static String field_E;
    int field_y;
    wk field_s;

    public static void a(int param0) {
        field_z = (byte[][]) null;
        if (param0 != -101) {
            cq.a(-99, -40, -126, (byte) 12, -104);
        }
        field_E = null;
        field_u = null;
        field_C = null;
    }

    final static Class a(Object param0, byte param1) {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_21_0 = null;
        Class stackIn_25_0 = null;
        Class stackIn_29_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!Integer.class.isInstance(param0)) {
              if (param1 == -75) {
                if (!Byte.class.isInstance(param0)) {
                  if (!Short.class.isInstance(param0)) {
                    if (Long.class.isInstance(param0)) {
                      stackIn_15_0 = Long.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!Boolean.class.isInstance(param0)) {
                        if (!Float.class.isInstance(param0)) {
                          if (Double.class.isInstance(param0)) {
                            stackIn_25_0 = Double.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (Character.class.isInstance(param0)) {
                              stackIn_29_0 = Character.TYPE;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              return null;
                            }
                          }
                        } else {
                          stackIn_21_0 = Float.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_18_0 = Boolean.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_11_0 = Short.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = Byte.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = (Class) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = Integer.TYPE;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var2);

            stackIn_33_1 = new StringBuilder().append("cq.F(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L1;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_18_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_21_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_25_0;
                      } else {
                        return stackIn_29_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        int var5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              oh.field_L = lm.field_d;
              if (param1 == -14) {
                break L1;
              } else {
                cq.a(7);
                break L1;
              }
            }
            L2: {
              if (255 == param3) {
                L3: {
                  if (-14 >= (nm.field_z ^ -1)) {
                    stackIn_11_0 = 0;
                    break L3;
                  } else {
                    stackIn_11_0 = 1;
                    break L3;
                  }
                }
                p.field_a = dc.a(stackIn_11_0 != 0, false);
                break L2;
              } else {
                L4: {
                  if (-101 < (param3 ^ -1)) {
                    break L4;
                  } else {
                    if (-106 > (param3 ^ -1)) {
                      break L4;
                    } else {
                      p.field_a = ei.a(2, param2);
                      break L2;
                    }
                  }
                }
                p.field_a = il.a(-1, param3, param0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("cq.D(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = 0;
          var3 = ib.field_j;
          if ((var3 ^ -1) <= -6) {
            if (var3 < 105) {
              var2 = (-40960 + var3 * 16384) / 220;
              break L0;
            } else {
              if (var3 < 120) {
                var3 = -var3 + 120;
                var2 = 8192 - var3 * var3 * 8192 / 3300;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            var2 = 8192 * (var3 * var3) / 1100;
            break L0;
          }
        }
        L1: {
          var4 = 1;
          var5 = 0;
          if (1 == param1) {
            var5 = 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param1 == 3) {
            var4 = -1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if ((param1 ^ -1) == -5) {
            var5 = 1;
            var4 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == -116) {
            break L4;
          } else {
            cq.a((byte) 74, 85);
            break L4;
          }
        }
        L5: {
          if (param1 == 5) {
            var4 = -1;
            var5 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if ((param1 ^ -1) == -7) {
            var4 = 1;
            var5 = -1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          L8: {
            if (-8 == (param1 ^ -1)) {
              break L8;
            } else {
              if (-9 == (param1 ^ -1)) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L7;
        }
        L9: {
          if (11 != param1) {
            break L9;
          } else {
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (-13 == (param1 ^ -1)) {
            var5 = -1;
            var4 = -1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if ((param1 ^ -1) != -14) {
            break L11;
          } else {
            var5 = -1;
            var4 = 1;
            break L11;
          }
        }
        L12: {
          if (-15 == (param1 ^ -1)) {
            var4 = -1;
            var5 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if (15 != param1) {
            break L13;
          } else {
            var4 = 1;
            var5 = 1;
            break L13;
          }
        }
        pd.field_a = ek.a(-125, var4 * var2, var2 * var5);
    }

    final static wk[] a(int param0, int param1, int param2, byte param3, int param4) {
        wk[] var6 = new wk[9];
        wk[] var5 = var6;
        wk dupTemp$0 = hl.a(false, param2, param1);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        wk dupTemp$1 = hl.a(false, param4, param1);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param3 <= 33) {
            cq.a(111);
        }
        if (param0 != 0) {
            var6[4] = hl.a(false, param0, 64);
        }
        return var5;
    }

    final boolean a(int param0, int param1, int param2) {
        int stackIn_8_0 = 0;
        L0: {
          if (param2 >= 114) {
            break L0;
          } else {
            this.a(106, -67, 2);
            break L0;
          }
        }
        L1: {
          L2: {
            if (db.a(true, this.field_y) > param0) {
              break L2;
            } else {
              if (db.a(true, this.field_B + this.field_y) < param0) {
                break L2;
              } else {
                if (param1 < u.a(this.field_x, (byte) 94)) {
                  break L2;
                } else {
                  if (u.a(this.field_o + this.field_x, (byte) 94) < param1) {
                    break L2;
                  } else {
                    stackIn_8_0 = 1;
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_8_0 = 0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    cq(om param0) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        ne[] var3 = null;
        ne[] var4_ref_ne__ = null;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        lo var12 = null;
        ne var13 = null;
        sd var14 = null;
        int[] var18 = null;
        try {
          L0: {
            this.field_p = param0;
            this.field_w = param0.field_J;
            this.field_v = 1073741823;
            this.field_l = false;
            this.field_k = param0.field_v;
            this.field_n = new bg(16);
            var12 = param0.a(-114);
            var3 = var12.a(115, (ha) null);
            var4_ref_ne__ = var3;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4_ref_ne__.length) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= param0.field_B.length) {
                    break L0;
                  } else {
                    L3: {
                      var5 = param0.field_B[var4];
                      if (var5 == -1) {
                        break L3;
                      } else {
                        var14 = param0.field_G.field_q[var5];
                        if (null == var14.field_p) {
                          break L3;
                        } else {
                          var18 = var14.field_p;
                          var8 = 0;
                          L4: while (true) {
                            if (var18.length <= var8) {
                              break L3;
                            } else {
                              L5: {
                                var9 = var18[var8];
                                var10 = bw.field_m[var9][0];
                                if (this.field_n.a(-96, (long)var10) != null) {
                                  break L5;
                                } else {
                                  this.field_n.a(new tc(), (long)var10, 126);
                                  break L5;
                                }
                              }
                              var8++;
                              continue L4;
                            }
                          }
                        }
                      }
                    }
                    var4++;
                    continue L2;
                  }
                }
              } else {
                L6: {
                  var13 = var4_ref_ne__[var5];
                  if (null == var13.field_c) {
                    break L6;
                  } else {
                    if (var13.field_c.field_O == param0.field_w) {
                      break L6;
                    } else {
                      var7 = var13.field_c.g(0);
                      if (this.field_n.a(-57, (long)var7) != null) {
                        break L6;
                      } else {
                        this.field_n.a(new tc(), (long)var7, 108);
                        break L6;
                      }
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("cq.<init>(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    cq(int param0, String param1) {
        try {
            this.field_w = param1;
            this.field_v = 1073741823;
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "cq.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_F = 22;
        field_C = "Create unrated game";
        field_E = "Quick Chat game";
    }
}
