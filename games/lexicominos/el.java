/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    private int[] field_a;
    static m field_b;
    static String field_d;
    static fc field_c;

    final static char a(byte param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        if (param1 == 26) {
          var2 = 255 & param0;
          if (0 != var2) {
            if (var2 >= 128) {
              if (160 <= var2) {
                return (char)var2;
              } else {
                L0: {
                  var3 = ne.field_d[-128 + var2];
                  if (var3 != 0) {
                    break L0;
                  } else {
                    var3 = 63;
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
        } else {
          field_b = (m) null;
          var2 = 255 & param0;
          if (0 != var2) {
            if (var2 < 128) {
              return (char)var2;
            } else {
              L1: {
                if (160 > var2) {
                  L2: {
                    var3 = ne.field_d[-128 + var2];
                    if (var3 != 0) {
                      break L2;
                    } else {
                      var3 = 63;
                      break L2;
                    }
                  }
                  var2 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
              return (char)var2;
            }
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_c = (fc) null;
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 == -20075) {
          var3 = (this.field_a.length >> -592355999) + -1;
          var4 = param1 & var3;
          L0: while (true) {
            var5 = this.field_a[1 + (var4 + var4)];
            if (0 == (var5 ^ -1)) {
              return -1;
            } else {
              if (param1 == this.field_a[var4 + var4]) {
                return var5;
              } else {
                var4 = var3 & 1 + var4;
                continue L0;
              }
            }
          }
        } else {
          return -42;
        }
    }

    final static boolean a(int param0) {
        if (param0 == 1) {
          if (null != jc.field_b) {
            if (!uf.field_m.b(param0 ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static db[] a(int param0, db param1) {
        db[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        db[] var9 = null;
        db[] stackIn_4_0 = null;
        db[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        db[] stackOut_3_0 = null;
        db[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var9 = new db[32];
            var2 = var9;
            var9[param0] = param1;
            var3 = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (-33 >= (var3 ^ -1)) {
                    break L3;
                  } else {
                    var4 = var3 + -32;
                    var5 = (double)var4 * 3.141592653589793 / 64.0;
                    var7 = (int)(1.0 + Math.abs(Math.sin(var5)) * (double)param1.field_u + Math.abs(Math.cos(var5)) * (double)param1.field_p);
                    var9[var3] = new db(var7, var7);
                    var9[var3].b();
                    param1.a(8 * param1.field_p, 8 * param1.field_u, var7 * 8, 8 * var7, var4 * 16384 / 32, 4096);
                    stackOut_3_0 = (db[]) (var2);
                    stackIn_7_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      ((db) (Object) stackIn_4_0[var3]).h();
                      var3++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_6_0 = (db[]) (var2);
                stackIn_7_0 = stackOut_6_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2_ref);
            stackOut_8_1 = new StringBuilder().append("el.F(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    el(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0.length + (param0.length >> 365017185) < var2_int) {
                    break L3;
                  } else {
                    var2_int = var2_int << 1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_a = new int[var2_int + var2_int];
                break L2;
              }
              var3 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var3 >= var2_int + var2_int) {
                      break L6;
                    } else {
                      this.field_a[var3] = -1;
                      var3++;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var3 = 0;
                  break L5;
                }
                L7: while (true) {
                  if (param0.length <= var3) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      var4 = param0[var3] & -1 + var2_int;
                      L8: while (true) {
                        L9: {
                          if (-1 == this.field_a[var4 + (var4 + 1)]) {
                            this.field_a[var4 - -var4] = param0[var3];
                            this.field_a[1 + (var4 + var4)] = var3;
                            var3++;
                            break L9;
                          } else {
                            var4 = -1 + var2_int & 1 + var4;
                            if (var5 != 0) {
                              break L9;
                            } else {
                              continue L8;
                            }
                          }
                        }
                        continue L7;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("el.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final static String b(int param0) {
        if (bk.field_c == ca.field_i) {
            return wa.field_k;
        }
        if (param0 != 1) {
            field_d = (String) null;
            return rf.field_b;
        }
        return rf.field_b;
    }

    static {
        field_b = new m("");
        field_d = "Unfortunately we are unable to create an account for you at this time.";
    }
}
