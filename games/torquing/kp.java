/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    int field_c;
    int[] field_b;
    int field_a;
    static int field_d;

    final static void a(t param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        try {
            tl.field_n = param8;
            hn.field_x = param4;
            Torquing.field_x = param1;
            if (param7) {
                field_d = 19;
            }
            j.field_F = param0;
            gi.field_d = param6;
            wh.field_w = param3;
            lb.field_y = param5;
            up.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "kp.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 28) {
            break L0;
          } else {
            kp.a((t) null, -4, -74, -59, 77, 61, 43, true, -81);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((kp) this).field_b) {
              break L2;
            } else {
              if (((kp) this).field_b.length != 0) {
                stackOut_6_0 = ((kp) this).field_b[-1 + ((kp) this).field_b.length];
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (ph.field_k > param2) {
                param0 = param0 - (ph.field_k - param2);
                param2 = ph.field_k;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param5 < ph.field_c) {
                param1 = param1 - (ph.field_c + -param5);
                param5 = ph.field_c;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (ph.field_a < param2 + param0) {
                param0 = ph.field_a + -param2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (ph.field_h >= param5 - -param1) {
                break L4;
              } else {
                param1 = -param5 + ph.field_h;
                break L4;
              }
            }
            L5: {
              if (0 >= param0) {
                break L5;
              } else {
                if (param1 <= 0) {
                  break L5;
                } else {
                  L6: {
                    if (param3 == 16) {
                      break L6;
                    } else {
                      field_d = 3;
                      break L6;
                    }
                  }
                  var6_int = param5 * ph.field_j + param2;
                  var7 = ph.field_j + -param0;
                  param5 = -param1;
                  L7: while (true) {
                    if (param5 >= 0) {
                      break L0;
                    } else {
                      param2 = -param0;
                      L8: while (true) {
                        if (param2 >= 0) {
                          var6_int = var6_int + var7;
                          param5++;
                          continue L7;
                        } else {
                          L9: {
                            var8 = ph.field_e[var6_int];
                            if (param4 >= (var8 & 65280) >> 8) {
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var6_int++;
                          param2++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var6, "kp.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    kp(int param0, int param1, int param2) {
        ((kp) this).field_c = param0;
        ((kp) this).field_a = param1;
        ((kp) this).field_b = new int[1 + param2];
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Torquing.field_u;
          if (((kp) this).field_b == null) {
            break L0;
          } else {
            if (((kp) this).field_b.length == 0) {
              break L0;
            } else {
              var3 = 1;
              L1: while (true) {
                if (var3 >= ((kp) this).field_b.length) {
                  L2: {
                    if (param0 == -64) {
                      break L2;
                    } else {
                      int discarded$2 = ((kp) this).a((byte) 25, -123);
                      break L2;
                    }
                  }
                  return ((kp) this).field_b.length + -1;
                } else {
                  if (param1 >= ((kp) this).field_b[var3] + ((kp) this).field_b[var3 - 1] >> 1) {
                    var3++;
                    continue L1;
                  } else {
                    return var3 + -1;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    final static String a(byte param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = Torquing.field_u;
        if (param1 <= 0L) {
            return null;
        }
        if (param1 >= 6582952005840035281L) {
            return null;
        }
        if (param1 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (0L != var4) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = bd.field_t[(int)(-(param1 * 37L) + var7)];
            if (var9 == 95) {
                var10 = -1 + var6.length();
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        StringBuilder discarded$5 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        if (param0 != -87) {
            return null;
        }
        return var6.toString();
    }

    final static void a(double param0, int param1, double param2, double[] param3, hc param4) {
        try {
            wf.c((byte) 76);
            param4.a(param2, param3, (byte) 37, param0);
            int var7_int = -98 % ((param1 - 5) / 55);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "kp.C(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
