/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class eg extends na implements nf {
    na[] field_I;
    static je field_J;
    static String field_M;
    static String field_L;
    private static long[] field_O;
    static byte[] field_K;
    static String field_N;

    final StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        if (param3 != -372494750) {
            field_J = null;
        }
        if (!(!((eg) this).a(param0, param2, 105, param1))) {
            ((eg) this).a(param3 ^ 372494831, param1, param0, param2);
            this.b(param2, param1, param0, 0);
        }
        return param1;
    }

    final boolean a(na param0, int param1) {
        na[] var3 = null;
        int var4 = 0;
        na var5 = null;
        int var6 = 0;
        na[] var7 = null;
        L0: {
          var6 = TetraLink.field_J;
          if (param1 == -384169950) {
            break L0;
          } else {
            field_M = null;
            break L0;
          }
        }
        var7 = ((eg) this).field_I;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return false;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              if (var5.a(param0, -384169950)) {
                return true;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    eg(int param0, int param1, int param2, int param3, kg param4) {
        super(param0, param1, param2, param3, param4, (dn) null);
    }

    public static void g(int param0) {
        field_K = null;
        field_N = null;
        if (param0 != -1) {
            return;
        }
        field_O = null;
        field_J = null;
        field_L = null;
        field_M = null;
    }

    final int d(int param0) {
        int var2 = 0;
        na[] var3 = null;
        int var4 = 0;
        na var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        var2 = 0;
        var3 = ((eg) this).field_I;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            if (param0 <= -114) {
              return var2;
            } else {
              return 30;
            }
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.d(-120);
              if (var2 < var6) {
                var2 = var6;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void b(int param0, StringBuilder param1, Hashtable param2, int param3) {
        int var6 = 0;
        na var7 = null;
        int var8 = 0;
        int var9 = 0;
        na[] var10 = null;
        var9 = TetraLink.field_J;
        if (null == ((eg) this).field_I) {
          return;
        } else {
          var10 = ((eg) this).field_I;
          var6 = param3;
          L0: while (true) {
            if (var6 >= var10.length) {
              return;
            } else {
              var7 = var10[var6];
              StringBuilder discarded$34 = param1.append(10);
              var8 = 0;
              L1: while (true) {
                if (param0 < var8) {
                  if (var7 == null) {
                    StringBuilder discarded$35 = param1.append("null");
                    var6++;
                    continue L0;
                  } else {
                    StringBuilder discarded$36 = var7.a(param2, param1, 1 + param0, -372494750);
                    var6++;
                    continue L0;
                  }
                } else {
                  StringBuilder discarded$37 = param1.append(32);
                  var8++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final na a(int param0) {
        na[] var2 = null;
        int var3 = 0;
        na var4 = null;
        int var5 = 0;
        na[] var6 = null;
        var5 = TetraLink.field_J;
        if (((eg) this).field_I != null) {
          var6 = ((eg) this).field_I;
          var2 = var6;
          if (param0 == 18305) {
            var3 = 0;
            L0: while (true) {
              if (var6.length > var3) {
                var4 = var6[var3];
                if (var4 != null) {
                  if (var4.c(3)) {
                    return var4;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final boolean c(int param0) {
        if (param0 != 3) {
            return false;
        }
        return this.a(param0 + 18302) != null ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, -128, param3, param4);
        ((eg) this).d((byte) -127);
        int var6 = -83 % ((param2 - -61) / 51);
    }

    abstract void d(byte param0);

    final String e(int param0) {
        na[] var2 = null;
        int var3 = 0;
        na var4 = null;
        String var5 = null;
        int var6 = 0;
        var6 = TetraLink.field_J;
        if (((eg) this).field_I != null) {
          var2 = ((eg) this).field_I;
          var3 = param0;
          L0: while (true) {
            if (var3 < var2.length) {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.e(0);
                if (var5 != null) {
                  return var5;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        na[] var8 = null;
        int var9 = 0;
        na var10 = null;
        int var11 = 0;
        na[] var12 = null;
        L0: {
          var11 = TetraLink.field_J;
          if (param4 == -32738) {
            break L0;
          } else {
            field_L = null;
            break L0;
          }
        }
        if (((eg) this).field_I == null) {
          return false;
        } else {
          var12 = ((eg) this).field_I;
          var8 = var12;
          var9 = 0;
          L1: while (true) {
            if (var9 >= var12.length) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.a(param0, param1 + ((eg) this).field_t, param2, param3 - -((eg) this).field_w, -32738, param5, param6)) {
                  return true;
                } else {
                  var9++;
                  continue L1;
                }
              } else {
                var9++;
                continue L1;
              }
            }
          }
        }
    }

    private final boolean a(int param0, na param1, int param2) {
        int var4 = 0;
        na var5 = null;
        na var6 = null;
        int var7 = 0;
        var7 = TetraLink.field_J;
        if (((eg) this).field_I == null) {
          return false;
        } else {
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((eg) this).field_I.length) {
              var4 = 59 / ((param0 - -32) / 38);
              return false;
            } else {
              var5 = ((eg) this).field_I[var4];
              if (var5 != null) {
                if (var5.c(3)) {
                  var4 = var4 + param2;
                  L1: while (true) {
                    if (((eg) this).field_I.length > var4) {
                      L2: {
                        var6 = ((eg) this).field_I[var4];
                        if (var6 != null) {
                          if (!var6.a(param1, -384169950)) {
                            break L2;
                          } else {
                            return true;
                          }
                        } else {
                          break L2;
                        }
                      }
                      var4 = var4 + param2;
                      continue L1;
                    } else {
                      var4++;
                      continue L0;
                    }
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    private final boolean a(int param0, na param1) {
        if (param0 != 1) {
            Object var4 = null;
            boolean discarded$0 = ((eg) this).a((na) null, -49);
        }
        return this.a(true, 1, param1);
    }

    final boolean a(int param0, na param1, int param2, int param3, int param4, int param5, int param6) {
        na[] var8 = null;
        int var9 = 0;
        na var10 = null;
        int var11 = 0;
        na[] var12 = null;
        L0: {
          var11 = TetraLink.field_J;
          if (param0 == -19137) {
            break L0;
          } else {
            String discarded$2 = ((eg) this).e(-73);
            break L0;
          }
        }
        if (null != ((eg) this).field_I) {
          var12 = ((eg) this).field_I;
          var8 = var12;
          var9 = 0;
          L1: while (true) {
            if (var9 >= var12.length) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.c(3)) {
                  if (var10.a(-19137, param1, param2, param3, param4, param5, param6)) {
                    return true;
                  } else {
                    var9++;
                    continue L1;
                  }
                } else {
                  var9++;
                  continue L1;
                }
              } else {
                var9++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    private final boolean a(boolean param0, int param1, na param2) {
        int var4 = 0;
        na var5 = null;
        na var6 = null;
        int var7 = 0;
        L0: {
          var7 = TetraLink.field_J;
          if (param0) {
            break L0;
          } else {
            field_N = null;
            break L0;
          }
        }
        if (null == ((eg) this).field_I) {
          return false;
        } else {
          var4 = -1 + ((eg) this).field_I.length;
          L1: while (true) {
            if (0 > var4) {
              return false;
            } else {
              var5 = ((eg) this).field_I[var4];
              if (var5 != null) {
                if (var5.c(3)) {
                  var4 = var4 - param1;
                  L2: while (true) {
                    if (-1 >= (var4 ^ -1)) {
                      L3: {
                        var6 = ((eg) this).field_I[var4];
                        if (var6 != null) {
                          if (!var6.a(param2, -384169950)) {
                            break L3;
                          } else {
                            return true;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var4 = var4 - param1;
                      continue L2;
                    } else {
                      var4--;
                      continue L1;
                    }
                  }
                } else {
                  var4--;
                  continue L1;
                }
              } else {
                var4--;
                continue L1;
              }
            }
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        na var6 = null;
        int var7 = 0;
        L0: {
          var7 = TetraLink.field_J;
          if (param3 != 0) {
            break L0;
          } else {
            if (((eg) this).field_H != null) {
              ((eg) this).field_H.a((na) this, param1, param2, true, true);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 0) {
            break L1;
          } else {
            field_N = null;
            break L1;
          }
        }
        L2: {
          if (((eg) this).field_I != null) {
            var5 = -1 + ((eg) this).field_I.length;
            L3: while (true) {
              if (-1 < (var5 ^ -1)) {
                break L2;
              } else {
                var6 = ((eg) this).field_I[var5];
                if (var6 != null) {
                  var6.a(0, ((eg) this).field_t + param1, param2 + ((eg) this).field_w, param3);
                  var5--;
                  continue L3;
                } else {
                  var5--;
                  continue L3;
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    final void f(int param0) {
        na[] var2 = null;
        int var3 = 0;
        na var4 = null;
        int var5 = 0;
        na[] var6 = null;
        L0: {
          var5 = TetraLink.field_J;
          if (param0 < -63) {
            break L0;
          } else {
            ((eg) this).a(80, 112, -68, 77, -76);
            break L0;
          }
        }
        var6 = ((eg) this).field_I;
        var2 = var6;
        var3 = 0;
        L1: while (true) {
          if (var3 >= var6.length) {
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.f(-128);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    private final boolean a(na param0, byte param1) {
        if (param1 != 45) {
            return true;
        }
        return this.a(-115, param0, 1);
    }

    void a(na param0, int param1, int param2, boolean param3) {
        na[] var5 = null;
        int var6 = 0;
        na var7 = null;
        int var8 = 0;
        na[] var9 = null;
        var8 = TetraLink.field_J;
        super.a(param0, param1, param2, param3);
        if (null != ((eg) this).field_I) {
          var9 = ((eg) this).field_I;
          var5 = var9;
          var6 = 0;
          L0: while (true) {
            if (var9.length <= var6) {
              return;
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                var7.a(param0, ((eg) this).field_t + param1, ((eg) this).field_w + param2, param3);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        na[] var5_ref_na__ = null;
        int var5 = 0;
        int var6 = 0;
        na var7 = null;
        int var8 = 0;
        na[] var9 = null;
        boolean stackIn_19_0 = false;
        boolean stackOut_18_0 = false;
        boolean stackOut_17_0 = false;
        var8 = TetraLink.field_J;
        if (((eg) this).field_I == null) {
          return false;
        } else {
          var9 = ((eg) this).field_I;
          var5_ref_na__ = var9;
          if (param2 == 1) {
            var6 = 0;
            L0: while (true) {
              if (var9.length <= var6) {
                var5 = param0;
                if (-81 != (var5 ^ -1)) {
                  return false;
                } else {
                  L1: {
                    if (sn.field_a[81]) {
                      stackOut_18_0 = this.a(1, param3);
                      stackIn_19_0 = stackOut_18_0;
                      break L1;
                    } else {
                      stackOut_17_0 = this.a(param3, (byte) 45);
                      stackIn_19_0 = stackOut_17_0;
                      break L1;
                    }
                  }
                  return stackIn_19_0;
                }
              } else {
                var7 = var9[var6];
                if (var7 != null) {
                  if (var7.c(param2 + 2)) {
                    if (var7.a(param0, param1, 1, param3)) {
                      return true;
                    } else {
                      var6++;
                      continue L0;
                    }
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  var6++;
                  continue L0;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        na[] var7 = null;
        int var8 = 0;
        na var9 = null;
        int var10 = 0;
        na[] var11 = null;
        var10 = TetraLink.field_J;
        if (null == ((eg) this).field_I) {
          return;
        } else {
          var11 = ((eg) this).field_I;
          var7 = var11;
          if (!param1) {
            var8 = 0;
            L0: while (true) {
              if (var8 >= var11.length) {
                return;
              } else {
                var9 = var11[var8];
                if (var9 != null) {
                  var9.a(param0, false, param2, param3 + ((eg) this).field_w, param4, ((eg) this).field_t + param5);
                  var8++;
                  continue L0;
                } else {
                  var8++;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_J = new je();
        field_M = "<%0> has resigned.";
        field_L = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_O = new long[256];
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (-9 >= (var3 ^ -1)) {
                field_O[var2] = var0;
                var2++;
                continue L0;
              } else {
                if (-2L == (var0 & 1L ^ -1L)) {
                  var0 = -3932672073523589310L ^ var0 >>> -1022872191;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
