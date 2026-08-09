/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static String field_e;
    private boolean field_i;
    static cj[] field_h;
    static boolean field_k;
    private int field_a;
    private int[] field_o;
    static double field_n;
    static int field_d;
    static String field_b;
    static int field_m;
    static byte[] field_g;
    private int field_f;
    static int[] field_c;
    static ri[] field_l;
    static ja field_j;

    private final void b(int param0, byte param1) {
        int[] var3;
        int[] var4;
        if (param1 <= 21) {
          field_l = (ri[]) null;
          var4 = new int[this.a(param0, (byte) 104)];
          var3 = var4;
          d.a(this.field_o, 0, var4, 0, this.field_o.length);
          this.field_o = var4;
          return;
        } else {
          var4 = new int[this.a(param0, (byte) 104)];
          var3 = var4;
          d.a(this.field_o, 0, var4, 0, this.field_o.length);
          this.field_o = var4;
          return;
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        boolean stackOut_2_0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    var3 = this.field_o.length;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param0 < var3) {
                        statePc = 8;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = this.field_i;
                    stackIn_9_0 = stackOut_2_0 ? 1 : 0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var4 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var3 = var3 + this.field_f;
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var3 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var3 = 1;
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var3 = var3 * this.field_f;
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_9_0 = param1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 <= 101) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return var3;
                }
                case 11: {
                    return -50;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 <= this.field_a) {
          if (this.field_o.length > param0) {
            if (param2 != 0) {
              return;
            } else {
              this.field_o[param0] = param1;
              return;
            }
          } else {
            this.b(param0, (byte) 79);
            if (param2 != 0) {
              return;
            } else {
              this.field_o[param0] = param1;
              return;
            }
          }
        } else {
          this.field_a = param0;
          if (this.field_o.length <= param0) {
            this.b(param0, (byte) 79);
            if (param2 != 0) {
              return;
            } else {
              this.field_o[param0] = param1;
              return;
            }
          } else {
            if (param2 != 0) {
              return;
            } else {
              this.field_o[param0] = param1;
              return;
            }
          }
        }
    }

    final void b(byte param0, int param1) {
        if (param0 != -7) {
            return;
        }
        this.a(1 + this.field_a, param1, param0 ^ -7);
    }

    final int a(byte param0, int param1) {
        if (param0 != 105) {
            return 57;
        }
        if (!(this.field_a >= param1)) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        return this.field_o[param1];
    }

    final int b(int param0) {
        int discarded$0 = 0;
        if (param0 != 1) {
            discarded$0 = this.a(-120, (byte) 109);
            return this.field_a - -1;
        }
        return this.field_a - -1;
    }

    public static void a(int param0) {
        field_c = null;
        field_j = null;
        if (param0 > -4) {
          return;
        } else {
          field_b = null;
          field_l = null;
          field_e = null;
          field_h = null;
          field_g = null;
          return;
        }
    }

    final void a(int param0, int param1) {
        int var3;
        if (0 <= param1) {
          if (this.field_a >= param1) {
            if (this.field_a != param1) {
              d.a(this.field_o, param1 + 1, this.field_o, param1, -param1 + this.field_a);
              var3 = -95 / ((param0 - 37) / 32);
              this.field_a = this.field_a - 1;
              return;
            } else {
              var3 = -95 / ((param0 - 37) / 32);
              this.field_a = this.field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    private la() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_b = "The invitation has been withdrawn.";
        field_n = 0.0;
        field_g = new byte[520];
    }
}
