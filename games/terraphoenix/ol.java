/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends g {
    static String field_Lb;
    private g field_Jb;
    private g field_Fb;
    private g field_Gb;
    private g field_Ib;
    private int field_Db;
    static byte[][][] field_Kb;
    private g field_Mb;
    static String field_Hb;
    private g field_Eb;

    public static void g(int param0) {
        field_Hb = null;
        field_Lb = null;
        field_Kb = null;
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1) {
          L0: {
            ((ol) this).field_Fb = null;
            if (((ol) this).field_Ib.field_N == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ol) this).field_Ib.field_N == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean e(byte param0) {
        if (param0 <= -84) {
          if (((ol) this).field_Gb.field_pb != 0) {
            ((ol) this).field_Db = 20;
            return true;
          } else {
            if (((ol) this).field_Gb.field_N != 0) {
              L0: {
                if (((ol) this).field_Db > 0) {
                  ((ol) this).field_Db = ((ol) this).field_Db - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (((ol) this).field_Db == 0) {
                ((ol) this).field_Db = 3;
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          boolean discarded$10 = ((ol) this).f((byte) 105);
          if (((ol) this).field_Gb.field_pb != 0) {
            ((ol) this).field_Db = 20;
            return true;
          } else {
            if (((ol) this).field_Gb.field_N != 0) {
              L1: {
                if (((ol) this).field_Db > 0) {
                  ((ol) this).field_Db = ((ol) this).field_Db - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((ol) this).field_Db != 0) {
                return false;
              } else {
                ((ol) this).field_Db = 3;
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param4 != -689) {
          field_Hb = null;
          ((ol) this).field_lb = param6;
          ((ol) this).field_x = param2;
          ((ol) this).field_ib = param0;
          ((ol) this).field_R = param5;
          ((ol) this).a((byte) -94, param7, param1, param3);
          return;
        } else {
          ((ol) this).field_lb = param6;
          ((ol) this).field_x = param2;
          ((ol) this).field_ib = param0;
          ((ol) this).field_R = param5;
          ((ol) this).a((byte) -94, param7, param1, param3);
          return;
        }
    }

    final boolean f(byte param0) {
        if (0 == ((ol) this).field_Mb.field_pb) {
          if (((ol) this).field_Mb.field_N != 0) {
            if (((ol) this).field_Db <= 0) {
              if (((ol) this).field_Db == 0) {
                if (((ol) this).field_Ib.field_W + (((ol) this).field_Ib.field_lb + ((ol) this).field_Ib.field_gb + ((ol) this).field_Ib.field_Bb) > jb.field_b) {
                  if (param0 >= -119) {
                    ((ol) this).a((byte) 23, 81, 34, -99);
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  ((ol) this).field_Db = 3;
                  return true;
                }
              } else {
                if (param0 >= -119) {
                  ((ol) this).a((byte) 23, 81, 34, -99);
                  return false;
                } else {
                  return false;
                }
              }
            } else {
              ((ol) this).field_Db = ((ol) this).field_Db - 1;
              if (((ol) this).field_Db == 0) {
                if (((ol) this).field_Ib.field_W + (((ol) this).field_Ib.field_lb + ((ol) this).field_Ib.field_gb + ((ol) this).field_Ib.field_Bb) > jb.field_b) {
                  if (param0 >= -119) {
                    ((ol) this).a((byte) 23, 81, 34, -99);
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  ((ol) this).field_Db = 3;
                  return true;
                }
              } else {
                if (param0 >= -119) {
                  ((ol) this).a((byte) 23, 81, 34, -99);
                  return false;
                } else {
                  return false;
                }
              }
            }
          } else {
            if (param0 < -119) {
              return false;
            } else {
              ((ol) this).a((byte) 23, 81, 34, -99);
              return false;
            }
          }
        } else {
          ((ol) this).field_Db = 20;
          return true;
        }
    }

    ol(long param0, g param1, ci param2, ci param3, g param4, g param5) {
        this(param0, param1, param1, param4, param5);
        try {
            ((ol) this).field_Gb.field_ob = param2;
            ((ol) this).field_Jb.field_ob = param3;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ol.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    private final int a(int param0, int param1, byte param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = 0;
          var6 = -((ol) this).field_Ib.field_lb + ((ol) this).field_Fb.field_lb;
          if (var6 <= 0) {
            break L0;
          } else {
            var7 = ((ol) this).field_Ib.field_ib;
            var8 = -param0 + param1;
            var5 = (var6 / 2 + var7 * var8) / var6;
            break L0;
          }
        }
        L1: {
          if (-param0 + param1 < var5) {
            var5 = param1 + -param0;
            break L1;
          } else {
            break L1;
          }
        }
        if (var5 < 0) {
          var5 = 0;
          if (param2 == -123) {
            return var5;
          } else {
            ((ol) this).a((byte) -11, -26, -77, -82);
            return var5;
          }
        } else {
          if (param2 == -123) {
            return var5;
          } else {
            ((ol) this).a((byte) -11, -26, -77, -82);
            return var5;
          }
        }
    }

    private ol(long param0, g param1, g param2, g param3, g param4) {
        super(param0, (g) null);
        RuntimeException var7 = null;
        g var9 = null;
        g var10 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            ((ol) this).field_Gb = new g(0L, param1);
            ((ol) this).field_Jb = new g(0L, param2);
            ((ol) this).a(((ol) this).field_Gb, -14951);
            ((ol) this).a(((ol) this).field_Jb, -14951);
            ((ol) this).field_Fb = new g(0L, (g) null);
            ((ol) this).a(((ol) this).field_Fb, -14951);
            ((ol) this).field_Eb = new g(0L, param3);
            ((ol) this).field_Mb = new g(0L, param3);
            var9 = ((ol) this).field_Eb;
            var10 = var9;
            ((ol) this).field_Mb.field_z = true;
            var10.field_z = true;
            ((ol) this).field_Fb.a(((ol) this).field_Eb, -14951);
            ((ol) this).field_Fb.a(((ol) this).field_Mb, -14951);
            ((ol) this).field_Ib = new g(0L, param4);
            ((ol) this).field_Ib.field_kb = true;
            ((ol) this).field_Fb.a(((ol) this).field_Ib, -14951);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("ol.<init>(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final boolean e(int param0) {
        if (((ol) this).field_Eb.field_pb == param0) {
          if (-1 != ((ol) this).field_Eb.field_N) {
            L0: {
              if (((ol) this).field_Db > 0) {
                ((ol) this).field_Db = ((ol) this).field_Db - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((ol) this).field_Db == 0) {
              if (((ol) this).field_Ib.field_Bb - -((ol) this).field_Ib.field_gb <= jb.field_b) {
                return false;
              } else {
                ((ol) this).field_Db = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((ol) this).field_Db = 20;
          return true;
        }
    }

    final boolean d(byte param0) {
        int var2 = 0;
        if (((ol) this).field_Jb.field_pb != 0) {
          ((ol) this).field_Db = 20;
          return true;
        } else {
          var2 = 71 / ((-30 - param0) / 43);
          if (((ol) this).field_Jb.field_N != 0) {
            L0: {
              if (0 < ((ol) this).field_Db) {
                ((ol) this).field_Db = ((ol) this).field_Db - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((ol) this).field_Db == 0) {
              ((ol) this).field_Db = 3;
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        g var15 = null;
        g var16 = null;
        g var17 = null;
        g var18 = null;
        g var19 = null;
        g var20 = null;
        g stackIn_8_0 = null;
        g stackIn_8_1 = null;
        g stackIn_8_2 = null;
        g stackIn_9_0 = null;
        g stackIn_9_1 = null;
        g stackIn_9_2 = null;
        g stackIn_10_0 = null;
        g stackIn_10_1 = null;
        g stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        g stackIn_19_0 = null;
        g stackIn_19_1 = null;
        g stackIn_19_2 = null;
        g stackIn_20_0 = null;
        g stackIn_20_1 = null;
        g stackIn_20_2 = null;
        g stackIn_21_0 = null;
        g stackIn_21_1 = null;
        g stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        g stackIn_26_0 = null;
        g stackIn_26_1 = null;
        g stackIn_26_2 = null;
        g stackIn_27_0 = null;
        g stackIn_27_1 = null;
        g stackIn_27_2 = null;
        g stackIn_28_0 = null;
        g stackIn_28_1 = null;
        g stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        g stackOut_25_0 = null;
        g stackOut_25_1 = null;
        g stackOut_25_2 = null;
        g stackOut_27_0 = null;
        g stackOut_27_1 = null;
        g stackOut_27_2 = null;
        int stackOut_27_3 = 0;
        g stackOut_26_0 = null;
        g stackOut_26_1 = null;
        g stackOut_26_2 = null;
        int stackOut_26_3 = 0;
        g stackOut_18_0 = null;
        g stackOut_18_1 = null;
        g stackOut_18_2 = null;
        g stackOut_20_0 = null;
        g stackOut_20_1 = null;
        g stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        g stackOut_19_0 = null;
        g stackOut_19_1 = null;
        g stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        g stackOut_7_0 = null;
        g stackOut_7_1 = null;
        g stackOut_7_2 = null;
        g stackOut_9_0 = null;
        g stackOut_9_1 = null;
        g stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        g stackOut_8_0 = null;
        g stackOut_8_1 = null;
        g stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        L0: {
          if (((ol) this).field_lb >= ((ol) this).field_x * 2) {
            var5 = ((ol) this).field_x;
            var6 = ((ol) this).field_lb - ((ol) this).field_x;
            break L0;
          } else {
            var6 = ((ol) this).field_lb / 2;
            var5 = ((ol) this).field_lb / 2;
            break L0;
          }
        }
        var7 = var6 - var5;
        var8 = var7;
        if (param3 > 0) {
          L1: {
            var8 = var8 * param1 / param3;
            if (((ol) this).field_x > var8) {
              var8 = ((ol) this).field_x;
              break L1;
            } else {
              break L1;
            }
          }
          if (var7 >= var8) {
            L2: {
              var9 = param3 - param1;
              var10 = -var8 + var7;
              var11 = 0;
              if (var9 > 0) {
                var11 = (var9 / 2 + param2 * var10) / var9;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var12 = var8 / 2 + var11;
              var15 = ((ol) this).field_Gb;
              var15.field_x = ((ol) this).field_x;
              var15.field_R = 0;
              var15.field_lb = var5;
              var15.field_ib = 0;
              var16 = ((ol) this).field_Jb;
              var16.field_x = ((ol) this).field_x;
              var16.field_lb = -var6 + ((ol) this).field_lb;
              var16.field_R = 0;
              var16.field_ib = var6;
              var17 = ((ol) this).field_Fb;
              var17.field_x = ((ol) this).field_x;
              var17.field_lb = var7;
              var17.field_ib = var5;
              var17.field_R = 0;
              var18 = ((ol) this).field_Eb;
              var18.field_R = 0;
              var18.field_lb = var12;
              var18.field_x = ((ol) this).field_x;
              var18.field_ib = 0;
              var19 = ((ol) this).field_Mb;
              var19.field_x = ((ol) this).field_x;
              var19.field_lb = var7 + -var12;
              var19.field_R = 0;
              var19.field_ib = var12;
              var20 = ((ol) this).field_Ib;
              stackOut_25_0 = ((ol) this).field_Gb;
              stackOut_25_1 = ((ol) this).field_Jb;
              stackOut_25_2 = ((ol) this).field_Fb;
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              if (param1 >= param3) {
                stackOut_27_0 = (g) (Object) stackIn_27_0;
                stackOut_27_1 = (g) (Object) stackIn_27_1;
                stackOut_27_2 = (g) (Object) stackIn_27_2;
                stackOut_27_3 = 0;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                stackIn_28_2 = stackOut_27_2;
                stackIn_28_3 = stackOut_27_3;
                break L3;
              } else {
                stackOut_26_0 = (g) (Object) stackIn_26_0;
                stackOut_26_1 = (g) (Object) stackIn_26_1;
                stackOut_26_2 = (g) (Object) stackIn_26_2;
                stackOut_26_3 = 1;
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                stackIn_28_2 = stackOut_26_2;
                stackIn_28_3 = stackOut_26_3;
                break L3;
              }
            }
            stackIn_28_2.field_zb = stackIn_28_3 != 0;
            stackIn_28_1.field_zb = stackIn_28_3 != 0;
            stackIn_28_0.field_zb = stackIn_28_3 != 0;
            var20.field_lb = var8;
            var20.field_ib = var11;
            var20.field_x = ((ol) this).field_x;
            var14 = 21 / ((param0 - -5) / 50);
            var20.field_R = 0;
            return;
          } else {
            L4: {
              var8 = var7;
              var9 = param3 - param1;
              var10 = -var8 + var7;
              var11 = 0;
              if (var9 > 0) {
                var11 = (var9 / 2 + param2 * var10) / var9;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var12 = var8 / 2 + var11;
              var15 = ((ol) this).field_Gb;
              var15.field_x = ((ol) this).field_x;
              var15.field_R = 0;
              var15.field_lb = var5;
              var15.field_ib = 0;
              var16 = ((ol) this).field_Jb;
              var16.field_x = ((ol) this).field_x;
              var16.field_lb = -var6 + ((ol) this).field_lb;
              var16.field_R = 0;
              var16.field_ib = var6;
              var17 = ((ol) this).field_Fb;
              var17.field_x = ((ol) this).field_x;
              var17.field_lb = var7;
              var17.field_ib = var5;
              var17.field_R = 0;
              var18 = ((ol) this).field_Eb;
              var18.field_R = 0;
              var18.field_lb = var12;
              var18.field_x = ((ol) this).field_x;
              var18.field_ib = 0;
              var19 = ((ol) this).field_Mb;
              var19.field_x = ((ol) this).field_x;
              var19.field_lb = var7 + -var12;
              var19.field_R = 0;
              var19.field_ib = var12;
              var20 = ((ol) this).field_Ib;
              stackOut_18_0 = ((ol) this).field_Gb;
              stackOut_18_1 = ((ol) this).field_Jb;
              stackOut_18_2 = ((ol) this).field_Fb;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              if (param1 >= param3) {
                stackOut_20_0 = (g) (Object) stackIn_20_0;
                stackOut_20_1 = (g) (Object) stackIn_20_1;
                stackOut_20_2 = (g) (Object) stackIn_20_2;
                stackOut_20_3 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                stackIn_21_2 = stackOut_20_2;
                stackIn_21_3 = stackOut_20_3;
                break L5;
              } else {
                stackOut_19_0 = (g) (Object) stackIn_19_0;
                stackOut_19_1 = (g) (Object) stackIn_19_1;
                stackOut_19_2 = (g) (Object) stackIn_19_2;
                stackOut_19_3 = 1;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_21_2 = stackOut_19_2;
                stackIn_21_3 = stackOut_19_3;
                break L5;
              }
            }
            stackIn_21_2.field_zb = stackIn_21_3 != 0;
            stackIn_21_1.field_zb = stackIn_21_3 != 0;
            stackIn_21_0.field_zb = stackIn_21_3 != 0;
            var20.field_lb = var8;
            var20.field_ib = var11;
            var20.field_x = ((ol) this).field_x;
            var14 = 21 / ((param0 - -5) / 50);
            var20.field_R = 0;
            return;
          }
        } else {
          L6: {
            var9 = param3 - param1;
            var10 = -var8 + var7;
            var11 = 0;
            if (var9 > 0) {
              var11 = (var9 / 2 + param2 * var10) / var9;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            var12 = var8 / 2 + var11;
            var15 = ((ol) this).field_Gb;
            var15.field_x = ((ol) this).field_x;
            var15.field_R = 0;
            var15.field_lb = var5;
            var15.field_ib = 0;
            var16 = ((ol) this).field_Jb;
            var16.field_x = ((ol) this).field_x;
            var16.field_lb = -var6 + ((ol) this).field_lb;
            var16.field_R = 0;
            var16.field_ib = var6;
            var17 = ((ol) this).field_Fb;
            var17.field_x = ((ol) this).field_x;
            var17.field_lb = var7;
            var17.field_ib = var5;
            var17.field_R = 0;
            var18 = ((ol) this).field_Eb;
            var18.field_R = 0;
            var18.field_lb = var12;
            var18.field_x = ((ol) this).field_x;
            var18.field_ib = 0;
            var19 = ((ol) this).field_Mb;
            var19.field_x = ((ol) this).field_x;
            var19.field_lb = var7 + -var12;
            var19.field_R = 0;
            var19.field_ib = var12;
            var20 = ((ol) this).field_Ib;
            stackOut_7_0 = ((ol) this).field_Gb;
            stackOut_7_1 = ((ol) this).field_Jb;
            stackOut_7_2 = ((ol) this).field_Fb;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            stackIn_8_2 = stackOut_7_2;
            if (param1 >= param3) {
              stackOut_9_0 = (g) (Object) stackIn_9_0;
              stackOut_9_1 = (g) (Object) stackIn_9_1;
              stackOut_9_2 = (g) (Object) stackIn_9_2;
              stackOut_9_3 = 0;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              stackIn_10_3 = stackOut_9_3;
              break L7;
            } else {
              stackOut_8_0 = (g) (Object) stackIn_8_0;
              stackOut_8_1 = (g) (Object) stackIn_8_1;
              stackOut_8_2 = (g) (Object) stackIn_8_2;
              stackOut_8_3 = 1;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              stackIn_10_3 = stackOut_8_3;
              break L7;
            }
          }
          stackIn_10_2.field_zb = stackIn_10_3 != 0;
          stackIn_10_1.field_zb = stackIn_10_3 != 0;
          stackIn_10_0.field_zb = stackIn_10_3 != 0;
          var20.field_lb = var8;
          var20.field_ib = var11;
          var20.field_x = ((ol) this).field_x;
          var14 = 21 / ((param0 - -5) / 50);
          var20.field_R = 0;
          return;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 43 % ((-30 - param0) / 61);
        return this.a(param2, param1, (byte) -123, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = "You have 1 unread message!";
    }
}
