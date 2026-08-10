/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends kj {
    int field_A;
    static String field_B;

    final static String a(int param0, long param1) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var3;
        long var4;
        long var7;
        int var9;
        int var10;
        int var11;
        java.applet.Applet var12;
        StringBuilder var13;
        StringBuilder var14;
        var11 = OrbDefence.field_D ? 1 : 0;
        if (param1 > 0L) {
          if (-6582952005840035282L < (param1 ^ -1L)) {
            if (0L != param1 % 37L) {
              var3 = 0;
              if (param0 != 14461) {
                var12 = (java.applet.Applet) null;
                jj.a((String) null, (byte) -111, (java.applet.Applet) null);
                var4 = param1;
                L0: while (true) {
                  if (-1L == (var4 ^ -1L)) {
                    var13 = new StringBuilder(var3);
                    L1: while (true) {
                      if (-1L == (param1 ^ -1L)) {
                        var13.reverse();
                        var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
                        return var13.toString();
                      } else {
                        L2: {
                          var7 = param1;
                          param1 = param1 / 37L;
                          var9 = nk.field_r[(int)(-(param1 * 37L) + var7)];
                          if (var9 != 95) {
                            break L2;
                          } else {
                            var10 = var13.length() - 1;
                            var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
                            var9 = 160;
                            break L2;
                          }
                        }
                        discarded$2 = var13.append((char) var9);
                        continue L1;
                      }
                    }
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    continue L0;
                  }
                }
              } else {
                var4 = param1;
                L3: while (true) {
                  if (-1L == (var4 ^ -1L)) {
                    var14 = new StringBuilder(var3);
                    L4: while (true) {
                      if (-1L == (param1 ^ -1L)) {
                        var14.reverse();
                        var14.setCharAt(0, Character.toUpperCase(var14.charAt(0)));
                        return var14.toString();
                      } else {
                        L5: {
                          var7 = param1;
                          param1 = param1 / 37L;
                          var9 = nk.field_r[(int)(-(param1 * 37L) + var7)];
                          if (var9 != 95) {
                            break L5;
                          } else {
                            var10 = var14.length() - 1;
                            var14.setCharAt(var10, Character.toUpperCase(var14.charAt(var10)));
                            var9 = 160;
                            break L5;
                          }
                        }
                        discarded$3 = var14.append((char) var9);
                        continue L4;
                      }
                    }
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    continue L3;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        hj var5;
        if (-1 != (param1 ^ -1)) {
          return;
        } else {
          if (this.field_y != null) {
            if (0 != this.field_A) {
              if (this.field_A == 256) {
                this.field_y.a(this.field_n + param0, param1, 1048575, this.field_s + param3);
                return;
              } else {
                var5 = new hj(this.field_y.field_m, this.field_y.field_r);
                de.a(-128, var5);
                this.field_y.a(0, param1, param2, 0);
                oc.g((byte) -105);
                var5.a(this.field_s + param3, param0 - -this.field_n, this.field_A);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    jj(pj param0) {
        super(param0.field_s, param0.field_n, param0.field_m, param0.field_r, (td) null, (ag) null);
        try {
            param0.a(0, 0, this.field_r, (byte) -90, this.field_m);
            this.field_A = 256;
            this.field_y = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "jj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public jj() {
        super(0, 0, 0, 0, (td) null, (ag) null);
        this.field_A = 256;
    }

    public static void k(int param0) {
        if (param0 != 37) {
            return;
        }
        field_B = null;
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            int var4 = 0;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            StringBuilder stackIn_9_1 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  var3 = new java.net.URL(param2.getCodeBase(), param0);
                  var3 = f.a(param2, var3, -95);
                  var4 = 106 / ((param1 - -46) / 47);
                  ke.a(var3.toString(), true, (byte) -100, param2);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref = (Exception) (Object) decompiledCaughtException;
                var3_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var3_ref2);

                stackIn_6_1 = new StringBuilder().append("jj.G(");

                if (param0 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L1;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L1;
                }
              }
              L2: {


                stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L2;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L2;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String l(int param0) {
        java.applet.Applet var2;
        if (null == gb.field_h) {
          return "";
        } else {
          if (param0 >= -94) {
            var2 = (java.applet.Applet) null;
            jj.a((String) null, (byte) 69, (java.applet.Applet) null);
            return gb.field_h;
          } else {
            return gb.field_h;
          }
        }
    }

    static {
        field_B = "Waiting for graphics";
    }
}
