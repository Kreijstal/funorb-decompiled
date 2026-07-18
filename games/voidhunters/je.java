/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static aba field_c;
    private mkb field_a;
    private mkb field_d;
    private vca field_b;

    final void a(boolean param0) {
        ((je) this).field_a.a(-108);
        if (param0) {
            je.b((byte) -55);
        }
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = jwa.a(false, param1);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          if (fg.a(var4.charAt(0), 104)) {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            return stackIn_19_0 != 0;
                          } else {
                            if (!fg.a(var4.charAt(var4.length() - 1), 26)) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (param1.length() <= var6) {
                                  if (0 < var5) {
                                    stackOut_33_0 = 0;
                                    stackIn_34_0 = stackOut_33_0;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  L4: {
                                    var7 = param1.charAt(var6);
                                    if (!fg.a((char) var7, 46)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (var5 < 2) {
                                      break L5;
                                    } else {
                                      if (!param2) {
                                        stackOut_28_0 = 0;
                                        stackIn_29_0 = stackOut_28_0;
                                        return stackIn_29_0 != 0;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                    }
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("je.B(").append(-31).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param2 + ')');
        }
        return stackIn_34_0 != 0;
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != 117) {
            je.b((byte) -3);
        }
    }

    final static void a(byte param0) {
        lsa var1 = (lsa) (Object) vfa.field_p.d(0);
        if (var1 == null) {
            ifb.l(-116);
            return;
        }
        faa var2 = qga.field_b;
        int discarded$0 = var2.h(62);
        int discarded$1 = var2.h(90);
        int discarded$2 = var2.h(60);
        int discarded$3 = var2.h(93);
        var1.b(-3846);
    }

    final void a(int param0, pf param1) {
        try {
            boolean discarded$0 = ((je) this).field_a.a(param0, 786336, 97);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "je.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    je(pf param0) {
        RuntimeException var2 = null;
        jaclib.memory.Stream var4 = null;
        int var4_int = 0;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        jaclib.memory.Buffer var9 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              vmb discarded$4 = param0.a(10, new qma[2]);
              ((je) this).field_a = param0.a(true, 3);
              ((je) this).field_d = param0.a(false, 3);
              boolean discarded$5 = ((je) this).field_d.a(12, 393168, 119);
              ((je) this).field_b = param0.a((byte) -19, false);
              ((je) this).field_b.a(25427, 49146);
              var7 = ((je) this).field_b.a((byte) -30, true);
              if (var7 == null) {
                break L1;
              } else {
                L2: {
                  var8 = param0.a(var7, false);
                  if (jaclib.memory.Stream.a()) {
                    var4_int = 0;
                    L3: while (true) {
                      if (var4_int >= 8191) {
                        break L2;
                      } else {
                        var5 = var4_int * 4;
                        var8.b(var5);
                        var8.b(var5 - -1);
                        var8.b(var5 + 2);
                        var8.b(var5 + 2);
                        var8.b(3 + var5);
                        var8.b(var5);
                        var4_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var4_int = 0;
                    L4: while (true) {
                      if (8191 <= var4_int) {
                        break L2;
                      } else {
                        var5 = 4 * var4_int;
                        var8.a(var5);
                        var8.a(var5 - -1);
                        var8.a(var5 + 2);
                        var8.a(2 + var5);
                        var8.a(var5 + 3);
                        var8.a(var5);
                        var4_int++;
                        continue L4;
                      }
                    }
                  }
                }
                var8.b();
                boolean discarded$6 = ((je) this).field_b.b(-93);
                break L1;
              }
            }
            L5: {
              var9 = ((je) this).field_d.a(true, (byte) 41);
              if (var9 == null) {
                break L5;
              } else {
                L6: {
                  var4 = param0.a(var9, false);
                  if (jaclib.memory.Stream.a()) {
                    var5 = 0;
                    L7: while (true) {
                      if (var5 >= 8191) {
                        break L6;
                      } else {
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var4.b(0.0f);
                        var4.b(-1.0f);
                        var4.b(0.0f);
                        var5++;
                        continue L7;
                      }
                    }
                  } else {
                    var5 = 0;
                    L8: while (true) {
                      if (var5 >= 8191) {
                        break L6;
                      } else {
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var4.a(0.0f);
                        var4.a(-1.0f);
                        var4.a(0.0f);
                        var5++;
                        continue L8;
                      }
                    }
                  }
                }
                var4.b();
                boolean discarded$7 = ((je) this).field_d.b(-20836);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("je.<init>(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new aba();
    }
}
