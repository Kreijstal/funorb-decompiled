/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class lk extends ai {
    String field_q;
    ed field_l;
    int field_i;
    int field_u;
    static lj field_t;
    fc field_j;
    int field_v;
    int field_m;
    int field_r;
    sk field_n;
    static Boolean field_p;
    static String field_s;
    boolean field_g;
    int field_o;
    int field_k;
    String field_h;

    void b(int param0, int param1, int param2, int param3, int param4) {
        ((lk) this).field_k = param2;
        ((lk) this).field_r = param3;
        ((lk) this).field_i = param4;
        ((lk) this).field_m = param0;
        if (param1 != 80) {
            ((lk) this).field_r = -53;
        }
    }

    void a(int param0, int param1, int param2, lk param3) {
        int var5 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        var5 = ((lk) this).c(uc.field_C, 0, param2, param1, ll.field_y) ? 1 : 0;
        if (var5 != (((lk) this).field_g ? 1 : 0)) {
          L0: {
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var5 == 0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((lk) this).field_g = stackIn_8_1 != 0;
          if (null != ((lk) this).field_n) {
            if (((lk) this).field_n instanceof dj) {
              ((dj) (Object) ((lk) this).field_n).a(-124, var5 != 0, (lk) this);
              if (param0 != -1) {
                ((lk) this).field_g = false;
                return;
              } else {
                return;
              }
            } else {
              if (param0 != -1) {
                ((lk) this).field_g = false;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != -1) {
              ((lk) this).field_g = false;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -1) {
            ((lk) this).field_g = false;
            return;
          } else {
            return;
          }
        }
    }

    StringBuilder a(int param0, boolean param1, Hashtable param2, StringBuilder param3) {
        if (!((lk) this).a(param2, param3, (byte) 14, param0)) {
          if (!param1) {
            return null;
          } else {
            return param3;
          }
        } else {
          ((lk) this).a(param0, param3, param2, 32362);
          if (!param1) {
            return null;
          } else {
            return param3;
          }
        }
    }

    int f(int param0) {
        if (param0 != 0) {
            ((lk) this).field_k = -2;
            return 0;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        L0: {
          if (-1 != (param0 ^ -1)) {
            break L0;
          } else {
            if (((lk) this).field_j != null) {
              ((lk) this).field_j.a(param1, (lk) this, (byte) -127, true, param3);
              break L0;
            } else {
              if (param2 >= 33) {
                return;
              } else {
                ((lk) this).field_l = null;
                return;
              }
            }
          }
        }
        if (param2 < 33) {
          ((lk) this).field_l = null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        int var6 = 0;
        var6 = Bounce.field_N;
        StringBuilder discarded$39 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((lk) this).field_r).append(",").append(((lk) this).field_i).append(" ").append(((lk) this).field_k).append("x").append(((lk) this).field_m);
        if (((lk) this).field_h == null) {
          L0: {
            if (((lk) this).field_g) {
              StringBuilder discarded$40 = param1.append(" mouseover");
              break L0;
            } else {
              break L0;
            }
          }
          if (!((lk) this).e(param3 + -32361)) {
            if (param3 == 32362) {
              if (((lk) this).field_j != null) {
                L1: {
                  StringBuilder discarded$41 = param1.append(" renderer=");
                  if (!(((lk) this).field_j instanceof lk)) {
                    break L1;
                  } else {
                    param1 = ((lk) this).a(1 + param0, true, param2, param1);
                    if (var6 == 0) {
                      if (null != ((lk) this).field_n) {
                        StringBuilder discarded$42 = param1.append(" listener=");
                        if (((lk) this).field_n instanceof lk) {
                          param1 = ((lk) this).a(1 + param0, true, param2, param1);
                          if (var6 != 0) {
                            StringBuilder discarded$43 = param1.append(((lk) this).field_n);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          StringBuilder discarded$44 = param1.append(((lk) this).field_n);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  StringBuilder discarded$45 = param1.append(((lk) this).field_j);
                  if (null == ((lk) this).field_n) {
                    break L2;
                  } else {
                    L3: {
                      StringBuilder discarded$46 = param1.append(" listener=");
                      if (!(((lk) this).field_n instanceof lk)) {
                        break L3;
                      } else {
                        param1 = ((lk) this).a(1 + param0, true, param2, param1);
                        break L3;
                      }
                    }
                    StringBuilder discarded$47 = param1.append(((lk) this).field_n);
                    break L2;
                  }
                }
                return;
              } else {
                L4: {
                  if (null == ((lk) this).field_n) {
                    break L4;
                  } else {
                    L5: {
                      StringBuilder discarded$48 = param1.append(" listener=");
                      if (!(((lk) this).field_n instanceof lk)) {
                        break L5;
                      } else {
                        param1 = ((lk) this).a(1 + param0, true, param2, param1);
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    StringBuilder discarded$49 = param1.append(((lk) this).field_n);
                    break L4;
                  }
                }
                return;
              }
            } else {
              L6: {
                boolean discarded$50 = ((lk) this).c(-89, 94, 115, -98, -13);
                if (((lk) this).field_j != null) {
                  L7: {
                    StringBuilder discarded$51 = param1.append(" renderer=");
                    if (!(((lk) this).field_j instanceof lk)) {
                      break L7;
                    } else {
                      param1 = ((lk) this).a(1 + param0, true, param2, param1);
                      if (var6 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  StringBuilder discarded$52 = param1.append(((lk) this).field_j);
                  break L6;
                } else {
                  break L6;
                }
              }
              L8: {
                if (null == ((lk) this).field_n) {
                  break L8;
                } else {
                  L9: {
                    StringBuilder discarded$53 = param1.append(" listener=");
                    if (!(((lk) this).field_n instanceof lk)) {
                      break L9;
                    } else {
                      param1 = ((lk) this).a(1 + param0, true, param2, param1);
                      if (var6 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  StringBuilder discarded$54 = param1.append(((lk) this).field_n);
                  break L8;
                }
              }
              return;
            }
          } else {
            L10: {
              StringBuilder discarded$55 = param1.append(" focused");
              if (param3 == 32362) {
                break L10;
              } else {
                boolean discarded$56 = ((lk) this).c(-89, 94, 115, -98, -13);
                break L10;
              }
            }
            L11: {
              if (((lk) this).field_j != null) {
                L12: {
                  StringBuilder discarded$57 = param1.append(" renderer=");
                  if (!(((lk) this).field_j instanceof lk)) {
                    break L12;
                  } else {
                    param1 = ((lk) this).a(1 + param0, true, param2, param1);
                    if (var6 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                StringBuilder discarded$58 = param1.append(((lk) this).field_j);
                break L11;
              } else {
                break L11;
              }
            }
            L13: {
              if (null == ((lk) this).field_n) {
                break L13;
              } else {
                L14: {
                  StringBuilder discarded$59 = param1.append(" listener=");
                  if (!(((lk) this).field_n instanceof lk)) {
                    break L14;
                  } else {
                    param1 = ((lk) this).a(1 + param0, true, param2, param1);
                    if (var6 == 0) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                StringBuilder discarded$60 = param1.append(((lk) this).field_n);
                break L13;
              }
            }
            return;
          }
        } else {
          L15: {
            StringBuilder discarded$61 = param1.append(" text=\"").append(((lk) this).field_h).append(34);
            if (((lk) this).field_g) {
              StringBuilder discarded$62 = param1.append(" mouseover");
              break L15;
            } else {
              break L15;
            }
          }
          if (((lk) this).e(param3 + -32361)) {
            StringBuilder discarded$63 = param1.append(" focused");
            if (param3 == 32362) {
              L16: {
                if (((lk) this).field_j != null) {
                  L17: {
                    StringBuilder discarded$64 = param1.append(" renderer=");
                    if (!(((lk) this).field_j instanceof lk)) {
                      break L17;
                    } else {
                      param1 = ((lk) this).a(1 + param0, true, param2, param1);
                      if (var6 == 0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  StringBuilder discarded$65 = param1.append(((lk) this).field_j);
                  break L16;
                } else {
                  break L16;
                }
              }
              L18: {
                if (null == ((lk) this).field_n) {
                  break L18;
                } else {
                  L19: {
                    StringBuilder discarded$66 = param1.append(" listener=");
                    if (!(((lk) this).field_n instanceof lk)) {
                      break L19;
                    } else {
                      param1 = ((lk) this).a(1 + param0, true, param2, param1);
                      if (var6 == 0) {
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  StringBuilder discarded$67 = param1.append(((lk) this).field_n);
                  break L18;
                }
              }
              return;
            } else {
              L20: {
                boolean discarded$68 = ((lk) this).c(-89, 94, 115, -98, -13);
                if (((lk) this).field_j != null) {
                  L21: {
                    StringBuilder discarded$69 = param1.append(" renderer=");
                    if (!(((lk) this).field_j instanceof lk)) {
                      break L21;
                    } else {
                      param1 = ((lk) this).a(1 + param0, true, param2, param1);
                      if (var6 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  StringBuilder discarded$70 = param1.append(((lk) this).field_j);
                  break L20;
                } else {
                  break L20;
                }
              }
              L22: {
                if (null == ((lk) this).field_n) {
                  break L22;
                } else {
                  L23: {
                    StringBuilder discarded$71 = param1.append(" listener=");
                    if (!(((lk) this).field_n instanceof lk)) {
                      break L23;
                    } else {
                      param1 = ((lk) this).a(1 + param0, true, param2, param1);
                      if (var6 == 0) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  StringBuilder discarded$72 = param1.append(((lk) this).field_n);
                  break L22;
                }
              }
              return;
            }
          } else {
            L24: {
              if (param3 == 32362) {
                break L24;
              } else {
                boolean discarded$73 = ((lk) this).c(-89, 94, 115, -98, -13);
                break L24;
              }
            }
            L25: {
              if (((lk) this).field_j != null) {
                L26: {
                  StringBuilder discarded$74 = param1.append(" renderer=");
                  if (!(((lk) this).field_j instanceof lk)) {
                    break L26;
                  } else {
                    param1 = ((lk) this).a(1 + param0, true, param2, param1);
                    if (var6 == 0) {
                      break L25;
                    } else {
                      break L26;
                    }
                  }
                }
                StringBuilder discarded$75 = param1.append(((lk) this).field_j);
                break L25;
              } else {
                break L25;
              }
            }
            L27: {
              if (null == ((lk) this).field_n) {
                break L27;
              } else {
                L28: {
                  StringBuilder discarded$76 = param1.append(" listener=");
                  if (!(((lk) this).field_n instanceof lk)) {
                    break L28;
                  } else {
                    param1 = ((lk) this).a(1 + param0, true, param2, param1);
                    if (var6 == 0) {
                      break L27;
                    } else {
                      break L28;
                    }
                  }
                }
                StringBuilder discarded$77 = param1.append(((lk) this).field_n);
                break L27;
              }
            }
            return;
          }
        }
    }

    lk(String param0, sk param1) {
        this(param0, ma.field_m.field_c, param1);
    }

    void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        if (param4 != 34) {
            ((lk) this).field_q = null;
            ((lk) this).field_u = 0;
            return;
        }
        ((lk) this).field_u = 0;
    }

    String d(int param0) {
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        String stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param0 != 0) {
          L0: {
            boolean discarded$10 = ((lk) this).e(15);
            if (((lk) this).field_g) {
              stackOut_7_0 = ((lk) this).field_q;
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
            if (((lk) this).field_g) {
              stackOut_3_0 = ((lk) this).field_q;
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

    boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 == 28455) {
          if (((lk) this).c(param3, 0, param6, param2, param5)) {
            ((lk) this).field_u = param0;
            return false;
          } else {
            return false;
          }
        } else {
          boolean discarded$7 = ((lk) this).e(-128);
          if (!((lk) this).c(param3, 0, param6, param2, param5)) {
            return false;
          } else {
            ((lk) this).field_u = param0;
            return false;
          }
        }
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = 0;
        bj var6 = null;
        int var7 = 0;
        var7 = Bounce.field_N;
        ((lk) this).a(-1, param0, param3, (lk) this);
        var5 = ((lk) this).e(1) ? 1 : 0;
        if (param2) {
          L0: {
            if (0 == va.field_a) {
              break L0;
            } else {
              if (var5 != 0) {
                boolean discarded$2 = ((lk) this).a(param0, ll.field_y, va.field_a, uc.field_C, param3, (lk) this, true);
                break L0;
              } else {
                L1: {
                  if (vh.field_e == 0) {
                    break L1;
                  } else {
                    L2: {
                      if (((lk) this).a(vh.field_e, (lk) this, param0, og.field_a, 28455, rk.field_a, param3)) {
                        break L2;
                      } else {
                        if (var5 == 0) {
                          break L1;
                        } else {
                          ((lk) this).c((byte) 114);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                    param2 = false;
                    break L1;
                  }
                }
                if (0 == n.field_m) {
                  if (0 == d.field_B) {
                    d.field_B = n.field_m;
                    if (param1) {
                      gk.a(73, ((lk) this).d(0));
                      return param2;
                    } else {
                      return false;
                    }
                  } else {
                    ((lk) this).a(ll.field_y, param0, (lk) this, param3, 34, uc.field_C);
                    var6 = nd.field_A;
                    if (var6 != null) {
                      if (!(var6.field_n instanceof df)) {
                        nd.field_A = null;
                        d.field_B = n.field_m;
                        if (!param1) {
                          return false;
                        } else {
                          gk.a(73, ((lk) this).d(0));
                          return param2;
                        }
                      } else {
                        ((df) (Object) var6.field_n).a(var6, (byte) 109, (se) null);
                        nd.field_A = null;
                        d.field_B = n.field_m;
                        if (!param1) {
                          return false;
                        } else {
                          gk.a(73, ((lk) this).d(0));
                          return param2;
                        }
                      }
                    } else {
                      d.field_B = n.field_m;
                      if (!param1) {
                        return false;
                      } else {
                        gk.a(73, ((lk) this).d(0));
                        return param2;
                      }
                    }
                  }
                } else {
                  d.field_B = n.field_m;
                  if (!param1) {
                    return false;
                  } else {
                    gk.a(73, ((lk) this).d(0));
                    return param2;
                  }
                }
              }
            }
          }
          L3: {
            if (vh.field_e == 0) {
              break L3;
            } else {
              if (((lk) this).a(vh.field_e, (lk) this, param0, og.field_a, 28455, rk.field_a, param3)) {
                param2 = false;
                break L3;
              } else {
                if (var5 == 0) {
                  break L3;
                } else {
                  ((lk) this).c((byte) 114);
                  if (var7 == 0) {
                    break L3;
                  } else {
                    L4: {
                      param2 = false;
                      if (0 != n.field_m) {
                        break L4;
                      } else {
                        if (0 == d.field_B) {
                          break L4;
                        } else {
                          ((lk) this).a(ll.field_y, param0, (lk) this, param3, 34, uc.field_C);
                          var6 = nd.field_A;
                          if (var6 != null) {
                            if (!(var6.field_n instanceof df)) {
                              nd.field_A = null;
                              d.field_B = n.field_m;
                              if (param1) {
                                gk.a(73, ((lk) this).d(0));
                                return param2;
                              } else {
                                return false;
                              }
                            } else {
                              ((df) (Object) var6.field_n).a(var6, (byte) 109, (se) null);
                              nd.field_A = null;
                              d.field_B = n.field_m;
                              if (param1) {
                                gk.a(73, ((lk) this).d(0));
                                return param2;
                              } else {
                                return false;
                              }
                            }
                          } else {
                            d.field_B = n.field_m;
                            if (param1) {
                              gk.a(73, ((lk) this).d(0));
                              return param2;
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                    }
                    d.field_B = n.field_m;
                    if (param1) {
                      gk.a(73, ((lk) this).d(0));
                      return param2;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
          L5: {
            if (0 != n.field_m) {
              break L5;
            } else {
              if (0 == d.field_B) {
                break L5;
              } else {
                ((lk) this).a(ll.field_y, param0, (lk) this, param3, 34, uc.field_C);
                var6 = nd.field_A;
                if (var6 != null) {
                  if (!(var6.field_n instanceof df)) {
                    nd.field_A = null;
                    d.field_B = n.field_m;
                    if (param1) {
                      gk.a(73, ((lk) this).d(0));
                      return param2;
                    } else {
                      return false;
                    }
                  } else {
                    ((df) (Object) var6.field_n).a(var6, (byte) 109, (se) null);
                    nd.field_A = null;
                    d.field_B = n.field_m;
                    if (param1) {
                      gk.a(73, ((lk) this).d(0));
                      return param2;
                    } else {
                      return false;
                    }
                  }
                } else {
                  d.field_B = n.field_m;
                  if (param1) {
                    gk.a(73, ((lk) this).d(0));
                    return param2;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          d.field_B = n.field_m;
          if (param1) {
            gk.a(73, ((lk) this).d(0));
            return param2;
          } else {
            return false;
          }
        } else {
          if (var5 != 0) {
            if (-1 != (vh.field_e ^ -1)) {
              ((lk) this).c((byte) 114);
              if (var7 != 0) {
                L6: {
                  if (0 == va.field_a) {
                    break L6;
                  } else {
                    if (var5 != 0) {
                      boolean discarded$3 = ((lk) this).a(param0, ll.field_y, va.field_a, uc.field_C, param3, (lk) this, true);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (vh.field_e == 0) {
                    break L7;
                  } else {
                    L8: {
                      if (((lk) this).a(vh.field_e, (lk) this, param0, og.field_a, 28455, rk.field_a, param3)) {
                        break L8;
                      } else {
                        if (var5 == 0) {
                          break L7;
                        } else {
                          ((lk) this).c((byte) 114);
                          if (var7 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    param2 = false;
                    break L7;
                  }
                }
                L9: {
                  if (0 != n.field_m) {
                    break L9;
                  } else {
                    if (0 == d.field_B) {
                      break L9;
                    } else {
                      ((lk) this).a(ll.field_y, param0, (lk) this, param3, 34, uc.field_C);
                      var6 = nd.field_A;
                      if (var6 != null) {
                        if (!(var6.field_n instanceof df)) {
                          nd.field_A = null;
                          break L9;
                        } else {
                          ((df) (Object) var6.field_n).a(var6, (byte) 109, (se) null);
                          nd.field_A = null;
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                d.field_B = n.field_m;
                if (!param1) {
                  return false;
                } else {
                  gk.a(73, ((lk) this).d(0));
                  return param2;
                }
              } else {
                d.field_B = n.field_m;
                if (!param1) {
                  return false;
                } else {
                  gk.a(73, ((lk) this).d(0));
                  return param2;
                }
              }
            } else {
              d.field_B = n.field_m;
              if (!param1) {
                return false;
              } else {
                gk.a(73, ((lk) this).d(0));
                return param2;
              }
            }
          } else {
            d.field_B = n.field_m;
            if (!param1) {
              return false;
            } else {
              gk.a(73, ((lk) this).d(0));
              return param2;
            }
          }
        }
    }

    final boolean a(byte param0, int param1, char param2) {
        int var4 = 0;
        if (((lk) this).e(1)) {
          if (!((lk) this).a((lk) this, param2, param1, -14565)) {
            if (param0 <= -72) {
              var4 = param1;
              if (80 == var4) {
                return ((lk) this).a((lk) this, false);
              } else {
                return false;
              }
            } else {
              boolean discarded$4 = ((lk) this).a((byte) -98, -66, '￺');
              var4 = param1;
              if (80 == var4) {
                return ((lk) this).a((lk) this, false);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          if (param0 <= -72) {
            var4 = param1;
            if (80 == var4) {
              return ((lk) this).a((lk) this, false);
            } else {
              return false;
            }
          } else {
            boolean discarded$5 = ((lk) this).a((byte) -98, -66, '￺');
            var4 = param1;
            if (80 == var4) {
              return ((lk) this).a((lk) this, false);
            } else {
              return false;
            }
          }
        }
    }

    final void g(int param0) {
        ((lk) this).b(((lk) this).field_m, param0 + -11133, ((lk) this).field_k, ((lk) this).field_r, ((lk) this).field_i);
        if (param0 != 11213) {
            StringBuilder discarded$0 = ((lk) this).a(69, false, (Hashtable) null, (StringBuilder) null);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = Bounce.field_N;
        var4 = ((lk) this).f(0);
        var5_int = 0;
        L0: while (true) {
          if (var4 < var5_int) {
            if (param2 > -28) {
              L1: {
                ((lk) this).a(88, (StringBuilder) null, (Hashtable) null, -53);
                var5 = ag.b(-1);
                if (var5 != null) {
                  ma.field_m.a(ha.field_b, var5, mh.field_Z, true);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                var5 = ag.b(-1);
                if (var5 != null) {
                  ma.field_m.a(ha.field_b, var5, mh.field_Z, true);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            ((lk) this).a(var5_int, param0, 85, param1);
            var5_int++;
            if (var6 == 0) {
              continue L0;
            } else {
              L3: {
                var5 = ag.b(-1);
                if (var5 != null) {
                  ma.field_m.a(ha.field_b, var5, mh.field_Z, true);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          }
        }
    }

    boolean e(int param0) {
        if (param0 != 1) {
            ((lk) this).c((byte) -37);
            return false;
        }
        return false;
    }

    final boolean a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        if (param2 == 14) {
          if (param0.containsKey(this)) {
            StringBuilder discarded$19 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          } else {
            Object discarded$20 = param0.put(this, this);
            return true;
          }
        } else {
          StringBuilder discarded$21 = ((lk) this).a(-119, false, (Hashtable) null, (StringBuilder) null);
          if (param0.containsKey(this)) {
            StringBuilder discarded$22 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          } else {
            Object discarded$23 = param0.put(this, this);
            return true;
          }
        }
    }

    public static void b(byte param0) {
        field_s = null;
        int var1 = 30 / ((param0 - -5) / 58);
        field_t = null;
        field_p = null;
    }

    boolean a(lk param0, boolean param1) {
        if (param1) {
            ((lk) this).a(8, 111, 24);
            return false;
        }
        return false;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, lk param5, boolean param6) {
        if (!param6) {
            lk.b((byte) -10);
            return false;
        }
        return false;
    }

    public final String toString() {
        return ((lk) this).a(0, true, new Hashtable(), new StringBuilder()).toString();
    }

    final boolean c(int param0, int param1, int param2, int param3, int param4) {
        if (param1 == 0) {
          if (param0 >= ((lk) this).field_r + param3) {
            if (param2 - -((lk) this).field_i <= param4) {
              if (param0 < param3 + ((lk) this).field_r + ((lk) this).field_k) {
                if (param4 >= ((lk) this).field_m + param2 - -((lk) this).field_i) {
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
          return false;
        }
    }

    boolean a(lk param0, char param1, int param2, int param3) {
        if (param3 != -14565) {
            ((lk) this).field_n = null;
            return false;
        }
        return false;
    }

    void c(byte param0) {
        if (param0 < 80) {
            ((lk) this).field_j = null;
        }
    }

    protected lk() {
        ((lk) this).field_v = 0;
        ((lk) this).field_o = 0;
    }

    lk(String param0, fc param1, sk param2) {
        sf var4 = null;
        ((lk) this).field_v = 0;
        ((lk) this).field_o = 0;
        ((lk) this).field_h = param0;
        ((lk) this).field_n = param2;
        ((lk) this).field_j = param1;
        if (((lk) this).field_j instanceof sf) {
            var4 = (sf) (Object) ((lk) this).field_j;
            ((lk) this).field_k = var4.a(-79925823, (lk) this);
            ((lk) this).field_m = var4.a((lk) this, 1);
        }
    }

    lk(int param0, int param1, int param2, int param3, fc param4, sk param5) {
        ((lk) this).field_v = 0;
        ((lk) this).field_o = 0;
        ((lk) this).field_k = param2;
        ((lk) this).field_j = param4;
        ((lk) this).field_r = param0;
        ((lk) this).field_m = param3;
        ((lk) this).field_n = param5;
        ((lk) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new lj();
        field_s = "Password is valid";
    }
}
