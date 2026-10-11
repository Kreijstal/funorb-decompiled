/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static String field_a;
    private fc field_d;
    private ja field_b;
    static String[] field_c;

    final fc a(int param0) {
        fc var2 = this.field_b.field_d.field_e;
        if (param0 <= 43) {
          this.field_b = (ja) null;
        }
        if (var2 == this.field_b.field_d) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.field_e;
        return var2;
    }

    final fc a(boolean param0, fc param1) {
        fc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        fc stackIn_8_0 = null;
        fc stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_b.field_d.field_e;
          }
          if (var3 == this.field_b.field_d) {
            this.field_d = null;
            stackIn_5_0 = null;
            return (fc) (stackIn_5_0);
          }
          if (!param0) {
            stackIn_8_0 = (fc) null;
            return stackIn_8_0;
          }
          this.field_d = var3.field_e;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ue.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence[] param1, byte param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          if (param3 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param3 == 1) {
            var10 = param1[param0];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_8_0 = "null";
            return stackIn_8_0;
          }
          var4_int = param0 + param3;
          var5 = 0;
          if (param2 != 57) {
            stackIn_11_0 = (String) null;
            return stackIn_11_0;
          }
          for (var6_int = param0; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param1[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param0; var7 < var4_int; var7++) {
            var8 = param1[var7];
            if (var8 != null) {
              discarded$3 = var6.append(var8);
            } else {
              discarded$4 = var6.append("null");
            }
          }
          stackIn_25_0 = var6.toString();
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("ue.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final fc a(byte param0, fc param1) {
        fc var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        Object stackIn_7_0 = null;
        fc stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -37) {
            var4 = (String) null;
            ue.a((java.net.URL) null, 89, (String) null, 12, (String) null);
          }
          if (param1 == null) {
            var3 = this.field_b.field_d.field_h;
          } else {
            var3 = param1;
          }
          if (var3 != this.field_b.field_d) {
            this.field_d = var3.field_h;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_d = null;
          stackIn_7_0 = null;
          return (fc) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ue.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static java.net.URL a(java.net.URL param0, int param1, String param2, int param3, String param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_41_0 = null;
          java.net.URL stackIn_43_0 = null;
          RuntimeException stackIn_46_0 = null;
          StringBuilder stackIn_46_1 = null;
          String stackIn_47_2 = null;
          StringBuilder stackIn_49_1 = null;
          String stackIn_50_2 = null;
          StringBuilder stackIn_52_1 = null;
          String stackIn_53_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          int var8 = 0;
          Exception var9 = null;
          int var10 = 0;
          int var7_intLifetime1;
          int var7_intLifetime2;
          int var7_intLifetime3;
          var10 = TrackController.field_F ? 1 : 0;
          try {
            var5 = param0.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if (var7_int >= 0) {
                  if (0 <= param3) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_intLifetime1 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime1 >= 0) {
                  var6 = var7_intLifetime1;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/p=", 0, 3)) {
                var7_intLifetime2 = var5.indexOf('/', var6 + 1);
                if (var7_intLifetime2 >= 0) {
                  if (param2 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime2);
                    continue;
                  }
                  var6 = var7_intLifetime2;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/s=", 0, 3) ||
                var5.regionMatches(var6, "/c=", 0, 3)) {
                var7_intLifetime3 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime3 >= 0) {
                  if (param4 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime3);
                    continue;
                  }
                  var6 = var7_intLifetime3;
                  continue;
                }
              }
              break;
            }
            var7 = new StringBuilder(var6);
            discarded$0 = var7.append(var5.substring(0, var6));
            if (param3 > 0) {
              discarded$1 = var7.append("/l=");
              discarded$2 = var7.append(Integer.toString(param3));
            }
            var8 = 108 % ((param1 + 59) / 50);
            if (param2 != null &&
              param2.length() > 0) {
              discarded$3 = var7.append("/p=");
              discarded$4 = var7.append(param2);
            }
            if (param4 != null &&
              param4.length() > 0) {
              discarded$5 = var7.append("/s=");
              discarded$6 = var7.append(param4);
            }
            if (var6 < var5.length()) {
              discarded$7 = var7.append(var5.substring(var6, var5.length()));
            } else {
              discarded$8 = var7.append('/');
            }
            try {
              stackIn_41_0 = new java.net.URL(param0, var7.toString());
              return stackIn_41_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var9 = (Exception) (Object) decompiledCaughtException;
              var9.printStackTrace();
              stackIn_43_0 = (java.net.URL) (param0);
              return stackIn_43_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_46_0 = var5_ref;
            stackIn_46_1 = new StringBuilder().append("ue.J(");
            if (param0 == null) {
              stackIn_47_2 = "null";
            } else {
              stackIn_47_2 = "{...}";
            }
            stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_50_2 = "null";
            } else {
              stackIn_50_2 = "{...}";
            }
            stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_53_2 = "null";
            } else {
              stackIn_53_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final fc e(int param0) {
        fc var2 = this.field_d;
        if (var2 == this.field_b.field_d) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.field_h;
        if (param0 != 37) {
          field_a = (String) null;
        }
        return var2;
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        if (param0 >= -119) {
          field_c = (String[]) null;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        param1 = -65 & param1;
        int var4 = ud.a((byte) 54, param1);
        if (param2 != 91) {
          ue.a(-77, '\037');
        }
        nl.a(e.a(param1, -1932340400, var4), true, -257, param0, 0, var4, param3, param1);
    }

    final static String a(long param0, byte param1) {
        StringBuilder discarded$0 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var11;
        int var10;
        String var12;
        var11 = TrackController.field_F ? 1 : 0;
        if (param0 <= 0L) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        var3 = 0;
        var4 = param0;
        while (var4 != 0L) {
          var3++;
          var4 = var4 / 37L;
        }
        var6 = new StringBuilder(var3);
        while (0L != param0) {
          var7 = param0;
          param0 = param0 / 37L;
          var9 = lg.field_b[(int)(-(37L * param0) + var7)];
          if (95 == var9) {
            var10 = -1 + var6.length();
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            var9 = 160;
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        if (param1 <= 28) {
          var12 = (String) null;
          ue.a((String) null, true);
        }
        return var6.toString();
    }

    final fc c(int param0) {
        fc var2 = this.field_d;
        if (this.field_b.field_d == var2) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.field_e;
        if (param0 > -8) {
          this.e(-30);
        }
        return var2;
    }

    final static boolean a(int param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (vl.a(param1, 18102)) {
          return true;
        }
        if (param1 != 45 &&
          param1 != 160 &&
          param1 != 32 &&
          param1 != 95) {
          if (param0 == -16490) {
            return false;
          }
          return true;
        }
        return true;
    }

    final static void a(String param0, boolean param1) {
        try {
          ab.field_b = param0;
          qc.b(12, (byte) -42);
          if (param1) {
            ue.a(-17L, (byte) 10);
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ue.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final fc d(int param0) {
        fc var2 = this.field_b.field_d.field_h;
        int var3 = 61 / ((38 - param0) / 34);
        if (this.field_b.field_d == var2) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.field_h;
        return var2;
    }

    ue(ja param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
