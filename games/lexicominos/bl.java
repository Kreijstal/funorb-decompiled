/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bl {
    static int field_b;
    static String field_a;

    final static boolean a(byte param0, hc param1, hc param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = Lexicominos.field_L ? 1 : 0;
          var3 = -param1.field_hb + param2.field_hb;
          if (ji.field_b != param2.field_jb) {
            if (param2.field_jb == null) {
              // wide iinc 3 200
              break L0;
            } else {
              break L0;
            }
          } else {
            // wide iinc 3 -200
            break L0;
          }
        }
        if (ji.field_b != param1.field_jb) {
          if (param1.field_jb == null) {
            // wide iinc 3 -200
            if (param0 <= 108) {
              L1: {
                ee discarded$12 = bl.a(75);
                if (0 >= var3) {
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                } else {
                  stackOut_25_0 = 1;
                  stackIn_27_0 = stackOut_25_0;
                  break L1;
                }
              }
              return stackIn_27_0 != 0;
            } else {
              L2: {
                if (0 >= var3) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L2;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  break L2;
                }
              }
              return stackIn_23_0 != 0;
            }
          } else {
            L3: {
              if (param0 > 108) {
                break L3;
              } else {
                ee discarded$13 = bl.a(75);
                break L3;
              }
            }
            L4: {
              if (0 >= var3) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L4;
              } else {
                stackOut_16_0 = 1;
                stackIn_18_0 = stackOut_16_0;
                break L4;
              }
            }
            return stackIn_18_0 != 0;
          }
        } else {
          L5: {
            // wide iinc 3 200
            if (param0 > 108) {
              break L5;
            } else {
              ee discarded$14 = bl.a(75);
              break L5;
            }
          }
          L6: {
            if (0 >= var3) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L6;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L6;
            }
          }
          return stackIn_11_0 != 0;
        }
    }

    public static void a(byte param0) {
        if (param0 <= 106) {
            field_b = -126;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (param1 != 2) {
          field_a = null;
          if (-1 > (jd.field_c ^ -1)) {
            if (da.field_a == null) {
              L0: {
                ff.field_b = sg.a(0, 640, 480, 0, 0, jh.field_a);
                if (null == ff.field_b) {
                  var2 = 3;
                  break L0;
                } else {
                  var2 = 2;
                  ha.a((java.awt.Canvas) (Object) ff.field_b, (byte) 65);
                  break L0;
                }
              }
              if (null == da.field_a) {
                if (!ne.field_c) {
                  return;
                } else {
                  id.a(var2, param0, (byte) 116);
                  return;
                }
              } else {
                return;
              }
            } else {
              L1: {
                ff.field_b = da.field_a.b((byte) -74);
                ka.a(2, -27844);
                if (null == ff.field_b) {
                  var2 = 3;
                  break L1;
                } else {
                  var2 = 2;
                  ha.a((java.awt.Canvas) (Object) ff.field_b, (byte) 65);
                  break L1;
                }
              }
              if (null == da.field_a) {
                if (!ne.field_c) {
                  return;
                } else {
                  id.a(var2, param0, (byte) 116);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (ki.a((byte) -116)) {
              var2 = 0;
              if (null == da.field_a) {
                if (!ne.field_c) {
                  return;
                } else {
                  id.a(var2, param0, (byte) 116);
                  return;
                }
              } else {
                return;
              }
            } else {
              var2 = 1;
              if (null == da.field_a) {
                if (ne.field_c) {
                  id.a(var2, param0, (byte) 116);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          if (-1 > (jd.field_c ^ -1)) {
            if (da.field_a == null) {
              L2: {
                ff.field_b = sg.a(0, 640, 480, 0, 0, jh.field_a);
                if (null == ff.field_b) {
                  var2 = 3;
                  break L2;
                } else {
                  var2 = 2;
                  ha.a((java.awt.Canvas) (Object) ff.field_b, (byte) 65);
                  break L2;
                }
              }
              if (null == da.field_a) {
                if (!ne.field_c) {
                  return;
                } else {
                  id.a(var2, param0, (byte) 116);
                  return;
                }
              } else {
                return;
              }
            } else {
              L3: {
                ff.field_b = da.field_a.b((byte) -74);
                ka.a(2, -27844);
                if (null == ff.field_b) {
                  var2 = 3;
                  break L3;
                } else {
                  var2 = 2;
                  ha.a((java.awt.Canvas) (Object) ff.field_b, (byte) 65);
                  break L3;
                }
              }
              if (null == da.field_a) {
                if (!ne.field_c) {
                  return;
                } else {
                  id.a(var2, param0, (byte) 116);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (ki.a((byte) -116)) {
              var2 = 0;
              if (null == da.field_a) {
                if (ne.field_c) {
                  id.a(var2, param0, (byte) 116);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              var2 = 1;
              if (null == da.field_a) {
                if (ne.field_c) {
                  id.a(var2, param0, (byte) 116);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final static ee a(int param0) {
        try {
            Throwable var1 = null;
            ee stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            ee stackOut_2_0 = null;
            try {
              L0: {
                if (param0 >= 87) {
                  break L0;
                } else {
                  ee discarded$2 = bl.a(65);
                  break L0;
                }
              }
              stackOut_2_0 = (ee) Class.forName("ie").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "3 of 4";
    }
}
