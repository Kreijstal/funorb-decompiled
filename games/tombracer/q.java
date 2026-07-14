/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends ql {
    static boolean field_r;
    private int field_p;
    private int field_q;
    static String field_o;
    private ffa field_n;

    final static void a(byte param0, int param1, int param2) {
        kh var3 = null;
        var3 = ql.field_k;
        var3.k(param1, -2988);
        var3.i(3, 0);
        var3.i(8, 0);
        if (param0 >= -100) {
          field_r = true;
          var3.f(-1477662136, param2);
          return;
        } else {
          var3.f(-1477662136, param2);
          return;
        }
    }

    public final int hashCode() {
        return ira.a(((q) this).field_q, ((q) this).field_p, (byte) -93);
    }

    final ffa a(byte param0) {
        if (param0 >= -67) {
            ((q) this).field_q = 19;
            return ((q) this).field_n;
        }
        return ((q) this).field_n;
    }

    final void a(int param0, ffa param1, byte param2, int param3) {
        ((q) this).field_p = param3;
        ((q) this).field_n = param1;
        ((q) this).field_q = param0;
        if (param2 != 116) {
            Object var6 = null;
            ((q) this).a(92, (ffa) null, (byte) -51, 63);
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        if (param1 == 11955) {
          if (48 > param0) {
            if (param0 < 65) {
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
              if (param0 <= 90) {
                stackOut_65_0 = 1;
                stackIn_67_0 = stackOut_65_0;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param0 < 97) {
                      break L1;
                    } else {
                      if (param0 > 122) {
                        break L1;
                      } else {
                        stackOut_62_0 = 1;
                        stackIn_64_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (param0 > 57) {
              if (param0 < 65) {
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
                if (param0 > 90) {
                  L2: {
                    L3: {
                      if (param0 < 97) {
                        break L3;
                      } else {
                        if (param0 > 122) {
                          break L3;
                        } else {
                          stackOut_48_0 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_49_0 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackOut_43_0 = 1;
                  stackIn_45_0 = stackOut_43_0;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackOut_38_0 = 1;
              stackIn_40_0 = stackOut_38_0;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          field_o = null;
          if (48 <= param0) {
            if (param0 > 57) {
              if (param0 < 65) {
                if (param0 >= 97) {
                  if (param0 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (param0 > 90) {
                  L4: {
                    L5: {
                      if (param0 < 97) {
                        break L5;
                      } else {
                        if (param0 > 122) {
                          break L5;
                        } else {
                          stackOut_26_0 = 1;
                          stackIn_28_0 = stackOut_26_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param0 < 65) {
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
              if (param0 > 90) {
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
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 == -98) {
          if (param3 < ((q) this).field_q) {
            if (param1 >= ((q) this).field_q) {
              if (((q) this).field_p > param2) {
                if (param0 < ((q) this).field_p) {
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
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final boolean a(int param0, int param1, ffa param2, int param3) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param3 > 57) {
          if (((q) this).field_n == param2) {
            if (param1 != ((q) this).field_q) {
              return false;
            } else {
              L0: {
                if (param0 != ((q) this).field_p) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_o = null;
          if (((q) this).field_n == param2) {
            if (param1 != ((q) this).field_q) {
              return false;
            } else {
              L1: {
                if (param0 != ((q) this).field_p) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 8) {
            field_r = false;
        }
    }

    final boolean a(int param0, int param1, boolean param2) {
        if (param2) {
          if (((q) this).field_q == param0) {
            if (param1 != ((q) this).field_p) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_r = false;
          if (((q) this).field_q == param0) {
            if (param1 != ((q) this).field_p) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    q(ffa param0, int param1, int param2) {
        ((q) this).field_q = param1;
        ((q) this).field_n = param0;
        ((q) this).field_p = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Loading graphics";
    }
}
