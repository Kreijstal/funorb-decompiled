/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    boolean field_d;
    private go field_j;
    private go[] field_a;
    private int field_h;
    private int[] field_b;
    private int field_e;
    private int field_f;
    static nj field_i;
    private int field_k;
    private int field_c;
    static int field_g;

    final void a(lg param0, int param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param0.a(jm.field_B, ((wg) this).field_e);
              if (param1 == -875079928) {
                break L1;
              } else {
                var4 = null;
                ((wg) this).a((lg) null, 64);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wg.F(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final boolean a(int param0) {
        if (param0 <= -30) {
          if (((wg) this).field_j != null) {
            if (!((wg) this).field_j.field_a) {
              if (((wg) this).field_f >= ((wg) this).field_j.field_j) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final bn a(boolean param0, boolean param1, boolean param2, bn param3) {
        bn var5 = null;
        RuntimeException var5_ref = null;
        bn stackIn_1_0 = null;
        boolean stackIn_1_1 = false;
        boolean stackIn_1_2 = false;
        bn stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        boolean stackIn_2_2 = false;
        bn stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        boolean stackIn_3_2 = false;
        int stackIn_3_3 = 0;
        bn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        bn stackOut_0_0 = null;
        boolean stackOut_0_1 = false;
        boolean stackOut_0_2 = false;
        bn stackOut_2_0 = null;
        boolean stackOut_2_1 = false;
        boolean stackOut_2_2 = false;
        int stackOut_2_3 = 0;
        bn stackOut_1_0 = null;
        boolean stackOut_1_1 = false;
        boolean stackOut_1_2 = false;
        int stackOut_1_3 = 0;
        bn stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = (bn) param3;
              stackOut_0_1 = param0;
              stackOut_0_2 = param2;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_2_2 = stackOut_0_2;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              if (param1) {
                stackOut_2_0 = (bn) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                stackIn_3_3 = stackOut_2_3;
                break L1;
              } else {
                stackOut_1_0 = (bn) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_3_3 = stackOut_1_3;
                break L1;
              }
            }
            var5 = ((bn) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3 != 0);
            var5.a(jm.field_B, ((wg) this).field_e, (ei) null, -1, 0, 0, param1);
            stackOut_3_0 = (bn) var5;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("wg.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final boolean c(int param0) {
        int var2 = 0;
        ((wg) this).field_d = false;
        if (((wg) this).field_a != null) {
          if (((wg) this).field_h >= 0) {
            ((wg) this).field_b[((wg) this).field_h] = ((wg) this).field_b[((wg) this).field_h] - 1;
            if (((wg) this).field_b[((wg) this).field_h] < 0) {
              L0: {
                var2 = ((wg) this).field_h;
                ((wg) this).a(((wg) this).field_a[((wg) this).field_h], (byte) 82);
                ((wg) this).field_h = var2;
                ((wg) this).field_a[((wg) this).field_h] = null;
                ((wg) this).field_h = ((wg) this).field_h + 1;
                if (((wg) this).field_a.length == ((wg) this).field_h) {
                  ((wg) this).field_h = 0;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (null != ((wg) this).field_a[((wg) this).field_h]) {
                if (null != ((wg) this).field_j) {
                  ((wg) this).field_k = ((wg) this).field_k - 1;
                  if (((wg) this).field_k > 0) {
                    if (param0 != -660903963) {
                      ((wg) this).field_c = -76;
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    int discarded$5 = 0;
                    return this.a();
                  }
                } else {
                  return true;
                }
              } else {
                ((wg) this).field_h = -1;
                if (null != ((wg) this).field_j) {
                  ((wg) this).field_k = ((wg) this).field_k - 1;
                  if (((wg) this).field_k > 0) {
                    if (param0 != -660903963) {
                      ((wg) this).field_c = -76;
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    int discarded$6 = 0;
                    return this.a();
                  }
                } else {
                  return true;
                }
              }
            } else {
              if (null != ((wg) this).field_j) {
                ((wg) this).field_k = ((wg) this).field_k - 1;
                if (((wg) this).field_k > 0) {
                  if (param0 == -660903963) {
                    return false;
                  } else {
                    ((wg) this).field_c = -76;
                    return false;
                  }
                } else {
                  int discarded$7 = 0;
                  return this.a();
                }
              } else {
                return true;
              }
            }
          } else {
            if (null != ((wg) this).field_j) {
              ((wg) this).field_k = ((wg) this).field_k - 1;
              if (((wg) this).field_k > 0) {
                if (param0 != -660903963) {
                  ((wg) this).field_c = -76;
                  return false;
                } else {
                  return false;
                }
              } else {
                int discarded$8 = 0;
                return this.a();
              }
            } else {
              return true;
            }
          }
        } else {
          if (null != ((wg) this).field_j) {
            ((wg) this).field_k = ((wg) this).field_k - 1;
            if (((wg) this).field_k > 0) {
              if (param0 != -660903963) {
                ((wg) this).field_c = -76;
                return false;
              } else {
                return false;
              }
            } else {
              int discarded$9 = 0;
              return this.a();
            }
          } else {
            return true;
          }
        }
    }

    private final void b() {
        ((wg) this).field_c = 0;
        ((wg) this).field_e = 0;
        ((wg) this).field_d = false;
        ((wg) this).field_f = 0;
        ((wg) this).field_k = 0;
    }

    final void a(go param0, byte param1) {
        if (param1 < 51) {
            return;
        }
        try {
            int discarded$0 = 0;
            this.b();
            ((wg) this).field_j = param0;
            ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
            ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
            ((wg) this).field_h = -1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "wg.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final boolean a() {
        ((wg) this).field_d = true;
        ((wg) this).field_c = ((wg) this).field_c + 1;
        if (((wg) this).field_j.field_c.length <= ((wg) this).field_c) {
          ((wg) this).field_f = ((wg) this).field_f + 1;
          if (((wg) this).field_j.field_a) {
            if (((wg) this).field_j.field_b >= 0) {
              if (((wg) this).field_j.field_c.length <= ((wg) this).field_j.field_b) {
                ((wg) this).field_c = 0;
                ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
                ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
                return false;
              } else {
                ((wg) this).field_c = ((wg) this).field_j.field_b;
                ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
                ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
                return false;
              }
            } else {
              ((wg) this).field_c = 0;
              ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
              ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
              return false;
            }
          } else {
            if (((wg) this).field_f < ((wg) this).field_j.field_j) {
              if (((wg) this).field_j.field_b >= 0) {
                if (((wg) this).field_j.field_c.length <= ((wg) this).field_j.field_b) {
                  ((wg) this).field_c = 0;
                  ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
                  ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
                  return false;
                } else {
                  ((wg) this).field_c = ((wg) this).field_j.field_b;
                  ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
                  ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
                  return false;
                }
              } else {
                ((wg) this).field_c = 0;
                ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
                ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          ((wg) this).field_e = ((wg) this).field_j.field_c[((wg) this).field_c];
          ((wg) this).field_k = ((wg) this).field_j.field_e[((wg) this).field_c];
          return false;
        }
    }

    final static int a(int param0, int param1) {
        if ((long)param1 >= 65536L) {
          if (16777216L <= (long)param1) {
            if ((long)param1 < 268435456L) {
              if ((long)param1 >= 67108864L) {
                return de.field_d[param1 >> 20] >> 2;
              } else {
                return de.field_d[param1 >> 18] >> 3;
              }
            } else {
              if ((long)param1 >= 1073741824L) {
                return de.field_d[param1 >> 24];
              } else {
                return de.field_d[param1 >> 22] >> 1;
              }
            }
          } else {
            if ((long)param1 < 1048576L) {
              if ((long)param1 < 262144L) {
                return de.field_d[param1 >> 10] >> 7;
              } else {
                return de.field_d[param1 >> 12] >> 6;
              }
            } else {
              if ((long)param1 < 4194304L) {
                return de.field_d[param1 >> 14] >> 5;
              } else {
                return de.field_d[param1 >> 16] >> 4;
              }
            }
          }
        } else {
          if (256L <= (long)param1) {
            if ((long)param1 < 4096L) {
              if ((long)param1 >= 1024L) {
                return de.field_d[param1 >> 4] >> 10;
              } else {
                return de.field_d[param1 >> 2] >> 11;
              }
            } else {
              if ((long)param1 < 16384L) {
                return de.field_d[param1 >> 6] >> 9;
              } else {
                return de.field_d[param1 >> 8] >> 8;
              }
            }
          } else {
            if (param1 >= 0) {
              return de.field_d[param1] >> 12;
            } else {
              if (param0 < 89) {
                wg.d(66);
                return -1;
              } else {
                return -1;
              }
            }
          }
        }
    }

    final void a(wg param0, byte param1) {
        try {
            ((wg) this).field_f = param0.field_f;
            if (param1 <= 10) {
                ((wg) this).field_h = -79;
            }
            ((wg) this).field_e = param0.field_e;
            ((wg) this).field_c = param0.field_c;
            ((wg) this).field_d = param0.field_d;
            ((wg) this).field_j = param0.field_j;
            ((wg) this).field_k = param0.field_k;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "wg.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = (param1 * param1 >> 12) * param1 >> 12;
        if (param0 != 0) {
          return -28;
        } else {
          var3 = -61440 + 6 * param1;
          var4 = (var3 * param1 >> 12) + 40960;
          return var2 * var4 >> 12;
        }
    }

    public wg() {
        ((wg) this).field_d = false;
    }

    public static void d(int param0) {
        field_i = null;
        if (param0 != -900429434) {
            int discarded$0 = wg.b(-112, -107);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new nj();
    }
}
