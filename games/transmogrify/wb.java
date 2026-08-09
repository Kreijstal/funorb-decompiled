/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    private int field_b;
    private ri[] field_c;
    static String field_d;
    private long field_a;
    private ri field_e;

    final ri a(long param0, byte param1) {
        ri var4;
        int var5;
        ri var6;
        int var7;
        Object stackIn_5_0 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        this.field_a = param0;
        var4 = this.field_c[(int)((long)(-1 + this.field_b) & param0)];
        var5 = -40 % ((74 - param1) / 47);
        this.field_e = var4.field_h;
        L0: while (true) {
          if (this.field_e != var4) {
            stackIn_5_0 = this;

            if (var7 == 0) {
              if (((wb) (this)).field_e.field_j == param0) {
                var6 = this.field_e;
                this.field_e = this.field_e.field_h;
                return var6;
              } else {
                this.field_e = this.field_e.field_h;
                if (var7 == 0) {
                  continue L0;
                } else {
                  this.field_e = null;
                  return null;
                }
              }
            } else {
              ((wb) (this)).field_e = null;
              return null;
            }
          } else {
            this.field_e = null;
            return null;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != 83) {
            wb.b((byte) -101);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 != null) {
                    try {
                      L2: {
                        var2 = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                        qa.field_p = 1 + (int)(var3.longValue() / 1048576L);
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2_ref = decompiledCaughtException;
                        break L3;
                      }
                    }
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param0 == -124) {
                  break L0;
                } else {
                  field_d = (String) null;
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ri a(int param0) {
        ri var2;
        int var3;
        ri var3_ref_ri;
        int var4;
        int stackIn_7_0 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (null != this.field_e) {
          var2 = this.field_c[(int)((long)(-1 + this.field_b) & this.field_a)];
          L0: while (true) {
            if (this.field_e != var2) {
              stackIn_7_0 = ((this.field_e.field_j ^ -1L) < (this.field_a ^ -1L) ? -1 : ((this.field_e.field_j ^ -1L) == (this.field_a ^ -1L) ? 0 : 1));

              if (var4 == 0) {
                if (stackIn_7_0 != 0) {
                  this.field_e = this.field_e.field_h;
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    var3 = -43 % ((param0 - -19) / 55);
                    this.field_e = null;
                    return null;
                  }
                } else {
                  var3_ref_ri = this.field_e;
                  this.field_e = this.field_e.field_h;
                  return var3_ref_ri;
                }
              } else {
                var3 = stackIn_7_0;
                this.field_e = null;
                return null;
              }
            } else {
              var3 = -43 % ((param0 - -19) / 55);
              this.field_e = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    wb(int param0) {
        ri dupTemp$1 = null;
        int var2 = 0;
        ri var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    this.field_c = new ri[param0];
                    this.field_b = param0;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param0 <= var2) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    dupTemp$1 = new ri();
                    var3 = dupTemp$1;
                    this.field_c[var2] = dupTemp$1;
                    var3.field_h = var3;
                    var3.field_g = var3;
                    var2++;
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, long param1, ri param2) {
        ri var5 = null;
        try {
            if (null != param2.field_g) {
                param2.b((byte) -59);
            }
            var5 = this.field_c[(int)((long)(this.field_b + -1) & param1)];
            param2.field_g = var5.field_g;
            param2.field_h = var5;
            param2.field_g.field_h = param2;
            param2.field_j = param1;
            if (param0 != 19200) {
                this.a(117);
            }
            param2.field_h.field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "wb.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
