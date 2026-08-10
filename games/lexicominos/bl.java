/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bl {
    static int field_b;
    static String field_a;

    final static boolean a(byte param0, hc param1, hc param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = -param1.field_hb + param2.field_hb;
              if (ji.field_b != param2.field_jb) {
                if (param2.field_jb == null) {
                  var3_int += 200;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            L2: {
              if (ji.field_b != param1.field_jb) {
                if (param1.field_jb == null) {
                  var3_int -= 200;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var3_int += 200;
                break L2;
              }
            }
            L3: {
              if (param0 > 108) {
                break L3;
              } else {
                bl.a(75);
                break L3;
              }
            }
            L4: {
              if (0 >= var3_int) {
                stackIn_16_0 = 0;
                break L4;
              } else {
                stackIn_16_0 = 1;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("bl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        return stackIn_16_0 != 0;
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
        int var2;
        int var3;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (param1 != 2) {
          field_a = (String) null;
          if (-1 > (jd.field_c ^ -1)) {
            if (da.field_a == null) {
              L0: {
                ff.field_b = sg.a(0, 640, 480, 0, 0, jh.field_a);
                if (null == ff.field_b) {
                  var2 = 3;
                  break L0;
                } else {
                  var2 = 2;
                  ha.a(ff.field_b, (byte) 65);
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
                  ha.a(ff.field_b, (byte) 65);
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
                  ha.a(ff.field_b, (byte) 65);
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
                  ha.a(ff.field_b, (byte) 65);
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
            try {
              L0: {
                L1: {
                  if (param0 >= 87) {
                    break L1;
                  } else {
                    bl.a(65);
                    break L1;
                  }
                }
                stackIn_3_0 = (ee) (Class.forName("ie").newInstance());
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "3 of 4";
    }
}
