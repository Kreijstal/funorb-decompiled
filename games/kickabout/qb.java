/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends hd {
    hd field_Rb;
    static String[] field_Qb;
    hd field_kc;
    hd field_Bb;
    hd field_Lb;
    int field_Ab;
    hd field_fc;
    boolean field_Cb;
    hd field_dc;
    boolean field_Tb;
    hd field_zb;
    hd field_jc;
    long field_Nb;
    long field_Fb;
    int field_Mb;
    boolean field_Ub;
    hd field_Zb;
    hd field_Hb;
    hd field_Ib;
    int field_Db;
    boolean field_ic;
    hd field_Gb;
    hd field_cc;
    int field_ac;
    int field_bc;
    hd field_Yb;
    hd field_Jb;
    hd field_Pb;
    boolean field_Xb;
    byte[] field_Eb;
    boolean field_hc;
    String[] field_Kb;
    static String field_Vb;
    String field_ec;
    static String field_lc;
    boolean field_yb;
    int field_gc;
    hd[] field_Sb;
    int field_Wb;
    int field_Ob;

    final int h(byte param0) {
        int var2 = 106 % ((35 - param0) / 37);
        return (int)this.f((byte) 98);
    }

    public static void a(int param0) {
        field_Qb = null;
        field_Vb = null;
        field_lc = null;
        if (param0 != -7) {
            field_Vb = (String) null;
        }
    }

    final boolean a(int param0, qb param1) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        qb var7 = null;
        try {
          L0: {
            L1: {
              if (param0 == 20724) {
                break L1;
              } else {
                var7 = (qb) null;
                this.a(89, (qb) null);
                break L1;
              }
            }
            L2: {
              if (!this.field_hc) {
                if ((this.field_Ab ^ -1) == -7) {
                  stackIn_8_0 = 1;
                  break L2;
                } else {
                  stackIn_8_0 = 0;
                  break L2;
                }
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
            L3: {
              var3_int = stackIn_8_0;
              if (!param1.field_hc) {
                if ((param1.field_Ab ^ -1) == -7) {
                  stackIn_14_0 = 1;
                  break L3;
                } else {
                  stackIn_14_0 = 0;
                  break L3;
                }
              } else {
                stackIn_14_0 = 1;
                break L3;
              }
            }
            var4 = stackIn_14_0;
            if (var3_int != var4) {
              stackIn_17_0 = var3_int;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L4: {
                if (var3_int != 0) {
                  break L4;
                } else {
                  L5: {
                    if (this.field_Xb) {
                      stackIn_22_0 = 0;
                      break L5;
                    } else {
                      stackIn_22_0 = 1;
                      break L5;
                    }
                  }
                  if (stackIn_22_0 == (param1.field_Xb ? 1 : 0)) {
                    stackIn_25_0 = this.field_Xb;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (!this.field_Xb) {
                      break L4;
                    } else {
                      if (param1.field_Wb == this.field_Wb) {
                        break L4;
                      } else {
                        L6: {
                          if (this.field_Wb >= param1.field_Wb) {
                            stackIn_31_0 = 0;
                            break L6;
                          } else {
                            stackIn_31_0 = 1;
                            break L6;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                }
              }
              if (param1.field_Cb != this.field_Cb) {
                L7: {
                  if (this.field_Cb) {
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
                if (!this.field_Cb) {
                  L8: {
                    if ((this.field_Fb ^ -1L) <= (param1.field_Fb ^ -1L)) {
                      stackIn_61_0 = 0;
                      break L8;
                    } else {
                      stackIn_61_0 = 1;
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 6;
                  break L0;
                } else {
                  L9: {
                    if (this.field_ic) {
                      stackIn_45_0 = 1;
                      break L9;
                    } else {
                      if (this.field_Mb == 2) {
                        stackIn_45_0 = 1;
                        break L9;
                      } else {
                        stackIn_45_0 = 0;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    var5 = stackIn_45_0;
                    if (!param1.field_ic) {
                      if (-3 == (param1.field_Mb ^ -1)) {
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
                  var6 = stackIn_51_0;
                  if (var5 == var6) {
                    L11: {
                      if ((this.field_Fb ^ -1L) >= (param1.field_Fb ^ -1L)) {
                        stackIn_57_0 = 0;
                        break L11;
                      } else {
                        stackIn_57_0 = 1;
                        break L11;
                      }
                    }
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    stackIn_53_0 = var5;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackIn_64_0 = (RuntimeException) (var3);

            stackIn_64_1 = new StringBuilder().append("qb.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L12;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L12;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_25_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_31_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_37_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_53_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_57_0 != 0;
                  } else {
                    return stackIn_61_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -7) {
          L0: {
            this.field_Db = 32;
            if (this.a((byte) -60)) {
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
            if (this.a((byte) -60)) {
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

    qb(int param0) {
        super(0L, (hd) null);
        this.field_Eb = new byte[param0];
    }

    static {
        field_lc = "<%0> has lost connection.";
        field_Vb = "goals";
    }
}
