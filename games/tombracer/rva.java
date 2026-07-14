/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class rva extends ae implements tpa {
    static int[] field_u;
    static jpa field_v;
    ae[] field_w;

    private final ae a(int param0) {
        ae[] var2 = null;
        int var3 = 0;
        ae var4 = null;
        int var5 = 0;
        Object var6 = null;
        ae[] var7 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        if (null != ((rva) this).field_w) {
          var7 = ((rva) this).field_w;
          var2 = var7;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var7.length) {
              if (param0 >= -10) {
                var6 = null;
                this.a((Hashtable) null, 73, -34, (StringBuilder) null);
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var7[var3];
              if (var4 != null) {
                if (var4.b((byte) -34)) {
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

    final boolean a(ae param0, byte param1, int param2) {
        int var4 = 0;
        ae var5 = null;
        ae var6 = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        if (null == ((rva) this).field_w) {
          return false;
        } else {
          var4 = ((rva) this).field_w.length - 1;
          L0: while (true) {
            if ((var4 ^ -1) > -1) {
              if (param1 == -14) {
                return false;
              } else {
                field_u = null;
                return false;
              }
            } else {
              var5 = ((rva) this).field_w[var4];
              if (var5 != null) {
                if (var5.b((byte) -34)) {
                  var4 = var4 - param2;
                  L1: while (true) {
                    if (-1 >= (var4 ^ -1)) {
                      L2: {
                        var6 = ((rva) this).field_w[var4];
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (!var6.a(param0, false)) {
                            break L2;
                          } else {
                            return true;
                          }
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
        }
    }

    final void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        ae[] var7 = null;
        int var8 = 0;
        ae var9 = null;
        int var10 = 0;
        Object var11 = null;
        ae[] var12 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        if (null == ((rva) this).field_w) {
          return;
        } else {
          L0: {
            if (param0 == 59) {
              break L0;
            } else {
              var11 = null;
              boolean discarded$2 = ((rva) this).a(103, (ae) null, -84);
              break L0;
            }
          }
          var12 = ((rva) this).field_w;
          var7 = var12;
          var8 = 0;
          L1: while (true) {
            if (var8 >= var12.length) {
              return;
            } else {
              var9 = var12[var8];
              if (var9 != null) {
                var9.a((byte) 59, param1, param2, ((rva) this).field_i + param3, ((rva) this).field_n + param4, param5);
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    boolean a(char param0, ae param1, int param2, boolean param3) {
        ae[] var5_ref_ae__ = null;
        int var5 = 0;
        int var6 = 0;
        ae var7 = null;
        int var8 = 0;
        ae[] var9 = null;
        boolean stackIn_20_0 = false;
        boolean stackOut_19_0 = false;
        boolean stackOut_18_0 = false;
        var8 = TombRacer.field_G ? 1 : 0;
        if (((rva) this).field_w == null) {
          return false;
        } else {
          L0: {
            var9 = ((rva) this).field_w;
            var5_ref_ae__ = var9;
            if (param3) {
              break L0;
            } else {
              int discarded$2 = ((rva) this).a(true);
              break L0;
            }
          }
          var6 = 0;
          L1: while (true) {
            if (var9.length <= var6) {
              var5 = param2;
              if (80 == var5) {
                L2: {
                  if (oj.field_tb[81]) {
                    stackOut_19_0 = ((rva) this).a(param1, 1);
                    stackIn_20_0 = stackOut_19_0;
                    break L2;
                  } else {
                    stackOut_18_0 = ((rva) this).a((byte) 43, param1);
                    stackIn_20_0 = stackOut_18_0;
                    break L2;
                  }
                }
                return stackIn_20_0;
              } else {
                return false;
              }
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                if (var7.b((byte) -34)) {
                  if (var7.a(param0, param1, param2, true)) {
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
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            String discarded$0 = rva.a((Class) null, (byte) -126);
        }
        field_u = null;
        field_v = null;
    }

    final void f(byte param0) {
        ae[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ae var5 = null;
        int var6 = 0;
        ae[] var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var7 = ((rva) this).field_w;
        var2 = var7;
        var3 = 99 / ((param0 - -38) / 60);
        var4 = 0;
        L0: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.f((byte) -128);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    abstract void a(byte param0);

    final String d(byte param0) {
        ae[] var2 = null;
        int var3 = 0;
        ae var4 = null;
        String var5 = null;
        int var6 = 0;
        ae[] var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (null != ((rva) this).field_w) {
          var7 = ((rva) this).field_w;
          var2 = var7;
          var3 = 0;
          L0: while (true) {
            if (var7.length <= var3) {
              var3 = 103 % ((param0 - -58) / 60);
              return null;
            } else {
              var4 = var7[var3];
              if (var4 != null) {
                var5 = var4.d((byte) 4);
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

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        ae var6 = null;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param2 != param3) {
            break L0;
          } else {
            if (((rva) this).field_r == null) {
              break L0;
            } else {
              ((rva) this).field_r.a((ae) this, param0, 16777215, param1, true);
              break L0;
            }
          }
        }
        L1: {
          if (null == ((rva) this).field_w) {
            break L1;
          } else {
            var5 = ((rva) this).field_w.length - 1;
            L2: while (true) {
              if (0 > var5) {
                break L1;
              } else {
                var6 = ((rva) this).field_w[var5];
                if (var6 != null) {
                  var6.a(((rva) this).field_i + param0, ((rva) this).field_n + param1, 0, param3);
                  var5--;
                  continue L2;
                } else {
                  var5--;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var6 = 0;
        ae var7 = null;
        int var8 = 0;
        int var9 = 0;
        ae[] var10 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        if (((rva) this).field_w == null) {
          return;
        } else {
          L0: {
            var10 = ((rva) this).field_w;
            if (param2 > 121) {
              break L0;
            } else {
              field_v = null;
              break L0;
            }
          }
          var6 = 0;
          L1: while (true) {
            if (var6 >= var10.length) {
              return;
            } else {
              var7 = var10[var6];
              StringBuilder discarded$34 = param3.append(10);
              var8 = 0;
              L2: while (true) {
                if (param1 < var8) {
                  if (var7 == null) {
                    StringBuilder discarded$35 = param3.append("null");
                    var6++;
                    continue L1;
                  } else {
                    StringBuilder discarded$36 = var7.a(1 + param1, param0, param3, 0);
                    var6++;
                    continue L1;
                  }
                } else {
                  StringBuilder discarded$37 = param3.append(32);
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, ae param1, int param2) {
        int var4 = 0;
        ae var5 = null;
        ae var6 = null;
        ae var6_ref = null;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        if (((rva) this).field_w == null) {
          return false;
        } else {
          var4 = param2;
          L0: while (true) {
            if (var4 >= ((rva) this).field_w.length) {
              return false;
            } else {
              var5 = ((rva) this).field_w[var4];
              var6 = var5;
              var6 = var5;
              if (var5 != null) {
                if (var5.b((byte) -34)) {
                  var4 = var4 + param0;
                  L1: while (true) {
                    if (var4 < ((rva) this).field_w.length) {
                      L2: {
                        var6_ref = ((rva) this).field_w[var4];
                        if (var6_ref == null) {
                          break L2;
                        } else {
                          if (var6_ref.a(param1, false)) {
                            return true;
                          } else {
                            break L2;
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
        }
    }

    rva(int param0, int param1, int param2, int param3, isa param4) {
        super(param0, param1, param2, param3, param4, (qc) null);
    }

    final int a(boolean param0) {
        int var2 = 0;
        ae[] var3 = null;
        int var4 = 0;
        ae var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3 = ((rva) this).field_w;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.length) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a(false);
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

    final boolean b(byte param0) {
        if (param0 != -34) {
            ((rva) this).a((byte) 29);
        }
        return this.a(-49) != null ? true : false;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (((rva) this).a((byte) -122, param0, param1, param2)) {
            ((rva) this).a(1, param2, param1, param0);
            this.a(param1, param0, 123, param2);
        }
        if (param3 != 0) {
            ((rva) this).field_w = null;
        }
        return param2;
    }

    final static String a(Class param0, byte param1) {
        if (param1 >= -44) {
            field_v = null;
        }
        if (param0.isArray()) {
            return rva.a(param0.getComponentType(), (byte) -57) + "[]";
        }
        return param0.getName().substring(1 + param0.getName().lastIndexOf("."));
    }

    final boolean a(byte param0, ae param1) {
        if (param0 != 43) {
            ((rva) this).field_w = null;
        }
        return ((rva) this).a(1, param1, 0);
    }

    boolean a(ae param0, boolean param1) {
        ae[] var3 = null;
        int var4 = 0;
        ae var5 = null;
        int var6 = 0;
        ae[] var7 = null;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            boolean discarded$2 = ((rva) this).b((byte) -65);
            break L0;
          }
        }
        var7 = ((rva) this).field_w;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var7.length <= var4) {
            return false;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              if (var5.a(param0, param1)) {
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

    void a(int param0, int param1, ae param2, int param3) {
        ae[] var5 = null;
        int var6 = 0;
        ae var7 = null;
        int var8 = 0;
        ae[] var9 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (null == ((rva) this).field_w) {
          return;
        } else {
          var9 = ((rva) this).field_w;
          var5 = var9;
          var6 = 0;
          L0: while (true) {
            if (var6 >= var9.length) {
              return;
            } else {
              var7 = var9[var6];
              if (var7 != null) {
                var7.a(((rva) this).field_i + param0, 2097152, param2, param3 - -((rva) this).field_n);
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

    final boolean a(ae param0, int param1) {
        if (param1 != 1) {
            Object var4 = null;
            boolean discarded$0 = ((rva) this).a(-74, -77, 93, 125, (ae) null, -41, 108);
        }
        return ((rva) this).a(param0, (byte) -14, 1);
    }

    void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((rva) this).a((byte) 88);
    }

    boolean a(int param0, int param1, int param2, int param3, ae param4, int param5, int param6) {
        ae[] var8 = null;
        int var9 = 0;
        ae var10 = null;
        int var11 = 0;
        ae[] var12 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        if (((rva) this).field_w != null) {
          L0: {
            if (param6 == -1) {
              break L0;
            } else {
              ((rva) this).field_w = null;
              break L0;
            }
          }
          var12 = ((rva) this).field_w;
          var8 = var12;
          var9 = 0;
          L1: while (true) {
            if (var9 >= var12.length) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.b((byte) -34)) {
                  if (var10.a(param0, param1, param2, param3, param4, param5, param6 + 0)) {
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

    boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        ae[] var8 = null;
        int var9 = 0;
        ae var10 = null;
        int var11 = 0;
        Object var12 = null;
        ae[] var13 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        if (((rva) this).field_w == null) {
          return false;
        } else {
          L0: {
            if (param0 >= 70) {
              break L0;
            } else {
              var12 = null;
              boolean discarded$2 = ((rva) this).a((ae) null, 84);
              break L0;
            }
          }
          var13 = ((rva) this).field_w;
          var8 = var13;
          var9 = 0;
          L1: while (true) {
            if (var9 >= var13.length) {
              return false;
            } else {
              var10 = var13[var9];
              if (var10 != null) {
                if (var10.a(123, ((rva) this).field_i + param1, ((rva) this).field_n + param2, param3, param4, param5, param6)) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[8192];
    }
}
