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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          var3_int = -param1.field_hb + param2.field_hb;
          if (ji.field_b != param2.field_jb) {
            if (param2.field_jb == null) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (ji.field_b != param1.field_jb) {
            if (param1.field_jb == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          if (param0 <= 108) {
            bl.a(75);
          }
          return !(0 >= var3_int);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("bl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
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
        int var2;
        int var3;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (param1 == 2) {
          if (jd.field_c <= 0) {
            if (ki.a((byte) -116)) {
              var2 = 0;
            } else {
              var2 = 1;
            }
          } else {
            if (da.field_a == null) {
              ff.field_b = sg.a(0, 640, 480, 0, 0, jh.field_a);
            } else {
              ff.field_b = da.field_a.b((byte) -74);
              ka.a(2, -27844);
            }
            if (null == ff.field_b) {
              var2 = 3;
            } else {
              var2 = 2;
              ha.a(ff.field_b, (byte) 65);
            }
          }
        } else {
          field_a = (String) null;
          if (jd.field_c <= 0) {
            if (ki.a((byte) -116)) {
              var2 = 0;
            } else {
              var2 = 1;
            }
          } else {
            if (da.field_a == null) {
              ff.field_b = sg.a(0, 640, 480, 0, 0, jh.field_a);
              if (null == ff.field_b) {
                var2 = 3;
              } else {
                var2 = 2;
                ha.a(ff.field_b, (byte) 65);
              }
            } else {
              ff.field_b = da.field_a.b((byte) -74);
              ka.a(2, -27844);
              if (null == ff.field_b) {
                var2 = 3;
              } else {
                var2 = 2;
                ha.a(ff.field_b, (byte) 65);
              }
            }
          }
        }
        if (null != da.field_a) {
          return;
        }
        if (!ne.field_c) {
          return;
        }
        id.a(var2, param0, (byte) 116);
    }

    final static ee a(int param0) {
        try {
          Throwable var1 = null;
          ee stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 < 87) {
              bl.a(65);
            }
            stackIn_3_0 = (ee) (Class.forName("ie").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
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
