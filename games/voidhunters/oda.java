/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class oda extends shb implements nea {
    static String field_t;
    shb[] field_u;

    final int c(int param0) {
        int var2 = 0;
        shb[] var3 = null;
        int var4 = 0;
        shb var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        var2 = 0;
        var3 = ((oda) this).field_u;
        var4 = param0;
        L0: while (true) {
          if (var4 >= var3.length) {
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.c(0);
              if (var6 > var2) {
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

    final String d(byte param0) {
        shb[] var2 = null;
        int var3 = 0;
        shb var4 = null;
        String var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (((oda) this).field_u != null) {
          var2 = ((oda) this).field_u;
          var3 = 0;
          L0: while (true) {
            if (var2.length <= var3) {
              if (param0 != 125) {
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.d((byte) 125);
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
            }
          }
        } else {
          return null;
        }
    }

    void a(int param0, int param1, int param2, shb param3) {
        shb[] var5 = null;
        int var6 = 0;
        shb var7 = null;
        int var8 = 0;
        shb[] var9 = null;
        var8 = VoidHunters.field_G;
        super.a(param0, param1, param2 ^ 0, param3);
        if (null == ((oda) this).field_u) {
          return;
        } else {
          var9 = ((oda) this).field_u;
          var5 = var9;
          var6 = 0;
          L0: while (true) {
            if (var6 >= var9.length) {
              L1: {
                if (param2 == -981) {
                  break L1;
                } else {
                  field_t = null;
                  break L1;
                }
              }
              return;
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                var7.a(param0 - -((oda) this).field_r, ((oda) this).field_g + param1, -981, param3);
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        }
    }

    abstract void d(int param0);

    final StringBuilder a(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        if (param0) {
            field_t = null;
        }
        if (((oda) this).a(param1, param2, (byte) -113, param3)) {
            ((oda) this).a(72, param2, param1, param3);
            this.a(false, param3, param1, param2);
        }
        return param3;
    }

    boolean a(int param0, int param1, int param2, shb param3, int param4, int param5, int param6) {
        shb[] var8 = null;
        int var9 = 0;
        shb var10 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        if (((oda) this).field_u == null) {
          return false;
        } else {
          L0: {
            var8 = ((oda) this).field_u;
            var9 = 0;
            if (param1 == -6006) {
              break L0;
            } else {
              field_t = null;
              break L0;
            }
          }
          L1: while (true) {
            if (var9 >= var8.length) {
              return false;
            } else {
              var10 = var8[var9];
              if (var10 != null) {
                if (var10.e((byte) -120)) {
                  if (var10.a(param0, -6006, param2, param3, param4, param5, param6)) {
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
        }
    }

    final boolean a(int param0, shb param1, int param2) {
        int var4 = 0;
        shb var5 = null;
        shb var6 = null;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (null != ((oda) this).field_u) {
          var4 = param2;
          L0: while (true) {
            if (var4 >= ((oda) this).field_u.length) {
              return false;
            } else {
              var5 = ((oda) this).field_u[var4];
              if (var5 != null) {
                if (var5.e((byte) -120)) {
                  var4 = var4 + param0;
                  L1: while (true) {
                    if (var4 < ((oda) this).field_u.length) {
                      L2: {
                        var6 = ((oda) this).field_u[var4];
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (!var6.a(param2 + 0, param1)) {
                            break L2;
                          } else {
                            return true;
                          }
                        }
                      }
                      var4 = var4 + param0;
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
        } else {
          return false;
        }
    }

    boolean a(int param0, int param1, shb param2, char param3) {
        shb[] var5_ref_shb__ = null;
        int var5 = 0;
        int var6 = 0;
        shb var7 = null;
        int var8 = 0;
        shb[] var9 = null;
        boolean stackIn_19_0 = false;
        boolean stackOut_18_0 = false;
        boolean stackOut_17_0 = false;
        var8 = VoidHunters.field_G;
        if (null != ((oda) this).field_u) {
          L0: {
            var9 = ((oda) this).field_u;
            var5_ref_shb__ = var9;
            if (param0 == -15834) {
              break L0;
            } else {
              ((oda) this).field_u = null;
              break L0;
            }
          }
          var6 = 0;
          L1: while (true) {
            if (var9.length <= var6) {
              var5 = param1;
              if (-81 == (var5 ^ -1)) {
                L2: {
                  if (si.field_o[81]) {
                    stackOut_18_0 = ((oda) this).a(param2, (byte) -63);
                    stackIn_19_0 = stackOut_18_0;
                    break L2;
                  } else {
                    stackOut_17_0 = ((oda) this).b(param2, (byte) 39);
                    stackIn_19_0 = stackOut_17_0;
                    break L2;
                  }
                }
                return stackIn_19_0;
              } else {
                return false;
              }
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                if (var7.e((byte) -120)) {
                  if (var7.a(-15834, param1, param2, param3)) {
                    return true;
                  } else {
                    var6++;
                    continue L1;
                  }
                } else {
                  var6++;
                  continue L1;
                }
              } else {
                var6++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    final boolean a(shb param0, int param1, int param2) {
        int var4 = 0;
        shb var5 = null;
        shb var6 = null;
        shb var6_ref = null;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (((oda) this).field_u != null) {
          if (param1 > 34) {
            var4 = ((oda) this).field_u.length + -1;
            L0: while (true) {
              if (-1 < (var4 ^ -1)) {
                return false;
              } else {
                var5 = ((oda) this).field_u[var4];
                var6 = var5;
                var6 = var5;
                if (var5 != null) {
                  if (var5.e((byte) -120)) {
                    var4 = var4 - param2;
                    L1: while (true) {
                      if (var4 >= 0) {
                        L2: {
                          var6_ref = ((oda) this).field_u[var4];
                          if (var6_ref != null) {
                            if (var6_ref.a(0, param0)) {
                              return true;
                            } else {
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        }
                        var4 = var4 - param2;
                        continue L1;
                      } else {
                        var4--;
                        continue L0;
                      }
                    }
                  } else {
                    var4--;
                    continue L0;
                  }
                } else {
                  var4--;
                  continue L0;
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    private final shb g(byte param0) {
        shb[] var2 = null;
        int var3 = 0;
        shb var4 = null;
        int var5 = 0;
        shb[] var6 = null;
        var5 = VoidHunters.field_G;
        if (null != ((oda) this).field_u) {
          var6 = ((oda) this).field_u;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              if (param0 >= -102) {
                ((oda) this).field_u = null;
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.e((byte) -120)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final boolean b(shb param0, byte param1) {
        if (param1 != 39) {
            field_t = null;
        }
        return ((oda) this).a(1, param0, 0);
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((oda) this).d(16777215);
    }

    oda(int param0, int param1, int param2, int param3, wwa param4) {
        super(param0, param1, param2, param3, param4, (sba) null);
    }

    public static void a(int param0) {
        field_t = null;
        if (param0 != 0) {
            oda.a(68);
        }
    }

    final boolean e(byte param0) {
        if (param0 != -120) {
            return false;
        }
        return this.g((byte) -127) != null ? true : false;
    }

    final void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        shb[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        shb var10 = null;
        int var11 = 0;
        shb[] var12 = null;
        var11 = VoidHunters.field_G;
        if (((oda) this).field_u != null) {
          var12 = ((oda) this).field_u;
          var7 = var12;
          var8 = 62 / ((52 - param0) / 52);
          var9 = 0;
          L0: while (true) {
            if (var12.length <= var9) {
              return;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                var10.a((byte) 118, ((oda) this).field_g + param1, param2, ((oda) this).field_r + param3, param4, param5);
                var9++;
                continue L0;
              } else {
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    boolean a(int param0, shb param1) {
        shb[] var3 = null;
        int var4 = 0;
        shb var5 = null;
        int var6 = 0;
        shb[] var7 = null;
        var6 = VoidHunters.field_G;
        var7 = ((oda) this).field_u;
        var3 = var7;
        var4 = param0;
        L0: while (true) {
          if (var4 >= var7.length) {
            return false;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              if (var5.a(0, param1)) {
                return true;
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

    void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        shb var6 = null;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          if (param1 != 0) {
            break L0;
          } else {
            if (((oda) this).field_q == null) {
              break L0;
            } else {
              ((oda) this).field_q.a(-127, (shb) this, param0, param3, true);
              break L0;
            }
          }
        }
        if (param2 >= 47) {
          L1: {
            if (((oda) this).field_u != null) {
              var5 = -1 + ((oda) this).field_u.length;
              L2: while (true) {
                if ((var5 ^ -1) > -1) {
                  break L1;
                } else {
                  var6 = ((oda) this).field_u[var5];
                  if (var6 != null) {
                    var6.b(param0 - -((oda) this).field_g, param1, 90, param3 - -((oda) this).field_r);
                    var5--;
                    continue L2;
                  } else {
                    var5--;
                    continue L2;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        int var6 = 0;
        shb var7 = null;
        int var8 = 0;
        int var9 = 0;
        shb[] var10 = null;
        var9 = VoidHunters.field_G;
        if (null == ((oda) this).field_u) {
          return;
        } else {
          var10 = ((oda) this).field_u;
          var6 = 0;
          L0: while (true) {
            if (var10.length <= var6) {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  ((oda) this).a(9, 45, 27, 51, 117);
                  break L1;
                }
              }
              return;
            } else {
              var7 = var10[var6];
              StringBuilder discarded$34 = param1.append(10);
              var8 = 0;
              L2: while (true) {
                if (param3 < var8) {
                  if (var7 == null) {
                    StringBuilder discarded$35 = param1.append("null");
                    var6++;
                    continue L0;
                  } else {
                    StringBuilder discarded$36 = var7.a(false, param2, param3 + 1, param1);
                    var6++;
                    continue L0;
                  }
                } else {
                  StringBuilder discarded$37 = param1.append(32);
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void f(byte param0) {
        shb[] var2 = null;
        int var3 = 0;
        shb var4 = null;
        int var5 = 0;
        shb[] var6 = null;
        L0: {
          var5 = VoidHunters.field_G;
          if (param0 == -34) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        var6 = ((oda) this).field_u;
        var2 = var6;
        var3 = 0;
        L1: while (true) {
          if (var3 >= var6.length) {
            return;
          } else {
            var4 = var6[var3];
            if (var4 != null) {
              var4.f((byte) -34);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    boolean a(int param0, int param1, int param2, int param3, shb param4, int param5, byte param6) {
        shb[] var8 = null;
        int var9 = 0;
        shb var10 = null;
        int var11 = 0;
        Object var12 = null;
        shb[] var13 = null;
        var11 = VoidHunters.field_G;
        if (null != ((oda) this).field_u) {
          var13 = ((oda) this).field_u;
          var8 = var13;
          var9 = 0;
          L0: while (true) {
            if (var13.length <= var9) {
              if (param6 < -17) {
                return false;
              } else {
                var12 = null;
                boolean discarded$1 = ((oda) this).b((shb) null, (byte) -24);
                return false;
              }
            } else {
              var10 = var13[var9];
              if (var10 != null) {
                if (var10.a(param0, param1 + ((oda) this).field_g, param2, param3, param4, param5 + ((oda) this).field_r, (byte) -116)) {
                  return true;
                } else {
                  var9++;
                  continue L0;
                }
              } else {
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final boolean a(shb param0, byte param1) {
        if (param1 >= -55) {
            return true;
        }
        return ((oda) this).a(param0, 100, 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
