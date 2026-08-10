/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    static int[] field_a;
    private ec field_b;
    private ec field_c;

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 != 24574) {
            field_a = (int[]) null;
            hf.a(param2, 17072, param0, (String) null);
            return;
        }
        hf.a(param2, 17072, param0, (String) null);
    }

    final int a(int param0) {
        int var2;
        ec var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        var2 = 0;
        if (param0 != -29749) {
          this.c(127);
          var3 = this.field_b.field_i;
          L0: while (true) {
            L1: {
              if (var3 == this.field_b) {
                break L1;
              } else {
                var2++;
                var3 = var3.field_i;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var2;
          }
        } else {
          var3 = this.field_b.field_i;
          L2: while (true) {
            L3: {
              if (var3 == this.field_b) {
                break L3;
              } else {
                var2++;
                var3 = var3.field_i;
                if (var4 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            return var2;
          }
        }
    }

    final ec c(int param0) {
        ec var2;
        if (param0 == 0) {
          var2 = this.field_b.field_i;
          if (var2 == this.field_b) {
            return null;
          } else {
            var2.a(97);
            return var2;
          }
        } else {
          return (ec) null;
        }
    }

    final void a(ec param0, int param1) {
        try {
            if (param0.field_k != null) {
                param0.a(97);
            }
            param0.field_i = this.field_b;
            param0.field_k = this.field_b.field_k;
            param0.field_k.field_i = param0;
            if (param1 != 0) {
                field_a = (int[]) null;
            }
            param0.field_i.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "hl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -113) {
            hl.a(true, -54, false);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static String a(String param0, String param1, String param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = SolKnight.field_L ? 1 : 0;
                    if (param3) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_a = (int[]) null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 2: {
                    var4 = param0.indexOf(param2);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (-1 == var4) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    param0 = param0.substring(0, var4) + param1 + param0.substring(var4 + param2.length());
                    stackIn_7_0 = (String) (param0);
                    stackIn_5_0 = stackIn_7_0;
                    if (var5 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = ((String) (Object) stackIn_5_0).indexOf(param2, var4 + param1.length());
                    if (var5 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_7_0 = (String) (param0);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    var4 = param0.indexOf(param2);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (-1 == var4) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    param0 = param0.substring(0, var4) + param1 + param0.substring(var4 + param2.length());
                    stackIn_13_0 = (String) (param0);
                    stackIn_11_0 = stackIn_13_0;
                    if (var5 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var4 = ((String) (Object) stackIn_11_0).indexOf(param2, var4 + param1.length());
                    if (var5 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (String) (param0);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    return stackIn_13_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ec d(int param0) {
        ec var2;
        var2 = this.field_b.field_i;
        if (var2 != this.field_b) {
          this.field_c = var2.field_i;
          if (param0 <= 113) {
            return (ec) null;
          } else {
            return var2;
          }
        } else {
          this.field_c = null;
          return null;
        }
    }

    final ec b(int param0) {
        ec var2;
        if (param0 == -1) {
          var2 = this.field_c;
          if (this.field_b == var2) {
            this.field_c = null;
            return null;
          } else {
            this.field_c = var2.field_i;
            return var2;
          }
        } else {
          field_a = (int[]) null;
          var2 = this.field_c;
          if (this.field_b == var2) {
            this.field_c = null;
            return null;
          } else {
            this.field_c = var2.field_i;
            return var2;
          }
        }
    }

    public hl() {
        this.field_b = new ec();
        this.field_b.field_k = this.field_b;
        this.field_b.field_i = this.field_b;
    }

    static {
        field_a = new int[8192];
    }
}
