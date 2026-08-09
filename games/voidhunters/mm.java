/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends llb {
    llb field_Wb;
    llb field_wb;
    String field_Vb;
    byte[] field_Pb;
    boolean field_xb;
    int field_Db;
    llb field_Jb;
    int field_Kb;
    llb field_Hb;
    int field_ec;
    boolean field_Qb;
    llb field_bc;
    int field_Cb;
    llb field_vb;
    llb[] field_Zb;
    llb field_Tb;
    boolean field_cc;
    llb field_Rb;
    boolean field_Gb;
    int field_Bb;
    boolean field_ac;
    int field_Fb;
    int field_zb;
    llb field_Sb;
    llb field_Mb;
    llb field_Ab;
    long field_Ob;
    llb field_Lb;
    llb field_dc;
    boolean field_fc;
    llb field_Yb;
    long field_Nb;
    boolean field_Xb;
    llb field_yb;
    llb field_Eb;
    String[] field_Ib;
    int field_Ub;

    mm(int param0) {
        super(0L, (llb) null);
        this.field_Pb = new byte[param0];
    }

    final int f(byte param0) {
        mm var3;
        if (param0 != -13) {
          var3 = (mm) null;
          this.a((mm) null, -117);
          return (int)this.c(26390);
        } else {
          return (int)this.c(26390);
        }
    }

    final boolean e(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 < 21) {
          L0: {
            this.f((byte) -41);
            if (this.c((byte) 87)) {
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
            if (this.c((byte) 87)) {
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

    final boolean a(mm param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        mm var7 = null;
        try {
          L0: {
            L1: {
              if (!this.field_ac) {
                if (6 == this.field_ec) {
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
              if (param1 < -120) {
                break L2;
              } else {
                var7 = (mm) null;
                this.a((mm) null, -66);
                break L2;
              }
            }
            L3: {
              if (!param0.field_ac) {
                if (-7 == (param0.field_ec ^ -1)) {
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
            L4: {
              var4 = stackIn_14_0;
              if (var4 != 0) {
                stackIn_17_0 = 0;
                break L4;
              } else {
                stackIn_17_0 = 1;
                break L4;
              }
            }
            if (stackIn_17_0 != var3_int) {
              L5: {
                if (var3_int != 0) {
                  break L5;
                } else {
                  if (param0.field_cc != this.field_cc) {
                    stackIn_24_0 = this.field_cc;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (!this.field_cc) {
                      break L5;
                    } else {
                      if (this.field_Cb == param0.field_Cb) {
                        break L5;
                      } else {
                        L6: {
                          if (this.field_Cb >= param0.field_Cb) {
                            stackIn_30_0 = 0;
                            break L6;
                          } else {
                            stackIn_30_0 = 1;
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
              if (param0.field_fc != this.field_fc) {
                L7: {
                  if (this.field_fc) {
                    stackIn_36_0 = 0;
                    break L7;
                  } else {
                    stackIn_36_0 = 1;
                    break L7;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                if (this.field_fc) {
                  L8: {
                    if (this.field_Gb) {
                      stackIn_48_0 = 1;
                      break L8;
                    } else {
                      if (this.field_Bb == 2) {
                        stackIn_48_0 = 1;
                        break L8;
                      } else {
                        stackIn_48_0 = 0;
                        break L8;
                      }
                    }
                  }
                  L9: {
                    var5 = stackIn_48_0;
                    if (!param0.field_Gb) {
                      if ((param0.field_Bb ^ -1) == -3) {
                        stackIn_54_0 = 1;
                        break L9;
                      } else {
                        stackIn_54_0 = 0;
                        break L9;
                      }
                    } else {
                      stackIn_54_0 = 1;
                      break L9;
                    }
                  }
                  L10: {
                    var6 = stackIn_54_0;
                    if (var6 != 0) {
                      stackIn_57_0 = 0;
                      break L10;
                    } else {
                      stackIn_57_0 = 1;
                      break L10;
                    }
                  }
                  if (stackIn_57_0 != var5) {
                    L11: {
                      if (param0.field_Ob >= this.field_Ob) {
                        stackIn_63_0 = 0;
                        break L11;
                      } else {
                        stackIn_63_0 = 1;
                        break L11;
                      }
                    }
                    decompiledRegionSelector0 = 6;
                    break L0;
                  } else {
                    stackIn_59_0 = var5;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  }
                } else {
                  L12: {
                    if (param0.field_Ob <= this.field_Ob) {
                      stackIn_41_0 = 0;
                      break L12;
                    } else {
                      stackIn_41_0 = 1;
                      break L12;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            } else {
              stackIn_19_0 = var3_int;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackIn_66_0 = (RuntimeException) (var3);

            stackIn_66_1 = new StringBuilder().append("mm.A(");

            if (param0 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L13;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L13;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_24_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_30_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_36_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_41_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_59_0 != 0;
                  } else {
                    return stackIn_63_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    static {
    }
}
