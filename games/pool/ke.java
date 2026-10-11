/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String field_a;
    static String field_g;
    static String[] field_c;
    static ko field_f;
    private String field_e;
    private boolean field_d;
    static String field_b;

    final static void a(String param0, int param1, String[] param2, byte param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          wd.field_Lb = td.field_f;
          if (param3 != -16) {
            ke.a(-100);
          }
          if (param1 == 255) {
            stackIn_7_0 = !(j.field_b >= 13);
            sf.field_B = ta.a(stackIn_7_0, param3 - 30898);
            return;
          }
          if (param1 < 100) {
            sf.field_B = gg.a(param1, true, param0);
            return;
          }
          if (param1 <= 105) {
            sf.field_B = jo.a(param2, 57);
            return;
          }
          sf.field_B = gg.a(param1, true, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ke.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (nl.field_c != null) {
            try {
              nl.field_c.a(param0 ^ 100, 0L);
              nl.field_c.a(24, kn.field_e.field_t, kn.field_e.field_v, -1);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              kn.field_e.field_v = kn.field_e.field_v + 24;
              if (param0 == 100) {
                return;
              }
              field_f = (ko) null;
              return;
            }
          }
          kn.field_e.field_v = kn.field_e.field_v + 24;
          if (param0 != 100) {
            field_f = (ko) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          return true;
        }
        return this.field_d;
    }

    final String a(byte param0) {
        if (param0 != 104) {
          ke.a(true, 103);
          return this.field_e;
        }
        return this.field_e;
    }

    ke(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_e = param0;
          if (this.field_e == null) {
            this.field_e = "";
          }
          stackIn_6_1 = (param1);
          this.field_d = stackIn_6_1;
          if (this.field_e.length() != 0) {
            return;
          }
          this.field_d = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ke.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    ke(String param0) {
        this(param0, false);
    }

    final static int a(boolean param0, int param1) {
        if (65536L > (long)param1) {
          if ((long)param1 < 256L) {
            if (param1 >= 0) {
              return el.field_J[param1] >> 12;
            }
            if (!param0) {
              return -1;
            }
            ke.a(true, 12);
            return -1;
          }
          if ((long)param1 >= 4096L) {
            if ((long)param1 >= 16384L) {
              return el.field_J[param1 >> 8] >> 8;
            }
            return el.field_J[param1 >> 6] >> 9;
          }
          if ((long)param1 < 1024L) {
            return el.field_J[param1 >> 2] >> 11;
          }
          return el.field_J[param1 >> 4] >> 10;
        }
        if ((long)param1 < 16777216L) {
          if ((long)param1 < 1048576L) {
            if (262144L <= (long)param1) {
              return el.field_J[param1 >> 12] >> 6;
            }
            return el.field_J[param1 >> 10] >> 7;
          }
          if ((long)param1 < 4194304L) {
            return el.field_J[param1 >> 14] >> 5;
          }
          return el.field_J[param1 >> 16] >> 4;
        }
        if ((long)param1 >= 268435456L) {
          if ((long)param1 >= 1073741824L) {
            return el.field_J[param1 >> 24];
          }
          return el.field_J[param1 >> 22] >> 1;
        }
        if (67108864L > (long)param1) {
          return el.field_J[param1 >> 18] >> 3;
        }
        return el.field_J[param1 >> 20] >> 2;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_f = null;
        if (param0) {
          return;
        }
        field_a = null;
        field_c = null;
        field_g = null;
    }

    static {
        field_a = "Press <img=3> for the options menu. Hover your mouse over <col=ccccff>blue text</col> for an explanation.";
        field_b = "<%0> might change the options - wait and see.";
        field_c = new String[]{"On", "Off"};
        field_f = new ko();
    }
}
