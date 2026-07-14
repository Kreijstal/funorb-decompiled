/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gn extends cf {
    private boolean field_H;
    static java.util.zip.CRC32 field_B;
    boolean field_G;
    boolean field_F;
    private boolean field_J;
    static ip field_K;
    static java.math.BigInteger field_L;
    static int[] field_I;
    static String field_D;
    static String field_C;
    static String field_E;

    gn(String param0, nl param1, bj param2) {
        super(param0, param1, param2);
        ((gn) this).field_J = true;
        ((gn) this).field_F = true;
        ((gn) this).field_H = false;
    }

    void a(int param0, cf param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (((gn) this).field_u != 0) {
          if (((gn) this).field_u != pq.field_f) {
            if (((gn) this).a(92, param2, bd.field_g, bo.field_d, param3)) {
              if (pq.field_f != 0) {
                ((gn) this).a(bd.field_g, param1, param3, bo.field_d, true, param2);
                return;
              } else {
                ((gn) this).a((byte) -49, ((gn) this).field_u, bd.field_g + -param2, bo.field_d + -param3);
                ((gn) this).a(bd.field_g, param1, param3, bo.field_d, true, param2);
                return;
              }
            } else {
              ((gn) this).a(bd.field_g, param1, param3, bo.field_d, true, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    boolean a(cf param0, int param1) {
        if (((gn) this).field_F) {
          if (((gn) this).field_J) {
            L0: {
              param0.c((byte) 32);
              ((gn) this).field_H = true;
              if (null == ((gn) this).field_A) {
                break L0;
              } else {
                if (((gn) this).field_A instanceof om) {
                  ((om) (Object) ((gn) this).field_A).a(((gn) this).field_H, true, (cf) this);
                  break L0;
                } else {
                  if (param1 != 0) {
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            }
            if (param1 != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean c(int param0) {
        if (param0 < 123) {
            return true;
        }
        return ((gn) this).field_H;
    }

    final static boolean b(byte param0, String param1) {
        if (param1 != null) {
          if (param1.length() >= rp.field_j) {
            if (param1.length() > iq.field_e) {
              return true;
            } else {
              if (param0 != 62) {
                field_L = null;
                return false;
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        if (!((gn) this).c(param3 + 6332)) {
          if (param3 != -6208) {
            return false;
          } else {
            return false;
          }
        } else {
          if (param0 != 84) {
            if (param0 != 83) {
              if (param3 != -6208) {
                return false;
              } else {
                return false;
              }
            } else {
              ((gn) this).a((byte) -49, 1, -1, -1);
              return true;
            }
          } else {
            ((gn) this).a((byte) -49, 1, -1, -1);
            return true;
          }
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        if (param1 == 16413) {
          if (48 > param0) {
            if (param0 < 65) {
              L0: {
                if (param0 < 97) {
                  break L0;
                } else {
                  if (param0 > 122) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              if (90 >= param0) {
                stackOut_28_0 = 1;
                stackIn_30_0 = stackOut_28_0;
                return stackIn_30_0 != 0;
              } else {
                L1: {
                  L2: {
                    if (param0 < 97) {
                      break L2;
                    } else {
                      if (param0 > 122) {
                        break L2;
                      } else {
                        stackOut_25_0 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        break L1;
                      }
                    }
                  }
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                }
                return stackIn_27_0 != 0;
              }
            }
          } else {
            if (param0 > 57) {
              if (param0 >= 65) {
                if (90 < param0) {
                  if (param0 >= 97) {
                    if (param0 > 122) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static ae a(int param0, ga param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = param1.d((byte) 69);
        if (param0 != -1) {
          field_D = null;
          var3 = param1.d((byte) 69);
          var4 = param1.g(31365);
          return (ae) (Object) ak.a(var4, (byte) -94, var2, var3);
        } else {
          var3 = param1.d((byte) 69);
          var4 = param1.g(31365);
          return (ae) (Object) ak.a(var4, (byte) -94, var2, var3);
        }
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        if (null != ((gn) this).field_A) {
          if (((gn) this).field_A instanceof ph) {
            ((ph) (Object) ((gn) this).field_A).a(param2, param3, -108, param0, param5, (gn) this);
            if (!param4) {
              field_L = null;
              ((gn) this).field_u = 0;
              return;
            } else {
              ((gn) this).field_u = 0;
              return;
            }
          } else {
            if (!param4) {
              field_L = null;
              ((gn) this).field_u = 0;
              return;
            } else {
              ((gn) this).field_u = 0;
              return;
            }
          }
        } else {
          if (!param4) {
            field_L = null;
            ((gn) this).field_u = 0;
            return;
          } else {
            ((gn) this).field_u = 0;
            return;
          }
        }
    }

    final void c(byte param0) {
        Object var3 = null;
        if (param0 == 32) {
          if (((gn) this).field_H) {
            ((gn) this).field_H = false;
            if (null != ((gn) this).field_A) {
              if (!(((gn) this).field_A instanceof om)) {
                return;
              } else {
                ((om) (Object) ((gn) this).field_A).a(((gn) this).field_H, true, (cf) this);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var3 = null;
          StringBuilder discarded$4 = ((gn) this).a(114, (Hashtable) null, 36, (StringBuilder) null);
          if (((gn) this).field_H) {
            ((gn) this).field_H = false;
            if (null != ((gn) this).field_A) {
              if (!(((gn) this).field_A instanceof om)) {
                return;
              } else {
                ((om) (Object) ((gn) this).field_A).a(((gn) this).field_H, true, (cf) this);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    gn(String param0, bj param1) {
        this(param0, ra.field_o.field_n, param1);
    }

    boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        Object var9 = null;
        if (param4 == -24) {
          if (((gn) this).field_F) {
            if (((gn) this).a(89, param5, param1, param0, param6)) {
              boolean discarded$3 = ((gn) this).a(param3, param4 ^ -24);
              ((gn) this).field_u = param2;
              if (null != ((gn) this).field_A) {
                if (!(((gn) this).field_A instanceof ph)) {
                  return true;
                } else {
                  ((ph) (Object) ((gn) this).field_A).a(param6, param1, param2, (gn) this, param5, param4 + -25285, param0);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          var9 = null;
          boolean discarded$4 = gn.b((byte) -31, (String) null);
          if (((gn) this).field_F) {
            if (((gn) this).a(89, param5, param1, param0, param6)) {
              boolean discarded$5 = ((gn) this).a(param3, param4 ^ -24);
              ((gn) this).field_u = param2;
              if (null == ((gn) this).field_A) {
                return true;
              } else {
                L0: {
                  if (((gn) this).field_A instanceof ph) {
                    ((ph) (Object) ((gn) this).field_A).a(param6, param1, param2, (gn) this, param5, param4 + -25285, param0);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static String a(String param0, int param1, int param2) {
        ml var7 = null;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        CharSequence var10 = (CharSequence) (Object) param0;
        if (!em.a(var10, (byte) -38)) {
            return u.field_f;
        }
        if (2 != ge.field_zb) {
            return cf.field_p;
        }
        if (param1 < 70) {
            return null;
        }
        ml var8 = dn.a(param0, false);
        if (!(var8 != null)) {
            return vl.a(ki.field_i, new String[1], 2);
        }
        br discarded$0 = ro.field_M.a((byte) 120, (br) (Object) var8);
        while (true) {
            var7 = (ml) (Object) ro.field_M.b(6);
            if (var7 == null) {
                break;
            }
            var7.field_Mb = var7.field_Mb - 1;
        }
        var8.a(true);
        var8.a(-4564);
        dc.field_Fb = dc.field_Fb - 1;
        ga var9 = ma.field_a;
        var9.b((byte) -35, param2);
        var9.field_j = var9.field_j + 1;
        int var5 = var9.field_j;
        var9.a(-93, 1);
        var9.a(param0, (byte) 105);
        var9.e(73, -var5 + var9.field_j);
        return null;
    }

    public static void a(int param0) {
        field_E = null;
        field_I = null;
        field_C = null;
        field_D = null;
        field_K = null;
        field_B = null;
        field_L = null;
        if (param0 >= -109) {
            field_E = null;
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param0 == -49) {
          if (null != ((gn) this).field_A) {
            if (!(((gn) this).field_A instanceof in)) {
              return;
            } else {
              ((in) (Object) ((gn) this).field_A).a(param1, param3, (gn) this, -127, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          field_C = null;
          if (null != ((gn) this).field_A) {
            if (!(((gn) this).field_A instanceof in)) {
              return;
            } else {
              ((in) (Object) ((gn) this).field_A).a(param1, param3, (gn) this, -127, param2);
              return;
            }
          } else {
            return;
          }
        }
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        if (((gn) this).a(param1, 117, param3, param2)) {
          ((gn) this).a(param2, param3, (byte) 26, param1);
          if (!((gn) this).field_G) {
            if (((gn) this).field_F) {
              if (param0 != 7) {
                boolean discarded$8 = gn.a(',', -13);
                return param3;
              } else {
                return param3;
              }
            } else {
              StringBuilder discarded$9 = param3.append(" disabled");
              if (param0 != 7) {
                boolean discarded$10 = gn.a(',', -13);
                return param3;
              } else {
                return param3;
              }
            }
          } else {
            StringBuilder discarded$11 = param3.append(" active");
            if (!((gn) this).field_F) {
              StringBuilder discarded$12 = param3.append(" disabled");
              if (param0 != 7) {
                boolean discarded$13 = gn.a(',', -13);
                return param3;
              } else {
                return param3;
              }
            } else {
              if (param0 != 7) {
                boolean discarded$14 = gn.a(',', -13);
                return param3;
              } else {
                return param3;
              }
            }
          }
        } else {
          if (param0 != 7) {
            boolean discarded$15 = gn.a(',', -13);
            return param3;
          } else {
            return param3;
          }
        }
    }

    protected gn() {
        ((gn) this).field_J = true;
        ((gn) this).field_F = true;
        ((gn) this).field_H = false;
        ((gn) this).field_h = ra.field_o.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new java.util.zip.CRC32();
        field_K = new ip();
        field_D = "Password: ";
        field_I = new int[32];
        field_C = "Player";
        field_L = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_E = "Flee, zombies, flee!";
    }
}
