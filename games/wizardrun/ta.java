/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ta {
    static rc field_c;
    static String field_d;
    static int field_a;
    static String field_e;
    static o field_b;
    static String field_f;

    final static boolean a(byte param0) {
        int stackIn_9_0 = 0;
        L0: {
          if (param0 == 60) {
            break L0;
          } else {
            field_f = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (ri.field_a < 20) {
              break L2;
            } else {
              if (!ph.a((byte) 71)) {
                break L2;
              } else {
                L3: {
                  if (0 >= ei.field_t) {
                    break L3;
                  } else {
                    if (hd.g((byte) 80)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_9_0 = 0;
                break L1;
              }
            }
          }
          stackIn_9_0 = 1;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public static void b(int param0) {
        field_d = null;
        field_f = null;
        field_c = null;
        if (param0 != -1) {
            field_c = (rc) null;
        }
        field_e = null;
        field_b = null;
    }

    abstract void a(java.awt.Component param0, int param1);

    abstract void b(java.awt.Component param0, int param1);

    abstract int a(int param0);

    final static String a(int param0, CharSequence param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = wizardrun.field_H;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!d.a(true, param1.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var2_int >= var3) {
                      break L4;
                    } else {
                      if (!d.a(true, param1.charAt(var3 + -1))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  L5: {
                    var4 = -var2_int + var3;
                    if (param0 <= -48) {
                      break L5;
                    } else {
                      field_b = (o) null;
                      break L5;
                    }
                  }
                  if (var4 >= 1) {
                    if ((var4 ^ -1) >= -13) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L6: while (true) {
                        if (var6 >= var3) {
                          if (var5.length() != 0) {
                            return var5.toString();
                          } else {
                            return null;
                          }
                        } else {
                          L7: {
                            var7 = param1.charAt(var6);
                            if (fg.a((char) var7, 0)) {
                              var8 = sf.a(-1514, (char) var7);
                              if (var8 != 0) {
                                discarded$0 = var5.append((char) var8);
                                break L7;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var2);

            stackIn_33_1 = new StringBuilder().append("ta.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        return (String) ((Object) stackIn_3_0);
    }

    static {
        field_d = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_e = "Members";
        field_f = "take you to the top.  Beware of the rats doing this.";
        field_c = new rc();
    }
}
