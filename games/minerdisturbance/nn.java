/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    int field_e;
    private int field_j;
    boolean field_d;
    int field_i;
    private int field_p;
    private int field_o;
    static ag field_f;
    private int field_b;
    static char field_l;
    static int field_k;
    static ea field_c;
    private int field_g;
    static boolean field_n;
    static r field_r;
    static ae field_m;
    static boolean field_q;
    static ea[] field_h;
    static String field_a;

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -16) {
          L0: {
            ((nn) this).d(89);
            if (102 != ((nn) this).field_g) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (102 != ((nn) this).field_g) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static java.net.URL a(int param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        L0: {
          var3 = null;
          var4 = null;
          if (nj.field_a == null) {
            break L0;
          } else {
            if (nj.field_a.equals((Object) (Object) param1.getParameter("settings"))) {
              break L0;
            } else {
              var3 = (Object) (Object) nj.field_a;
              var4 = var3;
              var4 = var3;
              break L0;
            }
          }
        }
        if (param0 < 83) {
          L1: {
            field_n = true;
            if (null == w.field_T) {
              break L1;
            } else {
              if (w.field_T.equals((Object) (Object) param1.getParameter("session"))) {
                break L1;
              } else {
                var4 = (Object) (Object) w.field_T;
                break L1;
              }
            }
          }
          return mj.a((String) var4, -1, false, (String) var3, param2);
        } else {
          L2: {
            if (null == w.field_T) {
              break L2;
            } else {
              if (w.field_T.equals((Object) (Object) param1.getParameter("session"))) {
                break L2;
              } else {
                var4 = (Object) (Object) w.field_T;
                break L2;
              }
            }
          }
          return mj.a((String) var4, -1, false, (String) var3, param2);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var6 = this.a(param0, param3, gb.field_e, param4, param1, 113, nk.field_w);
        var7 = this.a(param0, param3, m.field_e, param4, param1, 50, wi.field_w);
        ((nn) this).a(var6, var7, -1);
        if (param2 != 140) {
          boolean discarded$2 = ((nn) this).e((byte) -78);
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        field_f = null;
        field_c = null;
        field_h = null;
        field_a = null;
        field_m = null;
        if (!param0) {
          var2 = null;
          java.net.URL discarded$2 = nn.a(-84, (java.applet.Applet) null, (java.net.URL) null);
          field_r = null;
          return;
        } else {
          field_r = null;
          return;
        }
    }

    final boolean e(byte param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 124) {
          L0: {
            var3 = null;
            java.net.URL discarded$6 = nn.a(-85, (java.applet.Applet) null, (java.net.URL) null);
            if ((((nn) this).field_g ^ -1) != -98) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((((nn) this).field_g ^ -1) != -98) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((nn) this).field_p = param0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((nn) this).field_d = stackIn_3_1 != 0;
        if (((nn) this).field_d) {
          ((nn) this).field_e = param2;
          return;
        } else {
          ((nn) this).field_e = param1;
          return;
        }
    }

    final void a(int param0, int param1) {
        if (((nn) this).field_p == param1) {
            ((nn) this).field_e = param0;
            ((nn) this).field_d = false;
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        var2 = 77 / ((75 - param0) / 33);
        if (-1 == ((nn) this).field_j) {
          if (84 != ((nn) this).field_g) {
            if (-84 == ((nn) this).field_g) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((nn) this).field_d = stackIn_3_1 != 0;
        ((nn) this).field_p = 0;
        if (!((nn) this).field_d) {
          if (param2 < 82) {
            ((nn) this).field_p = 102;
            return;
          } else {
            return;
          }
        } else {
          ((nn) this).field_e = param1;
          if (param2 >= 82) {
            return;
          } else {
            ((nn) this).field_p = 102;
            return;
          }
        }
    }

    final boolean b(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          if (((nn) this).field_o == 0) {
            if (((nn) this).field_g != 84) {
              if (((nn) this).field_g == 83) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          boolean discarded$7 = ((nn) this).b(12);
          if (((nn) this).field_o == 0) {
            if (((nn) this).field_g == 84) {
              return true;
            } else {
              L0: {
                if (((nn) this).field_g != 83) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final void d(int param0) {
        ((nn) this).field_o = 0;
        ((nn) this).field_g = 0;
        ((nn) this).field_j = 0;
        if (((nn) this).field_p == 0) {
          if ((lj.field_t ^ -1) == -97) {
            L0: {
              if ((((nn) this).field_e ^ -1) >= -1) {
                ((nn) this).field_e = ((nn) this).field_i;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              ((nn) this).field_e = ((nn) this).field_e - 1;
              ((nn) this).field_d = false;
              if (0 == ((nn) this).field_p) {
                ((nn) this).field_g = lj.field_t;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 != (((nn) this).field_p ^ -1)) {
                break L2;
              } else {
                if (lj.field_t == 97) {
                  L3: {
                    ((nn) this).field_e = ((nn) this).field_e + 1;
                    if (((nn) this).field_i <= ((nn) this).field_e) {
                      ((nn) this).field_e = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((nn) this).field_d = false;
                  break L2;
                } else {
                  if (param0 == -4664) {
                    return;
                  } else {
                    boolean discarded$6 = ((nn) this).b(90);
                    return;
                  }
                }
              }
            }
            if (param0 == -4664) {
              return;
            } else {
              boolean discarded$7 = ((nn) this).b(90);
              return;
            }
          } else {
            L4: {
              if (0 == ((nn) this).field_p) {
                ((nn) this).field_g = lj.field_t;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 != (((nn) this).field_p ^ -1)) {
                break L5;
              } else {
                if (lj.field_t == 97) {
                  L6: {
                    ((nn) this).field_e = ((nn) this).field_e + 1;
                    if (((nn) this).field_i <= ((nn) this).field_e) {
                      ((nn) this).field_e = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((nn) this).field_d = false;
                  break L5;
                } else {
                  if (param0 == -4664) {
                    return;
                  } else {
                    boolean discarded$8 = ((nn) this).b(90);
                    return;
                  }
                }
              }
            }
            if (param0 == -4664) {
              return;
            } else {
              boolean discarded$9 = ((nn) this).b(90);
              return;
            }
          }
        } else {
          L7: {
            if (0 == ((nn) this).field_p) {
              ((nn) this).field_g = lj.field_t;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (-1 != (((nn) this).field_p ^ -1)) {
              break L8;
            } else {
              if (lj.field_t == 97) {
                L9: {
                  ((nn) this).field_e = ((nn) this).field_e + 1;
                  if (((nn) this).field_i <= ((nn) this).field_e) {
                    ((nn) this).field_e = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                ((nn) this).field_d = false;
                break L8;
              } else {
                if (param0 == -4664) {
                  return;
                } else {
                  boolean discarded$10 = ((nn) this).b(90);
                  return;
                }
              }
            }
          }
          if (param0 == -4664) {
            return;
          } else {
            boolean discarded$11 = ((nn) this).b(90);
            return;
          }
        }
    }

    final boolean c(int param0) {
        int var2 = 117 / ((param0 - 42) / 55);
        return (((nn) this).field_g ^ -1) == -104 ? true : false;
    }

    final boolean a(int param0) {
        int var2 = 43 / ((4 - param0) / 55);
        return ((nn) this).field_g == 96 ? true : false;
    }

    final void b(byte param0) {
        int var2 = 0;
        ((nn) this).field_o = 0;
        ((nn) this).field_g = 0;
        ((nn) this).field_j = 0;
        if (0 == ((nn) this).field_p) {
          if (lj.field_t == 98) {
            if (((nn) this).field_e > 0) {
              ((nn) this).field_d = false;
              ((nn) this).field_e = ((nn) this).field_e - 1;
              if (0 != ((nn) this).field_p) {
                L0: {
                  var2 = 91 % ((param0 - 33) / 54);
                  if (-1 != (((nn) this).field_p ^ -1)) {
                    break L0;
                  } else {
                    if (-100 != (lj.field_t ^ -1)) {
                      break L0;
                    } else {
                      ((nn) this).field_e = ((nn) this).field_e + 1;
                      ((nn) this).field_d = false;
                      if ((((nn) this).field_i ^ -1) >= (((nn) this).field_e ^ -1)) {
                        ((nn) this).field_e = 0;
                        break L0;
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              } else {
                ((nn) this).field_g = lj.field_t;
                var2 = 91 % ((param0 - 33) / 54);
                if (-1 == (((nn) this).field_p ^ -1)) {
                  if (-100 == (lj.field_t ^ -1)) {
                    L1: {
                      ((nn) this).field_e = ((nn) this).field_e + 1;
                      ((nn) this).field_d = false;
                      if ((((nn) this).field_i ^ -1) >= (((nn) this).field_e ^ -1)) {
                        ((nn) this).field_e = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ((nn) this).field_e = ((nn) this).field_i;
              ((nn) this).field_d = false;
              ((nn) this).field_e = ((nn) this).field_e - 1;
              if (0 != ((nn) this).field_p) {
                L2: {
                  var2 = 91 % ((param0 - 33) / 54);
                  if (-1 != (((nn) this).field_p ^ -1)) {
                    break L2;
                  } else {
                    if (-100 != (lj.field_t ^ -1)) {
                      break L2;
                    } else {
                      ((nn) this).field_e = ((nn) this).field_e + 1;
                      ((nn) this).field_d = false;
                      if ((((nn) this).field_i ^ -1) >= (((nn) this).field_e ^ -1)) {
                        ((nn) this).field_e = 0;
                        break L2;
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              } else {
                L3: {
                  ((nn) this).field_g = lj.field_t;
                  var2 = 91 % ((param0 - 33) / 54);
                  if (-1 != (((nn) this).field_p ^ -1)) {
                    break L3;
                  } else {
                    if (-100 != (lj.field_t ^ -1)) {
                      break L3;
                    } else {
                      ((nn) this).field_e = ((nn) this).field_e + 1;
                      ((nn) this).field_d = false;
                      if ((((nn) this).field_i ^ -1) >= (((nn) this).field_e ^ -1)) {
                        ((nn) this).field_e = 0;
                        break L3;
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            if (0 != ((nn) this).field_p) {
              L4: {
                var2 = 91 % ((param0 - 33) / 54);
                if (-1 != (((nn) this).field_p ^ -1)) {
                  break L4;
                } else {
                  if (-100 != (lj.field_t ^ -1)) {
                    break L4;
                  } else {
                    ((nn) this).field_e = ((nn) this).field_e + 1;
                    ((nn) this).field_d = false;
                    if ((((nn) this).field_i ^ -1) >= (((nn) this).field_e ^ -1)) {
                      ((nn) this).field_e = 0;
                      break L4;
                    } else {
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              L5: {
                ((nn) this).field_g = lj.field_t;
                var2 = 91 % ((param0 - 33) / 54);
                if (-1 != (((nn) this).field_p ^ -1)) {
                  break L5;
                } else {
                  if (-100 != (lj.field_t ^ -1)) {
                    break L5;
                  } else {
                    ((nn) this).field_e = ((nn) this).field_e + 1;
                    ((nn) this).field_d = false;
                    if ((((nn) this).field_i ^ -1) >= (((nn) this).field_e ^ -1)) {
                      ((nn) this).field_e = 0;
                      break L5;
                    } else {
                      return;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          if (0 != ((nn) this).field_p) {
            L6: {
              var2 = 91 % ((param0 - 33) / 54);
              if (-1 != (((nn) this).field_p ^ -1)) {
                break L6;
              } else {
                if (-100 != (lj.field_t ^ -1)) {
                  break L6;
                } else {
                  ((nn) this).field_e = ((nn) this).field_e + 1;
                  ((nn) this).field_d = false;
                  if ((((nn) this).field_i ^ -1) >= (((nn) this).field_e ^ -1)) {
                    ((nn) this).field_e = 0;
                    break L6;
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          } else {
            L7: {
              ((nn) this).field_g = lj.field_t;
              var2 = 91 % ((param0 - 33) / 54);
              if (-1 != (((nn) this).field_p ^ -1)) {
                break L7;
              } else {
                if (-100 != (lj.field_t ^ -1)) {
                  break L7;
                } else {
                  ((nn) this).field_e = ((nn) this).field_e + 1;
                  ((nn) this).field_d = false;
                  if ((((nn) this).field_i ^ -1) >= (((nn) this).field_e ^ -1)) {
                    ((nn) this).field_e = 0;
                    break L7;
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final boolean d(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 77) {
          L0: {
            ((nn) this).c((byte) -76);
            if (0 == ((nn) this).field_p) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (0 == ((nn) this).field_p) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    nn(int param0) {
        ((nn) this).field_e = 0;
        ((nn) this).field_d = false;
        ((nn) this).field_i = param0;
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 >= param4) {
          if (param3 > param6) {
            if (param0 > param2) {
              if (param5 < 34) {
                ((nn) this).a(-46, 20, -121, 53, 72);
                return -1;
              } else {
                return -1;
              }
            } else {
              if (param0 - -(param1 * ((nn) this).field_i) <= param2) {
                if (param5 < 34) {
                  ((nn) this).a(-46, 20, -121, 53, 72);
                  return -1;
                } else {
                  return -1;
                }
              } else {
                return (param2 + -param0) / param1;
              }
            }
          } else {
            if (param5 < 34) {
              ((nn) this).a(-46, 20, -121, 53, 72);
              return -1;
            } else {
              return -1;
            }
          }
        } else {
          if (param5 < 34) {
            ((nn) this).a(-46, 20, -121, 53, 72);
            return -1;
          } else {
            return -1;
          }
        }
    }

    final void c(byte param0) {
        ((nn) this).field_o = 0;
        ((nn) this).field_g = 0;
        ((nn) this).field_j = 0;
        if (param0 > 80) {
          if (((nn) this).field_p == 0) {
            ((nn) this).field_g = lj.field_t;
            return;
          } else {
            return;
          }
        } else {
          ((nn) this).a(false, 50, -65);
          if (((nn) this).field_p != 0) {
            return;
          } else {
            ((nn) this).field_g = lj.field_t;
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if ((((nn) this).field_i ^ -1) < (param0 ^ -1)) {
          if (param1 < ((nn) this).field_i) {
            L0: {
              ((nn) this).field_j = 0;
              ((nn) this).field_g = 0;
              ((nn) this).field_o = 0;
              if (0 != jk.field_ab) {
                ((nn) this).field_b = q.field_d;
                ((nn) this).field_d = true;
                ((nn) this).field_j = jk.field_ab;
                ((nn) this).field_o = jk.field_ab;
                ((nn) this).field_e = param1;
                ((nn) this).field_p = jk.field_ab;
                break L0;
              } else {
                break L0;
              }
            }
            if (-1 != (((nn) this).field_p ^ -1)) {
              if (-1 != (ld.field_B ^ -1)) {
                if (((nn) this).field_b > 0) {
                  ((nn) this).field_b = ((nn) this).field_b - 1;
                  if (0 == jk.field_ab) {
                    L1: {
                      if (-1 == (ld.field_B ^ -1)) {
                        ((nn) this).field_p = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (param2 != (((nn) this).field_p ^ -1)) {
                        break L2;
                      } else {
                        L3: {
                          if (((nn) this).field_d) {
                            break L3;
                          } else {
                            if (!k.field_i) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        if (0 <= param0) {
                          if (param0 == ((nn) this).field_e) {
                            ((nn) this).field_e = param0;
                            ((nn) this).field_d = true;
                            return;
                          } else {
                            ((nn) this).field_e = param0;
                            ((nn) this).field_d = true;
                            return;
                          }
                        } else {
                          if (((nn) this).field_d) {
                            ((nn) this).field_e = -1;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    L4: {
                      if (param2 != (((nn) this).field_p ^ -1)) {
                        break L4;
                      } else {
                        L5: {
                          if (((nn) this).field_d) {
                            break L5;
                          } else {
                            if (!k.field_i) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (0 <= param0) {
                          if (param0 == ((nn) this).field_e) {
                            ((nn) this).field_e = param0;
                            ((nn) this).field_d = true;
                            return;
                          } else {
                            ((nn) this).field_e = param0;
                            ((nn) this).field_d = true;
                            return;
                          }
                        } else {
                          if (((nn) this).field_d) {
                            ((nn) this).field_e = -1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  ((nn) this).field_j = ((nn) this).field_p;
                  ((nn) this).field_b = bi.field_q;
                  L6: {
                    ((nn) this).field_b = ((nn) this).field_b - 1;
                    if (0 != jk.field_ab) {
                      break L6;
                    } else {
                      if (-1 == (ld.field_B ^ -1)) {
                        ((nn) this).field_p = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (param2 == (((nn) this).field_p ^ -1)) {
                    L7: {
                      if (((nn) this).field_d) {
                        break L7;
                      } else {
                        if (k.field_i) {
                          break L7;
                        } else {
                          return;
                        }
                      }
                    }
                    if (0 <= param0) {
                      if (param0 == ((nn) this).field_e) {
                        ((nn) this).field_e = param0;
                        ((nn) this).field_d = true;
                        return;
                      } else {
                        ((nn) this).field_e = param0;
                        ((nn) this).field_d = true;
                        return;
                      }
                    } else {
                      if (((nn) this).field_d) {
                        ((nn) this).field_e = -1;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L8: {
                  if (0 != jk.field_ab) {
                    break L8;
                  } else {
                    if (-1 == (ld.field_B ^ -1)) {
                      ((nn) this).field_p = 0;
                      break L8;
                    } else {
                      L9: {
                        if (param2 != (((nn) this).field_p ^ -1)) {
                          break L9;
                        } else {
                          if (((nn) this).field_d) {
                            if (0 <= param0) {
                              if (param0 == ((nn) this).field_e) {
                                ((nn) this).field_e = param0;
                                ((nn) this).field_d = true;
                                return;
                              } else {
                                ((nn) this).field_e = param0;
                                ((nn) this).field_d = true;
                                return;
                              }
                            } else {
                              if (((nn) this).field_d) {
                                ((nn) this).field_e = -1;
                                return;
                              } else {
                                return;
                              }
                            }
                          } else {
                            if (!k.field_i) {
                              break L9;
                            } else {
                              if (0 <= param0) {
                                if (param0 == ((nn) this).field_e) {
                                  ((nn) this).field_e = param0;
                                  ((nn) this).field_d = true;
                                  return;
                                } else {
                                  ((nn) this).field_e = param0;
                                  ((nn) this).field_d = true;
                                  return;
                                }
                              } else {
                                if (((nn) this).field_d) {
                                  ((nn) this).field_e = -1;
                                  return;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                L10: {
                  if (param2 != (((nn) this).field_p ^ -1)) {
                    break L10;
                  } else {
                    if (((nn) this).field_d) {
                      if (0 <= param0) {
                        if (param0 == ((nn) this).field_e) {
                          ((nn) this).field_e = param0;
                          ((nn) this).field_d = true;
                          return;
                        } else {
                          ((nn) this).field_e = param0;
                          ((nn) this).field_d = true;
                          return;
                        }
                      } else {
                        if (((nn) this).field_d) {
                          ((nn) this).field_e = -1;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (!k.field_i) {
                        break L10;
                      } else {
                        if (0 <= param0) {
                          if (param0 == ((nn) this).field_e) {
                            ((nn) this).field_e = param0;
                            ((nn) this).field_d = true;
                            return;
                          } else {
                            ((nn) this).field_e = param0;
                            ((nn) this).field_d = true;
                            return;
                          }
                        } else {
                          if (((nn) this).field_d) {
                            ((nn) this).field_e = -1;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L11: {
                if (0 != jk.field_ab) {
                  break L11;
                } else {
                  if (-1 == (ld.field_B ^ -1)) {
                    ((nn) this).field_p = 0;
                    break L11;
                  } else {
                    L12: {
                      if (param2 != (((nn) this).field_p ^ -1)) {
                        break L12;
                      } else {
                        L13: {
                          if (((nn) this).field_d) {
                            break L13;
                          } else {
                            if (!k.field_i) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        if (0 <= param0) {
                          if (param0 == ((nn) this).field_e) {
                            ((nn) this).field_e = param0;
                            ((nn) this).field_d = true;
                            return;
                          } else {
                            ((nn) this).field_e = param0;
                            ((nn) this).field_d = true;
                            return;
                          }
                        } else {
                          if (((nn) this).field_d) {
                            ((nn) this).field_e = -1;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    return;
                  }
                }
              }
              L14: {
                if (param2 != (((nn) this).field_p ^ -1)) {
                  break L14;
                } else {
                  if (((nn) this).field_d) {
                    if (0 <= param0) {
                      if (param0 == ((nn) this).field_e) {
                        ((nn) this).field_e = param0;
                        ((nn) this).field_d = true;
                        return;
                      } else {
                        ((nn) this).field_e = param0;
                        ((nn) this).field_d = true;
                        return;
                      }
                    } else {
                      if (((nn) this).field_d) {
                        ((nn) this).field_e = -1;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (!k.field_i) {
                      break L14;
                    } else {
                      if (0 <= param0) {
                        if (param0 == ((nn) this).field_e) {
                          ((nn) this).field_e = param0;
                          ((nn) this).field_d = true;
                          return;
                        } else {
                          ((nn) this).field_e = param0;
                          ((nn) this).field_d = true;
                          return;
                        }
                      } else {
                        L15: {
                          if (((nn) this).field_d) {
                            ((nn) this).field_e = -1;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ag();
        field_l = ',';
        field_k = 5;
        field_c = new ea(540, 140);
        field_r = new r();
        field_m = new ae();
        field_h = new ea[2];
        field_a = "<%0> <times> 1,000 = <%1>";
    }
}
