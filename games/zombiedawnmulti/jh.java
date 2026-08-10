/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends cj {
    static ja[] field_Hb;
    cj field_Rb;
    byte[] field_Zb;
    boolean field_Wb;
    int field_Ub;
    boolean field_Fb;
    long field_qc;
    cj field_Ib;
    cj field_gc;
    boolean field_dc;
    cj field_jc;
    int field_Pb;
    int field_Vb;
    cj field_Xb;
    cj field_Lb;
    boolean field_Mb;
    boolean field_lc;
    String field_Nb;
    cj field_ec;
    boolean field_rc;
    cj field_hc;
    int field_cc;
    cj field_Kb;
    cj field_kc;
    int field_Sb;
    cj field_Tb;
    cj field_Yb;
    cj field_oc;
    cj field_ac;
    String[] field_bc;
    static int field_ic;
    cj field_pc;
    int field_Jb;
    boolean field_Ob;
    int field_mc;
    long field_nc;
    cj field_Gb;
    cj[] field_Qb;
    int field_fc;

    final boolean a(jh param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_1 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          L0: {
            L1: {
              if (!this.field_lc) {
                if (this.field_Vb == 6) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_6_0;
              var4 = -64 % ((30 - param1) / 56);
              if (!param0.field_lc) {
                if (param0.field_Vb == 6) {
                  stackIn_12_0 = 1;
                  break L2;
                } else {
                  stackIn_12_0 = 0;
                  break L2;
                }
              } else {
                stackIn_12_0 = 1;
                break L2;
              }
            }
            var5 = stackIn_12_0;
            if (var5 == var3_int) {
              L3: {
                if (var3_int != 0) {
                  break L3;
                } else {
                  L4: {
                    if (param0.field_Ob) {
                      stackIn_19_0 = 0;
                      break L4;
                    } else {
                      stackIn_19_0 = 1;
                      break L4;
                    }
                  }
                  L5: {


                    if (this.field_Ob) {

                      stackIn_22_1 = 0;
                      break L5;
                    } else {

                      stackIn_22_1 = 1;
                      break L5;
                    }
                  }
                  if (stackIn_19_0 == stackIn_22_1) {
                    if (!this.field_Ob) {
                      break L3;
                    } else {
                      if (this.field_Pb != param0.field_Pb) {
                        L6: {
                          if (param0.field_Pb <= this.field_Pb) {
                            stackIn_31_0 = 0;
                            break L6;
                          } else {
                            stackIn_31_0 = 1;
                            break L6;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    stackIn_24_0 = this.field_Ob;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              if (this.field_Fb != param0.field_Fb) {
                L7: {
                  if (this.field_Fb) {
                    stackIn_37_0 = 0;
                    break L7;
                  } else {
                    stackIn_37_0 = 1;
                    break L7;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (!this.field_Fb) {
                  L8: {
                    if ((this.field_qc ^ -1L) <= (param0.field_qc ^ -1L)) {
                      stackIn_65_0 = 0;
                      break L8;
                    } else {
                      stackIn_65_0 = 1;
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 6;
                  break L0;
                } else {
                  L9: {
                    if (this.field_Wb) {
                      stackIn_45_0 = 1;
                      break L9;
                    } else {
                      if (this.field_fc == 2) {
                        stackIn_45_0 = 1;
                        break L9;
                      } else {
                        stackIn_45_0 = 0;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    var6 = stackIn_45_0;
                    if (!param0.field_Wb) {
                      if (param0.field_fc == 2) {
                        stackIn_51_0 = 1;
                        break L10;
                      } else {
                        stackIn_51_0 = 0;
                        break L10;
                      }
                    } else {
                      stackIn_51_0 = 1;
                      break L10;
                    }
                  }
                  L11: {
                    var7 = stackIn_51_0;
                    if (var6 != 0) {
                      stackIn_54_0 = 0;
                      break L11;
                    } else {
                      stackIn_54_0 = 1;
                      break L11;
                    }
                  }
                  if (stackIn_54_0 == var7) {
                    stackIn_57_0 = var6;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L12: {
                      if ((this.field_qc ^ -1L) >= (param0.field_qc ^ -1L)) {
                        stackIn_61_0 = 0;
                        break L12;
                      } else {
                        stackIn_61_0 = 1;
                        break L12;
                      }
                    }
                    decompiledRegionSelector0 = 5;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_14_0 = var3_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var3);

            stackIn_68_1 = new StringBuilder().append("jh.AA(");

            if (param0 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L13;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L13;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_24_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_31_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_37_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_57_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_61_0 != 0;
                  } else {
                    return stackIn_65_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final int i(int param0) {
        if (param0 != 6) {
            this.field_Pb = 20;
            return (int)this.d(-108);
        }
        return (int)this.d(-108);
    }

    final boolean j(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 2) {
          L0: {
            this.field_pc = (cj) null;
            if (this.c(0)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.c(0)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    jh(int param0) {
        super(0L, (cj) null);
        this.field_Zb = new byte[param0];
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            try {
                oe.field_c = param2;
                try {
                    var6 = param0.getParameter("cookieprefix");
                    var5 = var6;
                    var5 = var6;
                    var4 = param0.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                    var5 = var7;
                    var5 = var7;
                    if ((param2.length() ^ -1) == param1) {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var5 = var7 + "; Expires=" + ke.a(-29971, bl.a((byte) 113) - -94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    fo.a(param0, 14575, "document.cookie=\"" + var5 + "\"");
                } catch (Throwable throwable) {
                }
                ak.a(param1 + 14159, param0);
            } catch (RuntimeException runtimeException) {
                throw fa.a((Throwable) ((Object) runtimeException), "jh.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        field_Hb = null;
        int var1 = 18 / ((82 - param0) / 43);
    }

    static {
    }
}
