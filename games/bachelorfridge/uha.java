/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uha extends sna {
    sna field_wb;
    sna field_xb;
    sna field_Ib;
    static String field_Vb;
    boolean field_Bb;
    boolean field_Fb;
    long field_Sb;
    int field_Pb;
    sna field_ac;
    sna field_Tb;
    sna field_Qb;
    sna field_yb;
    sna field_Hb;
    String[] field_Cb;
    sna field_cc;
    sna field_Ub;
    boolean field_gc;
    static kv[][] field_Xb;
    sna field_hc;
    byte[] field_Eb;
    long field_Ob;
    sna field_Yb;
    sna field_Gb;
    boolean field_Zb;
    sna field_vb;
    boolean field_dc;
    sna field_Db;
    String field_Jb;
    sna field_fc;
    int field_Rb;
    int field_Lb;
    boolean field_Wb;
    int field_Mb;
    int field_Kb;
    sna[] field_Ab;
    boolean field_zb;
    int field_ec;
    int field_bc;
    int field_Nb;

    public static void g(byte param0) {
        if (param0 <= 32) {
            field_Vb = (String) null;
            field_Vb = null;
            field_Xb = (kv[][]) null;
            return;
        }
        field_Vb = null;
        field_Xb = (kv[][]) null;
    }

    final static pp b(lu param0, int param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        mh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = qi.a(param0, (byte) 90);
              if (param1 == -7) {
                break L1;
              } else {
                uha.g((byte) 6);
                break L1;
              }
            }
            L2: {
              if (-2 == (param0.b(16711935) ^ -1)) {
                stackIn_5_0 = 1;
                break L2;
              } else {
                stackIn_5_0 = 0;
                break L2;
              }
            }
            var3 = stackIn_5_0;
            stackIn_6_0 = new mh(var2, var3 != 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("uha.BA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return (pp) ((Object) stackIn_6_0);
    }

    final boolean a(int param0, uha param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_18_0 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        lu var7 = null;
        try {
          L0: {
            L1: {
              if (!this.field_Wb) {
                if (-7 == (this.field_ec ^ -1)) {
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
              if (!param1.field_Wb) {
                if (-7 == (param1.field_ec ^ -1)) {
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
            L3: {
              var4 = stackIn_12_0;
              stackIn_14_0 = var4;

              if (var3_int != 0) {
                stackIn_15_0 = stackIn_14_0;
                stackIn_15_1 = 0;
                break L3;
              } else {
                stackIn_15_0 = stackIn_14_0;
                stackIn_15_1 = 1;
                break L3;
              }
            }
            if (stackIn_15_0 == stackIn_15_1) {
              stackIn_18_0 = var3_int;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L4: {
                if (var3_int == 0) {
                  if (param1.field_zb == this.field_zb) {
                    if (!this.field_zb) {
                      break L4;
                    } else {
                      if (this.field_Kb == param1.field_Kb) {
                        break L4;
                      } else {
                        L5: {
                          if (this.field_Kb >= param1.field_Kb) {
                            stackIn_29_0 = 0;
                            break L5;
                          } else {
                            stackIn_29_0 = 1;
                            break L5;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_23_0 = this.field_zb;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                if (param1.field_Zb) {
                  stackIn_33_0 = 0;
                  break L6;
                } else {
                  stackIn_33_0 = 1;
                  break L6;
                }
              }
              L7: {


                if (this.field_Zb) {

                  stackIn_36_1 = 0;
                  break L7;
                } else {

                  stackIn_36_1 = 1;
                  break L7;
                }
              }
              if (stackIn_33_0 != stackIn_36_1) {
                L8: {
                  if (this.field_Zb) {
                    stackIn_41_0 = 0;
                    break L8;
                  } else {
                    stackIn_41_0 = 1;
                    break L8;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                L9: {
                  if (param0 == -7) {
                    break L9;
                  } else {
                    var7 = (lu) null;
                    uha.b((lu) null, -6);
                    break L9;
                  }
                }
                if (this.field_Zb) {
                  L10: {
                    if (this.field_Fb) {
                      stackIn_55_0 = 1;
                      break L10;
                    } else {
                      if (2 == this.field_Lb) {
                        stackIn_55_0 = 1;
                        break L10;
                      } else {
                        stackIn_55_0 = 0;
                        break L10;
                      }
                    }
                  }
                  L11: {
                    var5 = stackIn_55_0;
                    if (!param1.field_Fb) {
                      if (2 == param1.field_Lb) {
                        stackIn_61_0 = 1;
                        break L11;
                      } else {
                        stackIn_61_0 = 0;
                        break L11;
                      }
                    } else {
                      stackIn_61_0 = 1;
                      break L11;
                    }
                  }
                  L12: {
                    var6 = stackIn_61_0;
                    stackIn_63_0 = var5;

                    if (var6 != 0) {
                      stackIn_64_0 = stackIn_63_0;
                      stackIn_64_1 = 0;
                      break L12;
                    } else {
                      stackIn_64_0 = stackIn_63_0;
                      stackIn_64_1 = 1;
                      break L12;
                    }
                  }
                  if (stackIn_64_0 != stackIn_64_1) {
                    L13: {
                      if (this.field_Ob <= param1.field_Ob) {
                        stackIn_70_0 = 0;
                        break L13;
                      } else {
                        stackIn_70_0 = 1;
                        break L13;
                      }
                    }
                    decompiledRegionSelector0 = 6;
                    break L0;
                  } else {
                    stackIn_66_0 = var5;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  }
                } else {
                  L14: {
                    if (this.field_Ob >= param1.field_Ob) {
                      stackIn_48_0 = 0;
                      break L14;
                    } else {
                      stackIn_48_0 = 1;
                      break L14;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var3);

            stackIn_73_1 = new StringBuilder().append("uha.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L15;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L15;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_29_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_41_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_48_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_66_0 != 0;
                  } else {
                    return stackIn_70_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final int f(byte param0) {
        if (param0 >= -44) {
            return -126;
        }
        return (int)this.d(-115);
    }

    uha(int param0) {
        super(0L, (sna) null);
        this.field_Eb = new byte[param0];
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 < 24) {
          L0: {
            this.field_Zb = true;
            if (this.a(0)) {
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
            if (this.a(0)) {
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

    static {
        field_Vb = "Public";
    }
}
