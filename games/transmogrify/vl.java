/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vl extends fi {
    static wc field_C;
    static int field_y;
    static int[] field_G;
    static long field_B;
    static int field_A;
    private int field_z;
    private int field_D;
    private boolean field_I;
    private int field_H;
    private int field_E;
    private boolean field_F;

    public static void i(int param0) {
        field_G = null;
        field_C = null;
        if (param0 != 2147483647) {
            field_B = -119L;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                int var3 = -62 / ((param0 - 47) / 43);
                param1.getAppletContext().showDocument(dh.a(param1, (byte) 59, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        var8 = super.b(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 != 0) {
          if (!((vl) this).field_I) {
            if (!((vl) this).b(param3, param6, param4 + 30385, param0, param5)) {
              return var8 != 0;
            } else {
              L0: {
                if (param1 == 1) {
                  ((vl) this).field_H = param5 + (-((vl) this).field_n + -param6);
                  b.field_i = (vl) this;
                  ((vl) this).field_E = -param3 + param0 + -((vl) this).field_p;
                  break L0;
                } else {
                  break L0;
                }
              }
              ((vl) this).field_s = param1;
              return true;
            }
          } else {
            return true;
          }
        } else {
          if (!((vl) this).b(param3, param6, param4 + 30385, param0, param5)) {
            return var8 != 0;
          } else {
            L1: {
              if (param1 == 1) {
                ((vl) this).field_H = param5 + (-((vl) this).field_n + -param6);
                b.field_i = (vl) this;
                ((vl) this).field_E = -param3 + param0 + -((vl) this).field_p;
                break L1;
              } else {
                break L1;
              }
            }
            ((vl) this).field_s = param1;
            return true;
          }
        }
    }

    final void a(byte param0) {
        super.a((byte) 127);
        ((vl) this).field_v.a(-126, 0, 0, ((vl) this).field_l, ((vl) this).field_h);
        int var2 = -38 / ((74 - param0) / 49);
        ((vl) this).field_D = ((vl) this).field_p;
        ((vl) this).field_z = ((vl) this).field_n;
    }

    final StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        if (param1 < -20) {
          if (((vl) this).a((byte) -108, param3, param2, param0)) {
            ((vl) this).a(param2, 84, param0, param3);
            ((vl) this).a(param2, param0, param3, false);
            StringBuilder discarded$23 = param2.append(" revert=").append(((vl) this).field_F);
            if (2147483647 != ((vl) this).field_D) {
              if (2147483647 == ((vl) this).field_z) {
                return param2;
              } else {
                StringBuilder discarded$24 = param2.append(" to ").append(((vl) this).field_D).append(44).append(((vl) this).field_z);
                return param2;
              }
            } else {
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4, param5);
        ((vl) this).field_s = 0;
    }

    private vl(int param0, int param1, int param2, int param3, ui param4, ma param5, qg param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((vl) this).field_D = 2147483647;
        ((vl) this).field_z = 2147483647;
        ((vl) this).field_I = param8 ? true : false;
        ((vl) this).field_v = param6;
        ((vl) this).field_F = param7 ? true : false;
    }

    final static String b(int param0, String param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (param0 == -1) {
          var2 = param1.length();
          var8 = new char[var2];
          var6 = var8;
          var3 = var6;
          var4 = 0;
          L0: while (true) {
            if (var2 <= var4) {
              return new String(var8);
            } else {
              var3[-var4 + -1 + var2] = param1.charAt(var4);
              var4++;
              continue L0;
            }
          }
        } else {
          field_B = -34L;
          var2 = param1.length();
          var9 = new char[var2];
          var7 = var9;
          var3 = var7;
          var4 = 0;
          L1: while (true) {
            if (var2 <= var4) {
              return new String(var9);
            } else {
              var3[-var4 + -1 + var2] = param1.charAt(var4);
              var4++;
              continue L1;
            }
          }
        }
    }

    final static uj a(int param0, String param1) {
        if (param0 == 42) {
          if (of.field_d != db.field_a) {
            if (db.field_a == gd.field_l) {
              if (!param1.equals((Object) (Object) jh.field_g)) {
                jh.field_g = param1;
                db.field_a = of.field_d;
                de.field_a = null;
                return null;
              } else {
                db.field_a = jh.field_n;
                return de.field_a;
              }
            } else {
              jh.field_g = param1;
              db.field_a = of.field_d;
              de.field_a = null;
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_y = -80;
          if (of.field_d != db.field_a) {
            if (db.field_a == gd.field_l) {
              if (!param1.equals((Object) (Object) jh.field_g)) {
                jh.field_g = param1;
                db.field_a = of.field_d;
                de.field_a = null;
                return null;
              } else {
                db.field_a = jh.field_n;
                return de.field_a;
              }
            } else {
              jh.field_g = param1;
              db.field_a = of.field_d;
              de.field_a = null;
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        Object stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        Object stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        if (!(((vl) this).field_v instanceof lj)) {
          if (((vl) this).field_s != 1) {
            if (((vl) this).field_F) {
              L0: {
                if (((vl) this).field_p == ((vl) this).field_D) {
                  break L0;
                } else {
                  L1: {
                    var5 = ((vl) this).field_D - ((vl) this).field_p;
                    stackOut_63_0 = this;
                    stackOut_63_1 = ((vl) this).field_p;
                    stackIn_65_0 = stackOut_63_0;
                    stackIn_65_1 = stackOut_63_1;
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    if (2 >= Math.abs(var5)) {
                      stackOut_65_0 = this;
                      stackOut_65_1 = stackIn_65_1;
                      stackIn_67_0 = stackOut_65_0;
                      stackIn_67_1 = stackOut_65_1;
                      stackIn_66_0 = stackOut_65_0;
                      stackIn_66_1 = stackOut_65_1;
                      if (-1 > (var5 ^ -1)) {
                        stackOut_67_0 = this;
                        stackOut_67_1 = stackIn_67_1;
                        stackOut_67_2 = 1;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        stackIn_68_2 = stackOut_67_2;
                        break L1;
                      } else {
                        stackOut_66_0 = this;
                        stackOut_66_1 = stackIn_66_1;
                        stackOut_66_2 = -1;
                        stackIn_68_0 = stackOut_66_0;
                        stackIn_68_1 = stackOut_66_1;
                        stackIn_68_2 = stackOut_66_2;
                        break L1;
                      }
                    } else {
                      stackOut_64_0 = this;
                      stackOut_64_1 = stackIn_64_1;
                      stackOut_64_2 = var5 >> -1294336575;
                      stackIn_68_0 = stackOut_64_0;
                      stackIn_68_1 = stackOut_64_1;
                      stackIn_68_2 = stackOut_64_2;
                      break L1;
                    }
                  }
                  ((vl) this).field_p = stackIn_68_1 + stackIn_68_2;
                  break L0;
                }
              }
              if (((vl) this).field_z != ((vl) this).field_n) {
                L2: {
                  var5 = -((vl) this).field_n + ((vl) this).field_z;
                  stackOut_71_0 = this;
                  stackOut_71_1 = ((vl) this).field_n;
                  stackIn_73_0 = stackOut_71_0;
                  stackIn_73_1 = stackOut_71_1;
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  if ((Math.abs(var5) ^ -1) >= -3) {
                    L3: {
                      stackOut_73_0 = this;
                      stackOut_73_1 = stackIn_73_1;
                      stackIn_75_0 = stackOut_73_0;
                      stackIn_75_1 = stackOut_73_1;
                      stackIn_74_0 = stackOut_73_0;
                      stackIn_74_1 = stackOut_73_1;
                      if ((var5 ^ -1) >= -1) {
                        stackOut_75_0 = this;
                        stackOut_75_1 = stackIn_75_1;
                        stackOut_75_2 = -1;
                        stackIn_76_0 = stackOut_75_0;
                        stackIn_76_1 = stackOut_75_1;
                        stackIn_76_2 = stackOut_75_2;
                        break L3;
                      } else {
                        stackOut_74_0 = this;
                        stackOut_74_1 = stackIn_74_1;
                        stackOut_74_2 = 1;
                        stackIn_76_0 = stackOut_74_0;
                        stackIn_76_1 = stackOut_74_1;
                        stackIn_76_2 = stackOut_74_2;
                        break L3;
                      }
                    }
                    ((vl) this).field_n = stackIn_76_1 + stackIn_76_2;
                    break L2;
                  } else {
                    ((vl) this).field_n = stackIn_72_1 + (var5 >> 2026108673);
                    break L2;
                  }
                }
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              super.a(param0, param1, param2, param3);
              return;
            }
          } else {
            L4: {
              L5: {
                var5 = oa.field_j + (-((vl) this).field_E - param3);
                var6 = -((vl) this).field_H + bk.field_a - param0;
                if (((vl) this).field_p != var5) {
                  break L5;
                } else {
                  if (var6 != ((vl) this).field_n) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              ((vl) this).field_n = var6;
              ((vl) this).field_p = var5;
              if (((vl) this).field_m instanceof eb) {
                ((eb) (Object) ((vl) this).field_m).a(param3, (vl) this, param0, true);
                break L4;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
            super.a(param0, param1, param2, param3);
            return;
          }
        } else {
          if (((lj) (Object) ((vl) this).field_v).field_t) {
            if (((vl) this).field_s != 1) {
              if (((vl) this).field_F) {
                L6: {
                  if (((vl) this).field_p == ((vl) this).field_D) {
                    break L6;
                  } else {
                    L7: {
                      var5 = ((vl) this).field_D - ((vl) this).field_p;
                      stackOut_35_0 = this;
                      stackOut_35_1 = ((vl) this).field_p;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      if (2 >= Math.abs(var5)) {
                        stackOut_37_0 = this;
                        stackOut_37_1 = stackIn_37_1;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        if (-1 > (var5 ^ -1)) {
                          stackOut_39_0 = this;
                          stackOut_39_1 = stackIn_39_1;
                          stackOut_39_2 = 1;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          break L7;
                        } else {
                          stackOut_38_0 = this;
                          stackOut_38_1 = stackIn_38_1;
                          stackOut_38_2 = -1;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          break L7;
                        }
                      } else {
                        stackOut_36_0 = this;
                        stackOut_36_1 = stackIn_36_1;
                        stackOut_36_2 = var5 >> -1294336575;
                        stackIn_40_0 = stackOut_36_0;
                        stackIn_40_1 = stackOut_36_1;
                        stackIn_40_2 = stackOut_36_2;
                        break L7;
                      }
                    }
                    ((vl) this).field_p = stackIn_40_1 + stackIn_40_2;
                    break L6;
                  }
                }
                if (((vl) this).field_z != ((vl) this).field_n) {
                  L8: {
                    var5 = -((vl) this).field_n + ((vl) this).field_z;
                    stackOut_43_0 = this;
                    stackOut_43_1 = ((vl) this).field_n;
                    stackIn_45_0 = stackOut_43_0;
                    stackIn_45_1 = stackOut_43_1;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    if ((Math.abs(var5) ^ -1) >= -3) {
                      L9: {
                        stackOut_45_0 = this;
                        stackOut_45_1 = stackIn_45_1;
                        stackIn_47_0 = stackOut_45_0;
                        stackIn_47_1 = stackOut_45_1;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        if ((var5 ^ -1) >= -1) {
                          stackOut_47_0 = this;
                          stackOut_47_1 = stackIn_47_1;
                          stackOut_47_2 = -1;
                          stackIn_48_0 = stackOut_47_0;
                          stackIn_48_1 = stackOut_47_1;
                          stackIn_48_2 = stackOut_47_2;
                          break L9;
                        } else {
                          stackOut_46_0 = this;
                          stackOut_46_1 = stackIn_46_1;
                          stackOut_46_2 = 1;
                          stackIn_48_0 = stackOut_46_0;
                          stackIn_48_1 = stackOut_46_1;
                          stackIn_48_2 = stackOut_46_2;
                          break L9;
                        }
                      }
                      ((vl) this).field_n = stackIn_48_1 + stackIn_48_2;
                      break L8;
                    } else {
                      ((vl) this).field_n = stackIn_44_1 + (var5 >> 2026108673);
                      break L8;
                    }
                  }
                  super.a(param0, param1, param2, param3);
                  return;
                } else {
                  super.a(param0, param1, param2, param3);
                  return;
                }
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            } else {
              var5 = oa.field_j + (-((vl) this).field_E - param3);
              var6 = -((vl) this).field_H + bk.field_a - param0;
              if (((vl) this).field_p == var5) {
                L10: {
                  if (var6 != ((vl) this).field_n) {
                    ((vl) this).field_n = var6;
                    ((vl) this).field_p = var5;
                    if (((vl) this).field_m instanceof eb) {
                      ((eb) (Object) ((vl) this).field_m).a(param3, (vl) this, param0, true);
                      break L10;
                    } else {
                      super.a(param0, param1, param2, param3);
                      return;
                    }
                  } else {
                    break L10;
                  }
                }
                super.a(param0, param1, param2, param3);
                return;
              } else {
                L11: {
                  ((vl) this).field_n = var6;
                  ((vl) this).field_p = var5;
                  if (((vl) this).field_m instanceof eb) {
                    ((eb) (Object) ((vl) this).field_m).a(param3, (vl) this, param0, true);
                    super.a(param0, param1, param2, param3);
                    break L11;
                  } else {
                    super.a(param0, param1, param2, param3);
                    break L11;
                  }
                }
                return;
              }
            }
          } else {
            if (!((vl) this).field_F) {
              super.a(param0, param1, param2, param3);
              return;
            } else {
              L12: {
                if (((vl) this).field_p == ((vl) this).field_D) {
                  break L12;
                } else {
                  L13: {
                    var5 = ((vl) this).field_D - ((vl) this).field_p;
                    stackOut_4_0 = this;
                    stackOut_4_1 = ((vl) this).field_p;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (2 >= Math.abs(var5)) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = stackIn_6_1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (-1 > (var5 ^ -1)) {
                        stackOut_8_0 = this;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = 1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        break L13;
                      } else {
                        stackOut_7_0 = this;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = -1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        break L13;
                      }
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = var5 >> -1294336575;
                      stackIn_9_0 = stackOut_5_0;
                      stackIn_9_1 = stackOut_5_1;
                      stackIn_9_2 = stackOut_5_2;
                      break L13;
                    }
                  }
                  ((vl) this).field_p = stackIn_9_1 + stackIn_9_2;
                  break L12;
                }
              }
              if (((vl) this).field_z != ((vl) this).field_n) {
                L14: {
                  var5 = -((vl) this).field_n + ((vl) this).field_z;
                  stackOut_12_0 = this;
                  stackOut_12_1 = ((vl) this).field_n;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  if ((Math.abs(var5) ^ -1) >= -3) {
                    L15: {
                      stackOut_14_0 = this;
                      stackOut_14_1 = stackIn_14_1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if ((var5 ^ -1) >= -1) {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = -1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        break L15;
                      } else {
                        stackOut_15_0 = this;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        break L15;
                      }
                    }
                    ((vl) this).field_n = stackIn_17_1 + stackIn_17_2;
                    break L14;
                  } else {
                    ((vl) this).field_n = stackIn_13_1 + (var5 >> 2026108673);
                    break L14;
                  }
                }
                super.a(param0, param1, param2, param3);
                return;
              } else {
                super.a(param0, param1, param2, param3);
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new int[]{44, 40, 43, 45, 46, 40, 45, 40, 44, 40, 42, 49, 49, 49, 46, 40, 42, 49, 39};
    }
}
