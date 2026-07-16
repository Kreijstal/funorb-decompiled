/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class ei extends ma {
    int field_D;
    int field_v;
    static vh field_A;
    int field_l;
    int field_y;
    fp field_z;
    boolean field_s;
    static int field_u;
    int field_r;
    static int field_o;
    String field_m;
    String field_p;
    op field_x;
    static java.math.BigInteger field_q;
    int field_n;
    int field_C;
    static int field_B;
    cc field_t;
    static String field_E;
    static String field_w;

    ei(String param0, cc param1) {
        this(param0, db.field_Sb.field_c, param1);
    }

    void a(ei param0, int param1, int param2, int param3) {
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        if (param1 == 958) {
          var5 = ((ei) this).a(param2, param3, wn.field_i, param1 + -959, gg.field_f) ? 1 : 0;
          if (var5 != (((ei) this).field_s ? 1 : 0)) {
            L0: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var5 == 0) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L0;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L0;
              }
            }
            ((ei) this).field_s = stackIn_7_1 != 0;
            if (null != ((ei) this).field_t) {
              if (!(((ei) this).field_t instanceof qj)) {
                return;
              } else {
                ((qj) (Object) ((ei) this).field_t).a(var5 != 0, (ei) this, -101);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        field_q = null;
        field_A = null;
        if (param0 != 80) {
            return;
        }
        field_E = null;
        field_w = null;
    }

    boolean a(ei param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        if (param4 > -126) {
            Object var9 = null;
            ((ei) this).a((ei) null, 51, 64, -111);
            return false;
        }
        return false;
    }

    boolean a(ei param0, byte param1) {
        int var3 = 44 / ((param1 - -43) / 47);
        return false;
    }

    final static boolean a(byte param0, String param1) {
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (null == field_E) {
          return false;
        } else {
          if (param0 != -71) {
            L0: {
              field_A = null;
              if (param1.toLowerCase().indexOf(field_E.toLowerCase()) < 0) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L0;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            L1: {
              if (param1.toLowerCase().indexOf(field_E.toLowerCase()) < 0) {
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
        }
    }

    int c(int param0) {
        if (param0 < 33) {
            String discarded$0 = ((ei) this).e(-86);
            return 0;
        }
        return 0;
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        if (!((ei) this).b(param1, param2, param0, -1)) {
          if (param3 <= 13) {
            return null;
          } else {
            return param0;
          }
        } else {
          ((ei) this).a(1, param2, param0, param1);
          if (param3 <= 13) {
            return null;
          } else {
            return param0;
          }
        }
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        if (param2) {
            field_o = 14;
            return false;
        }
        return false;
    }

    final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        if (param0 == -81) {
          if (((ei) this).d(param0 + -11)) {
            if (!((ei) this).a(param2, param1, false, (ei) this)) {
              var4 = param1;
              if ((var4 ^ -1) == -81) {
                return ((ei) this).a((ei) this, (byte) -103);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param1;
            if ((var4 ^ -1) == -81) {
              return ((ei) this).a((ei) this, (byte) -103);
            } else {
              return false;
            }
          }
        } else {
          ((ei) this).field_s = true;
          if (((ei) this).d(param0 + -11)) {
            if (!((ei) this).a(param2, param1, false, (ei) this)) {
              var4 = param1;
              if ((var4 ^ -1) == -81) {
                return ((ei) this).a((ei) this, (byte) -103);
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            var4 = param1;
            if ((var4 ^ -1) == -81) {
              return ((ei) this).a((ei) this, (byte) -103);
            } else {
              return false;
            }
          }
        }
    }

    void a(int param0, int param1, int param2, boolean param3, int param4) {
        ((ei) this).field_D = param4;
        if (param3) {
          boolean discarded$2 = ((ei) this).d(43);
          ((ei) this).field_l = param0;
          ((ei) this).field_C = param1;
          ((ei) this).field_y = param2;
          return;
        } else {
          ((ei) this).field_l = param0;
          ((ei) this).field_C = param1;
          ((ei) this).field_y = param2;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        Object var7 = null;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param3 == -1) {
          if (param0 - -((ei) this).field_C <= param2) {
            if (param4 < ((ei) this).field_D + param1) {
              return false;
            } else {
              L0: {
                L1: {
                  if (((ei) this).field_C + param0 + ((ei) this).field_l <= param2) {
                    break L1;
                  } else {
                    if (param4 >= ((ei) this).field_y + ((ei) this).field_D + param1) {
                      break L1;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          var7 = null;
          boolean discarded$1 = ((ei) this).a((ei) null, 25, false, 45, 66, -10, 22);
          if (param0 - -((ei) this).field_C <= param2) {
            if (param4 >= ((ei) this).field_D + param1) {
              if (((ei) this).field_C + param0 + ((ei) this).field_l > param2) {
                if (param4 >= ((ei) this).field_y + ((ei) this).field_D + param1) {
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
        }
    }

    final static dd[] a(byte param0, int param1) {
        dd[] var2 = null;
        Object var3 = null;
        dd[] var4 = null;
        var4 = new dd[9];
        var2 = var4;
        if (param0 <= 4) {
          var3 = null;
          boolean discarded$2 = ei.a((byte) 3, (String) null);
          var4[4] = ad.a(param1, 64, 7);
          return var2;
        } else {
          var4[4] = ad.a(param1, 64, 7);
          return var2;
        }
    }

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$55 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((ei) this).field_C).append(",").append(((ei) this).field_D).append(" ").append(((ei) this).field_l).append("x").append(((ei) this).field_y);
        if (null != ((ei) this).field_m) {
          StringBuilder discarded$56 = param2.append(" text=\"").append(((ei) this).field_m).append(34);
          if (((ei) this).field_s) {
            StringBuilder discarded$57 = param2.append(" mouseover");
            if (!((ei) this).d(123)) {
              if (param0 == 1) {
                if (((ei) this).field_z != null) {
                  StringBuilder discarded$58 = param2.append(" renderer=");
                  if (!(((ei) this).field_z instanceof ei)) {
                    StringBuilder discarded$59 = param2.append(((ei) this).field_z);
                    if (((ei) this).field_t != null) {
                      StringBuilder discarded$60 = param2.append(" listener=");
                      if (((ei) this).field_t instanceof ei) {
                        param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                        return;
                      } else {
                        StringBuilder discarded$61 = param2.append(((ei) this).field_t);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    L0: {
                      param2 = ((ei) this).a(param2, param3 + 1, param1, 25);
                      if (((ei) this).field_t != null) {
                        StringBuilder discarded$62 = param2.append(" listener=");
                        if (!(((ei) this).field_t instanceof ei)) {
                          StringBuilder discarded$63 = param2.append(((ei) this).field_t);
                          break L0;
                        } else {
                          param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                          break L0;
                        }
                      } else {
                        break L0;
                      }
                    }
                    return;
                  }
                } else {
                  L1: {
                    if (((ei) this).field_t != null) {
                      StringBuilder discarded$64 = param2.append(" listener=");
                      if (!(((ei) this).field_t instanceof ei)) {
                        StringBuilder discarded$65 = param2.append(((ei) this).field_t);
                        break L1;
                      } else {
                        param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  return;
                }
              } else {
                L2: {
                  ((ei) this).field_y = -51;
                  if (((ei) this).field_z != null) {
                    StringBuilder discarded$66 = param2.append(" renderer=");
                    if (!(((ei) this).field_z instanceof ei)) {
                      StringBuilder discarded$67 = param2.append(((ei) this).field_z);
                      break L2;
                    } else {
                      param2 = ((ei) this).a(param2, param3 + 1, param1, 25);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (((ei) this).field_t != null) {
                    StringBuilder discarded$68 = param2.append(" listener=");
                    if (!(((ei) this).field_t instanceof ei)) {
                      StringBuilder discarded$69 = param2.append(((ei) this).field_t);
                      break L3;
                    } else {
                      param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                return;
              }
            } else {
              L4: {
                StringBuilder discarded$70 = param2.append(" focused");
                if (param0 == 1) {
                  break L4;
                } else {
                  ((ei) this).field_y = -51;
                  break L4;
                }
              }
              L5: {
                if (((ei) this).field_z != null) {
                  StringBuilder discarded$71 = param2.append(" renderer=");
                  if (!(((ei) this).field_z instanceof ei)) {
                    StringBuilder discarded$72 = param2.append(((ei) this).field_z);
                    break L5;
                  } else {
                    param2 = ((ei) this).a(param2, param3 + 1, param1, 25);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (((ei) this).field_t != null) {
                  StringBuilder discarded$73 = param2.append(" listener=");
                  if (!(((ei) this).field_t instanceof ei)) {
                    StringBuilder discarded$74 = param2.append(((ei) this).field_t);
                    break L6;
                  } else {
                    param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              return;
            }
          } else {
            if (!((ei) this).d(123)) {
              if (param0 == 1) {
                if (((ei) this).field_z != null) {
                  StringBuilder discarded$75 = param2.append(" renderer=");
                  if (!(((ei) this).field_z instanceof ei)) {
                    StringBuilder discarded$76 = param2.append(((ei) this).field_z);
                    if (((ei) this).field_t != null) {
                      StringBuilder discarded$77 = param2.append(" listener=");
                      if (((ei) this).field_t instanceof ei) {
                        param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                        return;
                      } else {
                        StringBuilder discarded$78 = param2.append(((ei) this).field_t);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    L7: {
                      param2 = ((ei) this).a(param2, param3 + 1, param1, 25);
                      if (((ei) this).field_t != null) {
                        StringBuilder discarded$79 = param2.append(" listener=");
                        if (!(((ei) this).field_t instanceof ei)) {
                          StringBuilder discarded$80 = param2.append(((ei) this).field_t);
                          break L7;
                        } else {
                          param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    if (((ei) this).field_t != null) {
                      StringBuilder discarded$81 = param2.append(" listener=");
                      if (!(((ei) this).field_t instanceof ei)) {
                        StringBuilder discarded$82 = param2.append(((ei) this).field_t);
                        break L8;
                      } else {
                        param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L9: {
                  ((ei) this).field_y = -51;
                  if (((ei) this).field_z != null) {
                    StringBuilder discarded$83 = param2.append(" renderer=");
                    if (!(((ei) this).field_z instanceof ei)) {
                      StringBuilder discarded$84 = param2.append(((ei) this).field_z);
                      break L9;
                    } else {
                      param2 = ((ei) this).a(param2, param3 + 1, param1, 25);
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (((ei) this).field_t != null) {
                    StringBuilder discarded$85 = param2.append(" listener=");
                    if (!(((ei) this).field_t instanceof ei)) {
                      StringBuilder discarded$86 = param2.append(((ei) this).field_t);
                      break L10;
                    } else {
                      param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                return;
              }
            } else {
              L11: {
                StringBuilder discarded$87 = param2.append(" focused");
                if (param0 == 1) {
                  break L11;
                } else {
                  ((ei) this).field_y = -51;
                  break L11;
                }
              }
              L12: {
                if (((ei) this).field_z != null) {
                  StringBuilder discarded$88 = param2.append(" renderer=");
                  if (!(((ei) this).field_z instanceof ei)) {
                    StringBuilder discarded$89 = param2.append(((ei) this).field_z);
                    break L12;
                  } else {
                    param2 = ((ei) this).a(param2, param3 + 1, param1, 25);
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                if (((ei) this).field_t != null) {
                  StringBuilder discarded$90 = param2.append(" listener=");
                  if (!(((ei) this).field_t instanceof ei)) {
                    StringBuilder discarded$91 = param2.append(((ei) this).field_t);
                    break L13;
                  } else {
                    param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                    break L13;
                  }
                } else {
                  break L13;
                }
              }
              return;
            }
          }
        } else {
          L14: {
            if (!((ei) this).field_s) {
              break L14;
            } else {
              StringBuilder discarded$92 = param2.append(" mouseover");
              break L14;
            }
          }
          if (!((ei) this).d(123)) {
            if (param0 == 1) {
              if (((ei) this).field_z != null) {
                StringBuilder discarded$93 = param2.append(" renderer=");
                if (!(((ei) this).field_z instanceof ei)) {
                  StringBuilder discarded$94 = param2.append(((ei) this).field_z);
                  if (((ei) this).field_t != null) {
                    StringBuilder discarded$95 = param2.append(" listener=");
                    if (((ei) this).field_t instanceof ei) {
                      param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                      return;
                    } else {
                      StringBuilder discarded$96 = param2.append(((ei) this).field_t);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L15: {
                    param2 = ((ei) this).a(param2, param3 + 1, param1, 25);
                    if (((ei) this).field_t != null) {
                      StringBuilder discarded$97 = param2.append(" listener=");
                      if (!(((ei) this).field_t instanceof ei)) {
                        StringBuilder discarded$98 = param2.append(((ei) this).field_t);
                        break L15;
                      } else {
                        param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  return;
                }
              } else {
                L16: {
                  if (((ei) this).field_t != null) {
                    StringBuilder discarded$99 = param2.append(" listener=");
                    if (!(((ei) this).field_t instanceof ei)) {
                      StringBuilder discarded$100 = param2.append(((ei) this).field_t);
                      break L16;
                    } else {
                      param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                      break L16;
                    }
                  } else {
                    break L16;
                  }
                }
                return;
              }
            } else {
              L17: {
                ((ei) this).field_y = -51;
                if (((ei) this).field_z != null) {
                  StringBuilder discarded$101 = param2.append(" renderer=");
                  if (!(((ei) this).field_z instanceof ei)) {
                    StringBuilder discarded$102 = param2.append(((ei) this).field_z);
                    break L17;
                  } else {
                    param2 = ((ei) this).a(param2, param3 + 1, param1, 25);
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              L18: {
                if (((ei) this).field_t != null) {
                  StringBuilder discarded$103 = param2.append(" listener=");
                  if (!(((ei) this).field_t instanceof ei)) {
                    StringBuilder discarded$104 = param2.append(((ei) this).field_t);
                    break L18;
                  } else {
                    param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
              return;
            }
          } else {
            L19: {
              StringBuilder discarded$105 = param2.append(" focused");
              if (param0 == 1) {
                break L19;
              } else {
                ((ei) this).field_y = -51;
                break L19;
              }
            }
            L20: {
              if (((ei) this).field_z != null) {
                StringBuilder discarded$106 = param2.append(" renderer=");
                if (!(((ei) this).field_z instanceof ei)) {
                  StringBuilder discarded$107 = param2.append(((ei) this).field_z);
                  break L20;
                } else {
                  param2 = ((ei) this).a(param2, param3 + 1, param1, 25);
                  break L20;
                }
              } else {
                break L20;
              }
            }
            L21: {
              if (((ei) this).field_t != null) {
                StringBuilder discarded$108 = param2.append(" listener=");
                if (!(((ei) this).field_t instanceof ei)) {
                  StringBuilder discarded$109 = param2.append(((ei) this).field_t);
                  break L21;
                } else {
                  param2 = ((ei) this).a(param2, param3 - -1, param1, 75);
                  break L21;
                }
              } else {
                break L21;
              }
            }
            return;
          }
        }
    }

    boolean d(int param0) {
        int var2 = 101 % ((7 - param0) / 48);
        return false;
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        wj var6 = null;
        ((ei) this).a((ei) this, 958, param1, param3);
        if (param0 > -118) {
          L0: {
            ei.c((byte) 17);
            var5 = ((ei) this).d(85) ? 1 : 0;
            if (!param2) {
              if (var5 == 0) {
                break L0;
              } else {
                if (0 == ne.field_s) {
                  break L0;
                } else {
                  ((ei) this).d((byte) 99);
                  sa.field_t = cd.field_b;
                  ue.a((byte) 70, ((ei) this).e(-94));
                  return param2;
                }
              }
            } else {
              if ((wp.field_d ^ -1) != -1) {
                if (var5 == 0) {
                  L1: {
                    if (-1 == (ne.field_s ^ -1)) {
                      break L1;
                    } else {
                      if (((ei) this).a((ei) this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                        param2 = false;
                        break L1;
                      } else {
                        if (var5 != 0) {
                          L2: {
                            ((ei) this).d((byte) 99);
                            if ((cd.field_b ^ -1) != -1) {
                              break L2;
                            } else {
                              if ((sa.field_t ^ -1) == -1) {
                                break L2;
                              } else {
                                ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                                var6 = uh.field_u;
                                if (var6 != null) {
                                  if (!(var6.field_t instanceof jm)) {
                                    uh.field_u = null;
                                    sa.field_t = cd.field_b;
                                    ue.a((byte) 70, ((ei) this).e(-94));
                                    return param2;
                                  } else {
                                    ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                                    uh.field_u = null;
                                    sa.field_t = cd.field_b;
                                    ue.a((byte) 70, ((ei) this).e(-94));
                                    return param2;
                                  }
                                } else {
                                  sa.field_t = cd.field_b;
                                  ue.a((byte) 70, ((ei) this).e(-94));
                                  return param2;
                                }
                              }
                            }
                          }
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, ((ei) this).e(-94));
                          return param2;
                        } else {
                          if ((cd.field_b ^ -1) == -1) {
                            if ((sa.field_t ^ -1) != -1) {
                              ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                              var6 = uh.field_u;
                              if (var6 != null) {
                                if (!(var6.field_t instanceof jm)) {
                                  uh.field_u = null;
                                  sa.field_t = cd.field_b;
                                  ue.a((byte) 70, ((ei) this).e(-94));
                                  return param2;
                                } else {
                                  ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                                  uh.field_u = null;
                                  sa.field_t = cd.field_b;
                                  ue.a((byte) 70, ((ei) this).e(-94));
                                  return param2;
                                }
                              } else {
                                sa.field_t = cd.field_b;
                                ue.a((byte) 70, ((ei) this).e(-94));
                                return param2;
                              }
                            } else {
                              sa.field_t = cd.field_b;
                              ue.a((byte) 70, ((ei) this).e(-94));
                              return param2;
                            }
                          } else {
                            sa.field_t = cd.field_b;
                            ue.a((byte) 70, ((ei) this).e(-94));
                            return param2;
                          }
                        }
                      }
                    }
                  }
                  if ((cd.field_b ^ -1) != -1) {
                    break L0;
                  } else {
                    if ((sa.field_t ^ -1) == -1) {
                      break L0;
                    } else {
                      ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                      var6 = uh.field_u;
                      if (var6 != null) {
                        if (!(var6.field_t instanceof jm)) {
                          uh.field_u = null;
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, ((ei) this).e(-94));
                          return param2;
                        } else {
                          ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                          uh.field_u = null;
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, ((ei) this).e(-94));
                          return param2;
                        }
                      } else {
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, ((ei) this).e(-94));
                        return param2;
                      }
                    }
                  }
                } else {
                  L3: {
                    boolean discarded$2 = ((ei) this).a((ei) this, wn.field_i, wp.field_d, param3, (byte) -127, gg.field_f, param1);
                    if (-1 == (ne.field_s ^ -1)) {
                      break L3;
                    } else {
                      if (((ei) this).a((ei) this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                        param2 = false;
                        break L3;
                      } else {
                        if (var5 != 0) {
                          ((ei) this).d((byte) 99);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if ((cd.field_b ^ -1) != -1) {
                      break L4;
                    } else {
                      if ((sa.field_t ^ -1) == -1) {
                        break L4;
                      } else {
                        ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                        var6 = uh.field_u;
                        if (var6 != null) {
                          if (!(var6.field_t instanceof jm)) {
                            uh.field_u = null;
                            sa.field_t = cd.field_b;
                            ue.a((byte) 70, ((ei) this).e(-94));
                            return param2;
                          } else {
                            ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                            uh.field_u = null;
                            sa.field_t = cd.field_b;
                            ue.a((byte) 70, ((ei) this).e(-94));
                            return param2;
                          }
                        } else {
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, ((ei) this).e(-94));
                          return param2;
                        }
                      }
                    }
                  }
                  sa.field_t = cd.field_b;
                  ue.a((byte) 70, ((ei) this).e(-94));
                  return param2;
                }
              } else {
                L5: {
                  if (-1 == (ne.field_s ^ -1)) {
                    break L5;
                  } else {
                    if (((ei) this).a((ei) this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                      param2 = false;
                      break L5;
                    } else {
                      if (var5 != 0) {
                        L6: {
                          ((ei) this).d((byte) 99);
                          if ((cd.field_b ^ -1) != -1) {
                            break L6;
                          } else {
                            if ((sa.field_t ^ -1) == -1) {
                              break L6;
                            } else {
                              ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                              var6 = uh.field_u;
                              if (var6 != null) {
                                if (!(var6.field_t instanceof jm)) {
                                  uh.field_u = null;
                                  break L6;
                                } else {
                                  ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                                  uh.field_u = null;
                                  break L6;
                                }
                              } else {
                                sa.field_t = cd.field_b;
                                ue.a((byte) 70, ((ei) this).e(-94));
                                return param2;
                              }
                            }
                          }
                        }
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, ((ei) this).e(-94));
                        return param2;
                      } else {
                        L7: {
                          if ((cd.field_b ^ -1) != -1) {
                            break L7;
                          } else {
                            if ((sa.field_t ^ -1) == -1) {
                              break L7;
                            } else {
                              ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                              var6 = uh.field_u;
                              if (var6 != null) {
                                if (!(var6.field_t instanceof jm)) {
                                  uh.field_u = null;
                                  break L7;
                                } else {
                                  ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                                  uh.field_u = null;
                                  break L7;
                                }
                              } else {
                                sa.field_t = cd.field_b;
                                ue.a((byte) 70, ((ei) this).e(-94));
                                return param2;
                              }
                            }
                          }
                        }
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, ((ei) this).e(-94));
                        return param2;
                      }
                    }
                  }
                }
                L8: {
                  if ((cd.field_b ^ -1) != -1) {
                    break L8;
                  } else {
                    if ((sa.field_t ^ -1) == -1) {
                      break L8;
                    } else {
                      ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                      var6 = uh.field_u;
                      if (var6 != null) {
                        if (!(var6.field_t instanceof jm)) {
                          uh.field_u = null;
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, ((ei) this).e(-94));
                          return param2;
                        } else {
                          ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                          uh.field_u = null;
                          sa.field_t = cd.field_b;
                          ue.a((byte) 70, ((ei) this).e(-94));
                          return param2;
                        }
                      } else {
                        sa.field_t = cd.field_b;
                        ue.a((byte) 70, ((ei) this).e(-94));
                        return param2;
                      }
                    }
                  }
                }
                sa.field_t = cd.field_b;
                ue.a((byte) 70, ((ei) this).e(-94));
                return param2;
              }
            }
          }
          sa.field_t = cd.field_b;
          ue.a((byte) 70, ((ei) this).e(-94));
          return param2;
        } else {
          L9: {
            var5 = ((ei) this).d(85) ? 1 : 0;
            if (!param2) {
              if (var5 == 0) {
                break L9;
              } else {
                if (0 == ne.field_s) {
                  break L9;
                } else {
                  ((ei) this).d((byte) 99);
                  sa.field_t = cd.field_b;
                  ue.a((byte) 70, ((ei) this).e(-94));
                  return param2;
                }
              }
            } else {
              L10: {
                if ((wp.field_d ^ -1) == -1) {
                  break L10;
                } else {
                  if (var5 == 0) {
                    break L10;
                  } else {
                    L11: {
                      boolean discarded$3 = ((ei) this).a((ei) this, wn.field_i, wp.field_d, param3, (byte) -127, gg.field_f, param1);
                      if (-1 == (ne.field_s ^ -1)) {
                        break L11;
                      } else {
                        if (((ei) this).a((ei) this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                          param2 = false;
                          break L11;
                        } else {
                          if (var5 != 0) {
                            ((ei) this).d((byte) 99);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    L12: {
                      if ((cd.field_b ^ -1) != -1) {
                        break L12;
                      } else {
                        if ((sa.field_t ^ -1) == -1) {
                          break L12;
                        } else {
                          ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                          var6 = uh.field_u;
                          if (var6 != null) {
                            if (!(var6.field_t instanceof jm)) {
                              uh.field_u = null;
                              break L12;
                            } else {
                              ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                              uh.field_u = null;
                              break L12;
                            }
                          } else {
                            sa.field_t = cd.field_b;
                            ue.a((byte) 70, ((ei) this).e(-94));
                            return param2;
                          }
                        }
                      }
                    }
                    sa.field_t = cd.field_b;
                    ue.a((byte) 70, ((ei) this).e(-94));
                    return param2;
                  }
                }
              }
              L13: {
                if (-1 == (ne.field_s ^ -1)) {
                  break L13;
                } else {
                  if (((ei) this).a((ei) this, param1, true, ne.field_s, ua.field_o, param3, lq.field_W)) {
                    param2 = false;
                    break L13;
                  } else {
                    if (var5 != 0) {
                      L14: {
                        ((ei) this).d((byte) 99);
                        if ((cd.field_b ^ -1) != -1) {
                          break L14;
                        } else {
                          if ((sa.field_t ^ -1) == -1) {
                            break L14;
                          } else {
                            ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                            var6 = uh.field_u;
                            if (var6 != null) {
                              if (!(var6.field_t instanceof jm)) {
                                uh.field_u = null;
                                break L14;
                              } else {
                                ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                                uh.field_u = null;
                                break L14;
                              }
                            } else {
                              sa.field_t = cd.field_b;
                              ue.a((byte) 70, ((ei) this).e(-94));
                              return param2;
                            }
                          }
                        }
                      }
                      sa.field_t = cd.field_b;
                      ue.a((byte) 70, ((ei) this).e(-94));
                      return param2;
                    } else {
                      L15: {
                        if ((cd.field_b ^ -1) != -1) {
                          break L15;
                        } else {
                          if ((sa.field_t ^ -1) == -1) {
                            break L15;
                          } else {
                            ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                            var6 = uh.field_u;
                            if (var6 != null) {
                              if (!(var6.field_t instanceof jm)) {
                                uh.field_u = null;
                                break L15;
                              } else {
                                ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                                uh.field_u = null;
                                break L15;
                              }
                            } else {
                              sa.field_t = cd.field_b;
                              ue.a((byte) 70, ((ei) this).e(-94));
                              return param2;
                            }
                          }
                        }
                      }
                      sa.field_t = cd.field_b;
                      ue.a((byte) 70, ((ei) this).e(-94));
                      return param2;
                    }
                  }
                }
              }
              if ((cd.field_b ^ -1) != -1) {
                break L9;
              } else {
                if ((sa.field_t ^ -1) == -1) {
                  break L9;
                } else {
                  ((ei) this).a(param1, wn.field_i, param3, gg.field_f, (byte) 105, (ei) this);
                  var6 = uh.field_u;
                  if (var6 != null) {
                    if (!(var6.field_t instanceof jm)) {
                      uh.field_u = null;
                      sa.field_t = cd.field_b;
                      ue.a((byte) 70, ((ei) this).e(-94));
                      return param2;
                    } else {
                      ((jm) (Object) var6.field_t).a(-87, (k) null, var6);
                      uh.field_u = null;
                      sa.field_t = cd.field_b;
                      ue.a((byte) 70, ((ei) this).e(-94));
                      return param2;
                    }
                  } else {
                    sa.field_t = cd.field_b;
                    ue.a((byte) 70, ((ei) this).e(-94));
                    return param2;
                  }
                }
              }
            }
          }
          sa.field_t = cd.field_b;
          ue.a((byte) 70, ((ei) this).e(-94));
          return param2;
        }
    }

    boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (!((ei) this).a(param1, param5, param6, -1, param4)) {
          if (!param2) {
            return true;
          } else {
            return false;
          }
        } else {
          ((ei) this).field_n = param3;
          if (!param2) {
            return true;
          } else {
            return false;
          }
        }
    }

    String e(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 > -10) {
          L0: {
            int discarded$10 = ((ei) this).c(-28);
            if (((ei) this).field_s) {
              stackOut_7_0 = ((ei) this).field_p;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_8_0 = (String) (Object) stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (((ei) this).field_s) {
              stackOut_3_0 = ((ei) this).field_p;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (String) (Object) stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public final String toString() {
        return ((ei) this).a(new StringBuilder(), 0, new Hashtable(), 99).toString();
    }

    void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        if (param4 < 62) {
            boolean discarded$0 = ((ei) this).a(-128, 68, 'ﾮ');
            ((ei) this).field_n = 0;
            return;
        }
        ((ei) this).field_n = 0;
    }

    final boolean b(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (param3 == -1) {
          if (!param1.containsKey(this)) {
            Object discarded$17 = param1.put(this, this);
            return true;
          } else {
            StringBuilder discarded$18 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
        } else {
          boolean discarded$19 = ((ei) this).a(84, -105, '￈');
          if (!param1.containsKey(this)) {
            Object discarded$20 = param1.put(this, this);
            return true;
          } else {
            StringBuilder discarded$21 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        var4 = ((ei) this).c(66);
        var5_int = 0;
        L0: while (true) {
          if (var4 < var5_int) {
            if (param1 >= 73) {
              var5 = jd.a(9383);
              if (var5 != null) {
                db.field_Sb.a((byte) -52, ne.field_n, id.field_b, var5);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            ((ei) this).a(var5_int, (byte) -118, param0, param2);
            var5_int++;
            continue L0;
          }
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        if (param0 == 0) {
          if (null == ((ei) this).field_z) {
            var5 = -117 / ((-42 - param1) / 53);
            return;
          } else {
            ((ei) this).field_z.a(true, param2, (byte) 71, param3, (ei) this);
            var5 = -117 / ((-42 - param1) / 53);
            return;
          }
        } else {
          var5 = -117 / ((-42 - param1) / 53);
          return;
        }
    }

    final void e(byte param0) {
        if (param0 > -64) {
          field_o = -58;
          ((ei) this).a(((ei) this).field_l, ((ei) this).field_C, ((ei) this).field_y, false, ((ei) this).field_D);
          return;
        } else {
          ((ei) this).a(((ei) this).field_l, ((ei) this).field_C, ((ei) this).field_y, false, ((ei) this).field_D);
          return;
        }
    }

    void d(byte param0) {
        if (param0 != 99) {
            Object var3 = null;
            boolean discarded$0 = ((ei) this).a((ei) null, -125, false, 30, 62, -88, -86);
        }
    }

    protected ei() {
        ((ei) this).field_v = 0;
        ((ei) this).field_r = 0;
    }

    ei(String param0, fp param1, cc param2) {
        io var4 = null;
        ((ei) this).field_v = 0;
        ((ei) this).field_r = 0;
        ((ei) this).field_t = param2;
        ((ei) this).field_z = param1;
        ((ei) this).field_m = param0;
        if (((ei) this).field_z instanceof io) {
            var4 = (io) (Object) ((ei) this).field_z;
            ((ei) this).field_l = var4.a((ei) this, -1848150943);
            ((ei) this).field_y = var4.a(1, (ei) this);
        }
    }

    ei(int param0, int param1, int param2, int param3, fp param4, cc param5) {
        ((ei) this).field_v = 0;
        ((ei) this).field_r = 0;
        ((ei) this).field_y = param3;
        ((ei) this).field_D = param1;
        ((ei) this).field_t = param5;
        ((ei) this).field_C = param0;
        ((ei) this).field_z = param4;
        ((ei) this).field_l = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 500;
        field_u = 0;
        field_q = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_w = "You are on <%0>";
    }
}
