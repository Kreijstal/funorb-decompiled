/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class raa extends hfa {
    static int field_F;
    private int field_C;
    static lda field_I;
    private int field_D;
    private boolean field_G;
    static int field_J;
    private int field_L;
    private boolean field_H;
    private int field_K;

    private raa(int param0, int param1, int param2, int param3, qda param4, pl param5, wj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((raa) this).field_D = 2147483647;
        ((raa) this).field_K = 2147483647;
        ((raa) this).field_H = param7 ? true : false;
        ((raa) this).field_A = param6;
        ((raa) this).field_G = param8 ? true : false;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        int var8 = 0;
        if (param1 == -7375) {
          var8 = this.b(param0, param1 ^ 0, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8 != 0) {
            if (!((raa) this).field_G) {
              if (((raa) this).a(param6, param0, 0, param2, param4)) {
                L0: {
                  if (-2 == (param3 ^ -1)) {
                    ((raa) this).field_L = -param4 + (-((raa) this).field_v + param6);
                    cea.field_b = (raa) this;
                    ((raa) this).field_C = param0 + -((raa) this).field_s + -param2;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                ((raa) this).field_u = param3;
                return true;
              } else {
                return var8 != 0;
              }
            } else {
              return true;
            }
          } else {
            if (((raa) this).a(param6, param0, 0, param2, param4)) {
              L1: {
                if (-2 == (param3 ^ -1)) {
                  ((raa) this).field_L = -param4 + (-((raa) this).field_v + param6);
                  cea.field_b = (raa) this;
                  ((raa) this).field_C = param0 + -((raa) this).field_s + -param2;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((raa) this).field_u = param3;
              return true;
            } else {
              return var8 != 0;
            }
          }
        } else {
          return true;
        }
    }

    final void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        this.a(param0, param1, param2, param3, param4, param5);
        ((raa) this).field_u = 0;
    }

    final static void e(byte param0) {
        int var1 = 0;
        if (param0 == 31) {
          var1 = qaa.field_e[rba.field_b];
          if (var1 == -1) {
            jga.field_v = jm.field_k[0] + "... " + id.field_g;
            cr.field_a = f.b((byte) 73);
            return;
          } else {
            jga.field_v = jm.field_k[var1] + "...";
            cr.field_a = f.b((byte) 73);
            return;
          }
        } else {
          raa.e((byte) 61);
          var1 = qaa.field_e[rba.field_b];
          if (var1 == -1) {
            jga.field_v = jm.field_k[0] + "... " + id.field_g;
            cr.field_a = f.b((byte) 73);
            return;
          } else {
            jga.field_v = jm.field_k[var1] + "...";
            cr.field_a = f.b((byte) 73);
            return;
          }
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        if (param2 >= 20) {
          if (((raa) this).a(param0, param1, param3, (byte) 98)) {
            ((raa) this).a(9, param0, param3, param1);
            ((raa) this).b(param1, param0, param3, 121);
            StringBuilder discarded$23 = param3.append(" revert=").append(((raa) this).field_H);
            if (-2147483648 != (((raa) this).field_K ^ -1)) {
              if (2147483647 != ((raa) this).field_D) {
                StringBuilder discarded$24 = param3.append(" to ").append(((raa) this).field_K).append(44).append(((raa) this).field_D);
                return param3;
              } else {
                return param3;
              }
            } else {
              return param3;
            }
          } else {
            return param3;
          }
        } else {
          return null;
        }
    }

    final void a(int param0) {
        this.a(param0 ^ 0);
        ((raa) this).field_A.a(0, ((raa) this).field_q, (byte) 59, ((raa) this).field_p, 0);
        ((raa) this).field_D = ((raa) this).field_v;
        ((raa) this).field_K = ((raa) this).field_s;
        if (param0 != -81) {
            ((raa) this).field_D = 118;
        }
    }

    final void a(int param0, int param1, wj param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
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
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
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
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        if (!(((raa) this).field_A instanceof hf)) {
          if ((((raa) this).field_u ^ -1) == -2) {
            var5 = mk.field_p - (((raa) this).field_C - -param0);
            var6 = -param1 + (gd.field_m - ((raa) this).field_L);
            if (var5 != ((raa) this).field_s) {
              ((raa) this).field_v = var6;
              ((raa) this).field_s = var5;
              if (((raa) this).field_k instanceof tm) {
                ((tm) (Object) ((raa) this).field_k).a(param1, (byte) 118, param0, (raa) this);
                if (param3 != 20) {
                  return;
                } else {
                  this.a(param0, param1, param2, param3 + 0);
                  return;
                }
              } else {
                if (param3 != 20) {
                  return;
                } else {
                  this.a(param0, param1, param2, param3 + 0);
                  return;
                }
              }
            } else {
              if (((raa) this).field_v != var6) {
                ((raa) this).field_v = var6;
                ((raa) this).field_s = var5;
                if (!(((raa) this).field_k instanceof tm)) {
                  if (param3 != 20) {
                    return;
                  } else {
                    this.a(param0, param1, param2, param3 + 0);
                    return;
                  }
                } else {
                  ((tm) (Object) ((raa) this).field_k).a(param1, (byte) 118, param0, (raa) this);
                  if (param3 != 20) {
                    return;
                  } else {
                    this.a(param0, param1, param2, param3 + 0);
                    return;
                  }
                }
              } else {
                if (param3 != 20) {
                  return;
                } else {
                  this.a(param0, param1, param2, param3 + 0);
                  return;
                }
              }
            }
          } else {
            L0: {
              if (((raa) this).field_H) {
                L1: {
                  if (((raa) this).field_K == ((raa) this).field_s) {
                    break L1;
                  } else {
                    L2: {
                      var5 = ((raa) this).field_K + -((raa) this).field_s;
                      stackOut_55_0 = this;
                      stackOut_55_1 = ((raa) this).field_s;
                      stackIn_59_0 = stackOut_55_0;
                      stackIn_59_1 = stackOut_55_1;
                      stackIn_56_0 = stackOut_55_0;
                      stackIn_56_1 = stackOut_55_1;
                      if (-3 > (Math.abs(var5) ^ -1)) {
                        stackOut_59_0 = this;
                        stackOut_59_1 = stackIn_59_1;
                        stackOut_59_2 = var5 >> -1200834879;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        stackIn_60_2 = stackOut_59_2;
                        break L2;
                      } else {
                        stackOut_56_0 = this;
                        stackOut_56_1 = stackIn_56_1;
                        stackIn_58_0 = stackOut_56_0;
                        stackIn_58_1 = stackOut_56_1;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        if (0 >= var5) {
                          stackOut_58_0 = this;
                          stackOut_58_1 = stackIn_58_1;
                          stackOut_58_2 = -1;
                          stackIn_60_0 = stackOut_58_0;
                          stackIn_60_1 = stackOut_58_1;
                          stackIn_60_2 = stackOut_58_2;
                          break L2;
                        } else {
                          stackOut_57_0 = this;
                          stackOut_57_1 = stackIn_57_1;
                          stackOut_57_2 = 1;
                          stackIn_60_0 = stackOut_57_0;
                          stackIn_60_1 = stackOut_57_1;
                          stackIn_60_2 = stackOut_57_2;
                          break L2;
                        }
                      }
                    }
                    ((raa) this).field_s = stackIn_60_1 + stackIn_60_2;
                    break L1;
                  }
                }
                if (((raa) this).field_D != ((raa) this).field_v) {
                  L3: {
                    var5 = -((raa) this).field_v + ((raa) this).field_D;
                    stackOut_63_0 = this;
                    stackOut_63_1 = ((raa) this).field_v;
                    stackIn_65_0 = stackOut_63_0;
                    stackIn_65_1 = stackOut_63_1;
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    if (Math.abs(var5) <= 2) {
                      stackOut_65_0 = this;
                      stackOut_65_1 = stackIn_65_1;
                      stackIn_67_0 = stackOut_65_0;
                      stackIn_67_1 = stackOut_65_1;
                      stackIn_66_0 = stackOut_65_0;
                      stackIn_66_1 = stackOut_65_1;
                      if ((var5 ^ -1) >= -1) {
                        stackOut_67_0 = this;
                        stackOut_67_1 = stackIn_67_1;
                        stackOut_67_2 = -1;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        stackIn_68_2 = stackOut_67_2;
                        break L3;
                      } else {
                        stackOut_66_0 = this;
                        stackOut_66_1 = stackIn_66_1;
                        stackOut_66_2 = 1;
                        stackIn_68_0 = stackOut_66_0;
                        stackIn_68_1 = stackOut_66_1;
                        stackIn_68_2 = stackOut_66_2;
                        break L3;
                      }
                    } else {
                      stackOut_64_0 = this;
                      stackOut_64_1 = stackIn_64_1;
                      stackOut_64_2 = var5 >> 1759968737;
                      stackIn_68_0 = stackOut_64_0;
                      stackIn_68_1 = stackOut_64_1;
                      stackIn_68_2 = stackOut_64_2;
                      break L3;
                    }
                  }
                  ((raa) this).field_v = stackIn_68_1 + stackIn_68_2;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (param3 != 20) {
              return;
            } else {
              this.a(param0, param1, param2, param3 + 0);
              return;
            }
          }
        } else {
          if (((hf) (Object) ((raa) this).field_A).field_z) {
            L4: {
              if ((((raa) this).field_u ^ -1) != -2) {
                if (((raa) this).field_H) {
                  L5: {
                    if (((raa) this).field_K == ((raa) this).field_s) {
                      break L5;
                    } else {
                      L6: {
                        var5 = ((raa) this).field_K + -((raa) this).field_s;
                        stackOut_33_0 = this;
                        stackOut_33_1 = ((raa) this).field_s;
                        stackIn_37_0 = stackOut_33_0;
                        stackIn_37_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (-3 > (Math.abs(var5) ^ -1)) {
                          stackOut_37_0 = this;
                          stackOut_37_1 = stackIn_37_1;
                          stackOut_37_2 = var5 >> -1200834879;
                          stackIn_38_0 = stackOut_37_0;
                          stackIn_38_1 = stackOut_37_1;
                          stackIn_38_2 = stackOut_37_2;
                          break L6;
                        } else {
                          stackOut_34_0 = this;
                          stackOut_34_1 = stackIn_34_1;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          if (0 >= var5) {
                            stackOut_36_0 = this;
                            stackOut_36_1 = stackIn_36_1;
                            stackOut_36_2 = -1;
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_38_1 = stackOut_36_1;
                            stackIn_38_2 = stackOut_36_2;
                            break L6;
                          } else {
                            stackOut_35_0 = this;
                            stackOut_35_1 = stackIn_35_1;
                            stackOut_35_2 = 1;
                            stackIn_38_0 = stackOut_35_0;
                            stackIn_38_1 = stackOut_35_1;
                            stackIn_38_2 = stackOut_35_2;
                            break L6;
                          }
                        }
                      }
                      ((raa) this).field_s = stackIn_38_1 + stackIn_38_2;
                      break L5;
                    }
                  }
                  if (((raa) this).field_D != ((raa) this).field_v) {
                    L7: {
                      var5 = -((raa) this).field_v + ((raa) this).field_D;
                      stackOut_41_0 = this;
                      stackOut_41_1 = ((raa) this).field_v;
                      stackIn_43_0 = stackOut_41_0;
                      stackIn_43_1 = stackOut_41_1;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      if (Math.abs(var5) <= 2) {
                        stackOut_43_0 = this;
                        stackOut_43_1 = stackIn_43_1;
                        stackIn_45_0 = stackOut_43_0;
                        stackIn_45_1 = stackOut_43_1;
                        stackIn_44_0 = stackOut_43_0;
                        stackIn_44_1 = stackOut_43_1;
                        if ((var5 ^ -1) >= -1) {
                          stackOut_45_0 = this;
                          stackOut_45_1 = stackIn_45_1;
                          stackOut_45_2 = -1;
                          stackIn_46_0 = stackOut_45_0;
                          stackIn_46_1 = stackOut_45_1;
                          stackIn_46_2 = stackOut_45_2;
                          break L7;
                        } else {
                          stackOut_44_0 = this;
                          stackOut_44_1 = stackIn_44_1;
                          stackOut_44_2 = 1;
                          stackIn_46_0 = stackOut_44_0;
                          stackIn_46_1 = stackOut_44_1;
                          stackIn_46_2 = stackOut_44_2;
                          break L7;
                        }
                      } else {
                        stackOut_42_0 = this;
                        stackOut_42_1 = stackIn_42_1;
                        stackOut_42_2 = var5 >> 1759968737;
                        stackIn_46_0 = stackOut_42_0;
                        stackIn_46_1 = stackOut_42_1;
                        stackIn_46_2 = stackOut_42_2;
                        break L7;
                      }
                    }
                    ((raa) this).field_v = stackIn_46_1 + stackIn_46_2;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                L8: {
                  var5 = mk.field_p - (((raa) this).field_C - -param0);
                  var6 = -param1 + (gd.field_m - ((raa) this).field_L);
                  if (var5 != ((raa) this).field_s) {
                    break L8;
                  } else {
                    if (((raa) this).field_v == var6) {
                      break L4;
                    } else {
                      break L8;
                    }
                  }
                }
                ((raa) this).field_v = var6;
                ((raa) this).field_s = var5;
                if (!(((raa) this).field_k instanceof tm)) {
                  break L4;
                } else {
                  ((tm) (Object) ((raa) this).field_k).a(param1, (byte) 118, param0, (raa) this);
                  break L4;
                }
              }
            }
            if (param3 != 20) {
              return;
            } else {
              this.a(param0, param1, param2, param3 + 0);
              return;
            }
          } else {
            L9: {
              if (((raa) this).field_H) {
                L10: {
                  if (((raa) this).field_K == ((raa) this).field_s) {
                    break L10;
                  } else {
                    L11: {
                      var5 = ((raa) this).field_K + -((raa) this).field_s;
                      stackOut_5_0 = this;
                      stackOut_5_1 = ((raa) this).field_s;
                      stackIn_9_0 = stackOut_5_0;
                      stackIn_9_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (-3 > (Math.abs(var5) ^ -1)) {
                        stackOut_9_0 = this;
                        stackOut_9_1 = stackIn_9_1;
                        stackOut_9_2 = var5 >> -1200834879;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        break L11;
                      } else {
                        stackOut_6_0 = this;
                        stackOut_6_1 = stackIn_6_1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (0 >= var5) {
                          stackOut_8_0 = this;
                          stackOut_8_1 = stackIn_8_1;
                          stackOut_8_2 = -1;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_10_2 = stackOut_8_2;
                          break L11;
                        } else {
                          stackOut_7_0 = this;
                          stackOut_7_1 = stackIn_7_1;
                          stackOut_7_2 = 1;
                          stackIn_10_0 = stackOut_7_0;
                          stackIn_10_1 = stackOut_7_1;
                          stackIn_10_2 = stackOut_7_2;
                          break L11;
                        }
                      }
                    }
                    ((raa) this).field_s = stackIn_10_1 + stackIn_10_2;
                    break L10;
                  }
                }
                if (((raa) this).field_D != ((raa) this).field_v) {
                  L12: {
                    var5 = -((raa) this).field_v + ((raa) this).field_D;
                    stackOut_13_0 = this;
                    stackOut_13_1 = ((raa) this).field_v;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    if (Math.abs(var5) <= 2) {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if ((var5 ^ -1) >= -1) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = -1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        break L12;
                      } else {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        break L12;
                      }
                    } else {
                      stackOut_14_0 = this;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = var5 >> 1759968737;
                      stackIn_18_0 = stackOut_14_0;
                      stackIn_18_1 = stackOut_14_1;
                      stackIn_18_2 = stackOut_14_2;
                      break L12;
                    }
                  }
                  ((raa) this).field_v = stackIn_18_1 + stackIn_18_2;
                  break L9;
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            if (param3 != 20) {
              return;
            } else {
              this.a(param0, param1, param2, param3 + 0);
              return;
            }
          }
        }
    }

    public static void h(int param0) {
        if (param0 != 2) {
            return;
        }
        field_I = null;
    }

    static {
    }
}
