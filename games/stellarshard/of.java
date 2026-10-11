/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends dg {
    static int field_B;
    static int field_A;
    static volatile boolean field_F;
    static String field_D;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (param0 < 36) {
                field_F = false;
              }
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(lk.a(param1, var2, -110), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("of.S(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        CharSequence var4;
        var3 = stellarshard.field_B;
        if (param0 >= -109) {
          var4 = (CharSequence) null;
          of.a((CharSequence) null, (byte) -65);
        }
        var2 = param1;
        if (var2 == 32) {
          return '_';
        }
        if (160 == var2 &&
          var3 == 0) {
          return '_';
        }
        if (var2 == 95 &&
          var3 == 0) {
          return '_';
        }
        if (45 == var2 &&
          var3 == 0) {
          return '_';
        }
        if (var2 == 91) {
          return param1;
        }
        if (93 == var2 &&
          var3 == 0) {
          return param1;
        }
        if (35 == var2) {
          return param1;
        }
        if (var2 == 224 &&
          var3 == 0) {
          return 'a';
        }
        if (var2 == 225 &&
          var3 == 0) {
          return 'a';
        }
        if (var2 == 226 &&
          var3 == 0) {
          return 'a';
        }
        if (var2 == 228 &&
          var3 == 0) {
          return 'a';
        }
        if (227 == var2) {
          return 'a';
        }
        if (192 == var2 &&
          var3 == 0) {
          return 'a';
        }
        if (var2 == 193) {
          return 'a';
        }
        if (var2 == 194) {
          return 'a';
        }
        if (var2 == 196) {
          return 'a';
        }
        if (var2 == 195) {
          return 'a';
        }
        if (var2 == 232 &&
          var3 == 0) {
          return 'e';
        }
        if (var2 == 233) {
          return 'e';
        }
        if (var2 == 234 &&
          var3 == 0) {
          return 'e';
        }
        if (var2 == 235) {
          return 'e';
        }
        if (var2 == 200) {
          return 'e';
        }
        if (201 == var2 &&
          var3 == 0) {
          return 'e';
        }
        if (202 == var2) {
          return 'e';
        }
        if (var2 == 203) {
          return 'e';
        }
        if (var2 == 237 &&
          var3 == 0) {
          return 'i';
        }
        if (var2 == 238 &&
          var3 == 0) {
          return 'i';
        }
        if (239 == var2 &&
          var3 == 0) {
          return 'i';
        }
        if ((var2 != 205 ||
          var3 != 0) &&
          (var2 != 206 &&
          207 != var2)) {
          if ((242 != var2 ||
            var3 != 0) && (var2 != 243 &&
            var2 != 244 &&
            var2 != 246 &&
            var2 != 245) && (210 != var2 ||
            var3 != 0) && (211 != var2 ||
            var3 != 0) && (var2 != 212 ||
            var3 != 0) && (var2 != 214 &&
            213 != var2)) {
            if (var2 != 249 &&
              250 != var2 && (var2 != 251 ||
              var3 != 0) && 252 != var2 && (var2 != 217 ||
              var3 != 0) && 218 != var2 && (var2 != 219 ||
              var3 != 0)) {
              if (var2 != 220) {
                if (var2 != 231) {
                  if (var2 != 199) {
                    if (var2 != 255) {
                      if (var2 != 376) {
                        if (var2 != 241) {
                          if (var2 != 209) {
                            if (var2 == 223) {
                              return 'b';
                            }
                            return Character.toLowerCase(param1);
                          }
                          if (var3 != 0) {
                            return Character.toLowerCase(param1);
                          }
                        } else {
                          if (var3 != 0) {
                            return Character.toLowerCase(param1);
                          }
                        }
                        return 'n';
                      }
                      if (var3 != 0) {
                        return Character.toLowerCase(param1);
                      }
                    } else {
                      if (var3 != 0) {
                        return Character.toLowerCase(param1);
                      }
                    }
                    return 'y';
                  }
                } else {
                  if (var3 != 0) {
                    return Character.toLowerCase(param1);
                  }
                }
                return 'c';
              }
              if (var3 != 0) {
                return Character.toLowerCase(param1);
              }
            }
            return 'u';
          }
          return 'o';
        }
        return 'i';
    }

    public static void d(byte param0) {
        field_D = null;
        if (param0 > -117) {
          of.d((byte) 94);
        }
    }

    final static String i(int param0) {
        if (param0 != 195) {
          return (String) null;
        }
        if (wf.field_b == null) {
          return "";
        }
        return wf.field_b;
    }

    final void a(int param0, int param1, rj param2, int param3, int param4, int param5) {
        int var8 = 0;
        dl var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          super.a(param0, -111, param2, param3, param4, param5);
          var8 = 58 % ((param1 + 50) / 57);
          var9 = lk.field_e;
          if (var9 != null &&
            this.a((byte) 127, param4, param0, param5, param3)) {
            if (!(this.field_v instanceof jh)) {
              if (!(var9.field_v instanceof jh)) {
                return;
              }
              ((jh) (var9.field_v)).a(this, (byte) 107, var9);
              lk.field_e = null;
              if (stellarshard.field_B == 0) {
                return;
              }
            }
            ((jh) (this.field_v)).a(this, (byte) 30, var9);
            lk.field_e = null;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("of.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private of(int param0, int param1, int param2, int param3, uk param4, lf param5, rj param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_y = param6;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "of.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 113) {
            field_A = 45;
          }
          stackIn_3_0 = rc.a(false, 10, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("of.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_B = 0;
        field_F = true;
        field_A = 1;
        field_D = "Music: ";
    }
}
