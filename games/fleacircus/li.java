/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class li implements Iterable {
    static int field_i;
    static String field_e;
    static String field_d;
    lh[] field_f;
    private lh field_a;
    static String field_c;
    static String field_b;
    int field_g;
    static int field_j;
    static String field_h;

    public static void a(byte param0) {
        field_e = null;
        if (param0 >= -62) {
            return;
        }
        field_d = null;
        field_h = null;
        field_c = null;
        field_b = null;
    }

    final void a(long param0, lh param1, byte param2) {
        lh var5 = null;
        try {
            if (param2 != 43) {
                li.a((byte) -31);
            }
            if (!(null == param1.field_a)) {
                param1.c(param2 ^ -44);
            }
            var5 = this.field_f[(int)((long)(this.field_g - 1) & param0)];
            param1.field_a = var5.field_a;
            param1.field_h = var5;
            param1.field_a.field_h = param1;
            param1.field_h.field_a = param1;
            param1.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "li.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = fleas.field_A ? 1 : 0;
            if (wc.field_q <= 0) {
              break L1;
            } else {
              if (aa.field_r == null) {
                L2: {
                  L3: {
                    rh.field_p = wf.a(0, 640, 0, fg.field_q, 0, 480);
                    if (rh.field_p == null) {
                      break L3;
                    } else {
                      var2 = 2;
                      aj.a(0, rh.field_p);
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2 = 3;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    L4: {
                      if (!qh.c((byte) 71)) {
                        break L4;
                      } else {
                        var2 = 0;
                        break L4;
                      }
                    }
                    var2 = 1;
                    break L2;
                  }
                }
                if (param1 == -74) {
                  if (null != aa.field_r) {
                    return;
                  } else {
                    L5: {
                      if (sc.field_a) {
                        pf.a(var2, 1, param0);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              } else {
                rh.field_p = aa.field_r.b(param1 + -7862);
                qa.a((byte) 116, 2);
                if (var3 == 0) {
                  L6: {
                    if (rh.field_p == null) {
                      break L6;
                    } else {
                      var2 = 2;
                      aj.a(0, rh.field_p);
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var2 = 3;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  L7: {
                    L8: {
                      rh.field_p = wf.a(0, 640, 0, fg.field_q, 0, 480);
                      if (rh.field_p == null) {
                        break L8;
                      } else {
                        var2 = 2;
                        aj.a(0, rh.field_p);
                        if (var3 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var2 = 3;
                    if (var3 == 0) {
                      break L7;
                    } else {
                      L9: {
                        if (!qh.c((byte) 71)) {
                          break L9;
                        } else {
                          var2 = 0;
                          break L9;
                        }
                      }
                      var2 = 1;
                      break L7;
                    }
                  }
                  if (param1 == -74) {
                    if (null != aa.field_r) {
                      return;
                    } else {
                      L10: {
                        if (sc.field_a) {
                          pf.a(var2, 1, param0);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          L11: {
            if (!qh.c((byte) 71)) {
              break L11;
            } else {
              var2 = 0;
              if (var3 == 0) {
                break L0;
              } else {
                break L11;
              }
            }
          }
          var2 = 1;
          break L0;
        }
        if (param1 == -74) {
          if (null == aa.field_r) {
            if (!sc.field_a) {
              return;
            } else {
              pf.a(var2, 1, param0);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private li() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new na((li) (this)));
    }

    final lh a(boolean param0, long param1) {
        lh var4 = null;
        lh var5 = null;
        int var6 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackOut_5_0 = null;
        var6 = fleas.field_A ? 1 : 0;
        if (param0) {
          var4 = this.field_f[(int)(param1 & (long)(this.field_g + -1))];
          this.field_a = var4.field_h;
          L0: while (true) {
            if (var4 != this.field_a) {
              stackOut_5_0 = this;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var6 == 0) {
                if (((li) (this)).field_a.field_c == param1) {
                  var5 = this.field_a;
                  this.field_a = this.field_a.field_h;
                  return var5;
                } else {
                  this.field_a = this.field_a.field_h;
                  continue L0;
                }
              } else {
                ((li) (this)).field_a = null;
                return null;
              }
            } else {
              this.field_a = null;
              return null;
            }
          }
        } else {
          return (lh) null;
        }
    }

    static {
        field_c = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = "FULL ACCESS";
        field_e = "Loading graphics";
        field_h = "Waiting for extra data";
        field_j = 2;
    }
}
