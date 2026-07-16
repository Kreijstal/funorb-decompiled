/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qm extends jb {
    int field_s;
    String field_t;
    wo field_i;
    static int field_n;
    static int[] field_q;
    tb field_p;
    int field_j;
    String field_o;
    int field_f;
    int field_r;
    bi field_l;
    boolean field_m;
    int field_h;
    int field_g;
    int field_k;

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        var4 = ((qm) this).c((byte) 38);
        var5_int = 0;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              ((qm) this).a(param2, (byte) -77, param1, var5_int);
              var5_int++;
              if (var7 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var5 = mc.a((byte) 6);
            if (var5 != null) {
              pi.field_j.a(var5, 3370, ni.field_b, rf.field_G);
              break L2;
            } else {
              break L2;
            }
          }
          var6 = 8 % ((param0 - 66) / 48);
          return;
        }
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        if (param0 != 1) {
            boolean discarded$0 = ((qm) this).a(-81, 38, true, -102, 61);
            return false;
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        ((qm) this).field_s = param5;
    }

    String a(byte param0) {
        if (param0 < -23) {
          if (!((qm) this).field_m) {
            return null;
          } else {
            return ((qm) this).field_t;
          }
        } else {
          ((qm) this).field_f = 96;
          if (!((qm) this).field_m) {
            return null;
          } else {
            return ((qm) this).field_t;
          }
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        var5 = ((qm) this).a(bm.field_h, param3, false, param2, qh.field_i) ? 1 : 0;
        var6 = 125 % ((-50 - param1) / 59);
        if ((((qm) this).field_m ? 1 : 0) != var5) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (var5 == 0) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((qm) this).field_m = stackIn_5_1 != 0;
          if (((qm) this).field_l != null) {
            if (!(((qm) this).field_l instanceof t)) {
              return;
            } else {
              ((t) (Object) ((qm) this).field_l).a(var5 != 0, -2095, (qm) this);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, StringBuilder param2, Hashtable param3) {
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        StringBuilder discarded$36 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((qm) this).field_r).append(",").append(((qm) this).field_j).append(" ").append(((qm) this).field_g).append("x").append(((qm) this).field_f);
        if (((qm) this).field_o == null) {
          if (!((qm) this).field_m) {
            if (param1 >= 119) {
              L0: {
                if (((qm) this).e(-111)) {
                  StringBuilder discarded$37 = param2.append(" focused");
                  break L0;
                } else {
                  break L0;
                }
              }
              if (((qm) this).field_i != null) {
                L1: {
                  StringBuilder discarded$38 = param2.append(" renderer=");
                  if (!(((qm) this).field_i instanceof qm)) {
                    break L1;
                  } else {
                    param2 = ((qm) this).a(param0 + 1, -86, param3, param2);
                    if (var6 == 0) {
                      if (null != ((qm) this).field_l) {
                        StringBuilder discarded$39 = param2.append(" listener=");
                        if (((qm) this).field_l instanceof qm) {
                          param2 = ((qm) this).a(1 + param0, -124, param3, param2);
                          if (var6 != 0) {
                            StringBuilder discarded$40 = param2.append(((qm) this).field_l);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          StringBuilder discarded$41 = param2.append(((qm) this).field_l);
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
                  StringBuilder discarded$42 = param2.append(((qm) this).field_i);
                  if (null != ((qm) this).field_l) {
                    L3: {
                      StringBuilder discarded$43 = param2.append(" listener=");
                      if (!(((qm) this).field_l instanceof qm)) {
                        break L3;
                      } else {
                        param2 = ((qm) this).a(1 + param0, -124, param3, param2);
                        break L3;
                      }
                    }
                    StringBuilder discarded$44 = param2.append(((qm) this).field_l);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              } else {
                L4: {
                  if (null != ((qm) this).field_l) {
                    L5: {
                      StringBuilder discarded$45 = param2.append(" listener=");
                      if (!(((qm) this).field_l instanceof qm)) {
                        break L5;
                      } else {
                        param2 = ((qm) this).a(1 + param0, -124, param3, param2);
                        if (var6 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    StringBuilder discarded$46 = param2.append(((qm) this).field_l);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            StringBuilder discarded$47 = param2.append(" mouseover");
            if (param1 < 119) {
              return;
            } else {
              L6: {
                if (((qm) this).e(-111)) {
                  StringBuilder discarded$48 = param2.append(" focused");
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (((qm) this).field_i != null) {
                  L8: {
                    StringBuilder discarded$49 = param2.append(" renderer=");
                    if (!(((qm) this).field_i instanceof qm)) {
                      break L8;
                    } else {
                      param2 = ((qm) this).a(param0 + 1, -86, param3, param2);
                      if (var6 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  StringBuilder discarded$50 = param2.append(((qm) this).field_i);
                  break L7;
                } else {
                  break L7;
                }
              }
              L9: {
                if (null != ((qm) this).field_l) {
                  L10: {
                    StringBuilder discarded$51 = param2.append(" listener=");
                    if (!(((qm) this).field_l instanceof qm)) {
                      break L10;
                    } else {
                      param2 = ((qm) this).a(1 + param0, -124, param3, param2);
                      if (var6 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  StringBuilder discarded$52 = param2.append(((qm) this).field_l);
                  break L9;
                } else {
                  break L9;
                }
              }
              return;
            }
          }
        } else {
          StringBuilder discarded$53 = param2.append(" text=\"").append(((qm) this).field_o).append(34);
          if (((qm) this).field_m) {
            StringBuilder discarded$54 = param2.append(" mouseover");
            if (param1 >= 119) {
              L11: {
                if (((qm) this).e(-111)) {
                  StringBuilder discarded$55 = param2.append(" focused");
                  break L11;
                } else {
                  break L11;
                }
              }
              if (((qm) this).field_i != null) {
                StringBuilder discarded$56 = param2.append(" renderer=");
                if (((qm) this).field_i instanceof qm) {
                  param2 = ((qm) this).a(param0 + 1, -86, param3, param2);
                  if (var6 == 0) {
                    L12: {
                      if (null != ((qm) this).field_l) {
                        L13: {
                          StringBuilder discarded$57 = param2.append(" listener=");
                          if (!(((qm) this).field_l instanceof qm)) {
                            break L13;
                          } else {
                            param2 = ((qm) this).a(1 + param0, -124, param3, param2);
                            if (var6 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        StringBuilder discarded$58 = param2.append(((qm) this).field_l);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    return;
                  } else {
                    StringBuilder discarded$59 = param2.append(((qm) this).field_i);
                    L14: {
                      if (null != ((qm) this).field_l) {
                        L15: {
                          StringBuilder discarded$60 = param2.append(" listener=");
                          if (!(((qm) this).field_l instanceof qm)) {
                            break L15;
                          } else {
                            param2 = ((qm) this).a(1 + param0, -124, param3, param2);
                            break L15;
                          }
                        }
                        StringBuilder discarded$61 = param2.append(((qm) this).field_l);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    return;
                  }
                } else {
                  StringBuilder discarded$62 = param2.append(((qm) this).field_i);
                  L16: {
                    if (null != ((qm) this).field_l) {
                      L17: {
                        StringBuilder discarded$63 = param2.append(" listener=");
                        if (!(((qm) this).field_l instanceof qm)) {
                          break L17;
                        } else {
                          param2 = ((qm) this).a(1 + param0, -124, param3, param2);
                          if (var6 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      StringBuilder discarded$64 = param2.append(((qm) this).field_l);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  return;
                }
              } else {
                L18: {
                  if (null != ((qm) this).field_l) {
                    L19: {
                      StringBuilder discarded$65 = param2.append(" listener=");
                      if (!(((qm) this).field_l instanceof qm)) {
                        break L19;
                      } else {
                        param2 = ((qm) this).a(1 + param0, -124, param3, param2);
                        if (var6 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    StringBuilder discarded$66 = param2.append(((qm) this).field_l);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            if (param1 < 119) {
              return;
            } else {
              L20: {
                if (((qm) this).e(-111)) {
                  StringBuilder discarded$67 = param2.append(" focused");
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (((qm) this).field_i != null) {
                  L22: {
                    StringBuilder discarded$68 = param2.append(" renderer=");
                    if (!(((qm) this).field_i instanceof qm)) {
                      break L22;
                    } else {
                      param2 = ((qm) this).a(param0 + 1, -86, param3, param2);
                      if (var6 == 0) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  StringBuilder discarded$69 = param2.append(((qm) this).field_i);
                  break L21;
                } else {
                  break L21;
                }
              }
              L23: {
                if (null != ((qm) this).field_l) {
                  L24: {
                    StringBuilder discarded$70 = param2.append(" listener=");
                    if (!(((qm) this).field_l instanceof qm)) {
                      break L24;
                    } else {
                      param2 = ((qm) this).a(1 + param0, -124, param3, param2);
                      if (var6 == 0) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  StringBuilder discarded$71 = param2.append(((qm) this).field_l);
                  break L23;
                } else {
                  break L23;
                }
              }
              return;
            }
          }
        }
    }

    final static jm d(int param0) {
        try {
            Throwable var1 = null;
            jm stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            jm stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 == 1) {
                    break L1;
                  } else {
                    field_q = null;
                    break L1;
                  }
                }
                stackOut_2_0 = (jm) Class.forName("sf").newInstance();
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return ((qm) this).a(0, -115, new Hashtable(), new StringBuilder()).toString();
    }

    StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        if (!((qm) this).a(0, param0, param3, param2)) {
          if (param1 > -85) {
            ((qm) this).field_k = 84;
            return param3;
          } else {
            return param3;
          }
        } else {
          ((qm) this).a(param0, (byte) 123, param3, param2);
          if (param1 <= -85) {
            return param3;
          } else {
            ((qm) this).field_k = 84;
            return param3;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != -52) {
          field_q = null;
          ((qm) this).field_j = param2;
          ((qm) this).field_g = param3;
          ((qm) this).field_f = param0;
          ((qm) this).field_r = param1;
          return;
        } else {
          ((qm) this).field_j = param2;
          ((qm) this).field_g = param3;
          ((qm) this).field_f = param0;
          ((qm) this).field_r = param1;
          return;
        }
    }

    void b(byte param0) {
        if (param0 > -84) {
            ((qm) this).field_k = 97;
        }
    }

    final boolean a(int param0, boolean param1, char param2) {
        int var4 = 0;
        if (!((qm) this).e(-121)) {
          var4 = param0;
          if (-81 != (var4 ^ -1)) {
            if (param1) {
              String discarded$4 = ((qm) this).a((byte) -42);
              return false;
            } else {
              return false;
            }
          } else {
            return ((qm) this).a(true, (qm) this);
          }
        } else {
          if (!((qm) this).a(param0, 19279, (qm) this, param2)) {
            var4 = param0;
            if (-81 != (var4 ^ -1)) {
              if (!param1) {
                return false;
              } else {
                String discarded$5 = ((qm) this).a((byte) -42);
                return false;
              }
            } else {
              return ((qm) this).a(true, (qm) this);
            }
          } else {
            return true;
          }
        }
    }

    public static void g(int param0) {
        if (param0 != 1) {
            jm discarded$0 = qm.d(38);
            field_q = null;
            return;
        }
        field_q = null;
    }

    void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (param3 != 0) {
            break L0;
          } else {
            if (((qm) this).field_i != null) {
              ((qm) this).field_i.a(param0, false, param2, (qm) this, true);
              break L0;
            } else {
              if (param1 <= -12) {
                return;
              } else {
                ((qm) this).field_h = -114;
                return;
              }
            }
          }
        }
        if (param1 > -12) {
          ((qm) this).field_h = -114;
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = 0;
        oj var6 = null;
        int var7 = 0;
        L0: {
          L1: {
            var7 = CrazyCrystals.field_B;
            ((qm) this).a((qm) this, -125, param0, param3);
            var5 = ((qm) this).e(-111) ? 1 : 0;
            if (!param2) {
              break L1;
            } else {
              L2: {
                if ((of.field_H ^ -1) == -1) {
                  break L2;
                } else {
                  if (var5 != 0) {
                    boolean discarded$1 = ((qm) this).a(1, bm.field_h, (qm) this, qh.field_i, param0, param3, of.field_H);
                    break L2;
                  } else {
                    if (pj.field_v != 0) {
                      L3: {
                        if (!((qm) this).a(param3, dp.field_h, (qm) this, false, param0, pj.field_v, to.field_a)) {
                          break L3;
                        } else {
                          param2 = false;
                          if (var7 != 0) {
                            break L3;
                          } else {
                            L4: {
                              if ((gg.field_c ^ -1) != -1) {
                                break L4;
                              } else {
                                if (-1 != (qk.field_D ^ -1)) {
                                  L5: {
                                    ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                                    var6 = ok.field_e;
                                    if (var6 == null) {
                                      break L5;
                                    } else {
                                      L6: {
                                        if (var6.field_l instanceof sk) {
                                          ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      }
                                      ok.field_e = null;
                                      break L5;
                                    }
                                  }
                                  if (var7 == 0) {
                                    break L4;
                                  } else {
                                    if (var5 == 0) {
                                      break L4;
                                    } else {
                                      if ((pj.field_v ^ -1) != -1) {
                                        ((qm) this).b((byte) -110);
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                            qk.field_D = gg.field_c;
                            if (!param1) {
                              ia.a((byte) -47, ((qm) this).a((byte) -54));
                              return param2;
                            } else {
                              return true;
                            }
                          }
                        }
                      }
                      if (var5 == 0) {
                        if ((gg.field_c ^ -1) == -1) {
                          if (-1 != (qk.field_D ^ -1)) {
                            L7: {
                              ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                              var6 = ok.field_e;
                              if (var6 == null) {
                                break L7;
                              } else {
                                L8: {
                                  if (var6.field_l instanceof sk) {
                                    ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                ok.field_e = null;
                                break L7;
                              }
                            }
                            if (var7 != 0) {
                              L9: {
                                if (var5 == 0) {
                                  break L9;
                                } else {
                                  if ((pj.field_v ^ -1) != -1) {
                                    ((qm) this).b((byte) -110);
                                    break L9;
                                  } else {
                                    qk.field_D = gg.field_c;
                                    if (!param1) {
                                      ia.a((byte) -47, ((qm) this).a((byte) -54));
                                      return param2;
                                    } else {
                                      return true;
                                    }
                                  }
                                }
                              }
                              qk.field_D = gg.field_c;
                              if (!param1) {
                                ia.a((byte) -47, ((qm) this).a((byte) -54));
                                return param2;
                              } else {
                                return true;
                              }
                            } else {
                              qk.field_D = gg.field_c;
                              if (!param1) {
                                ia.a((byte) -47, ((qm) this).a((byte) -54));
                                return param2;
                              } else {
                                return true;
                              }
                            }
                          } else {
                            qk.field_D = gg.field_c;
                            if (!param1) {
                              ia.a((byte) -47, ((qm) this).a((byte) -54));
                              return param2;
                            } else {
                              return true;
                            }
                          }
                        } else {
                          qk.field_D = gg.field_c;
                          if (!param1) {
                            ia.a((byte) -47, ((qm) this).a((byte) -54));
                            return param2;
                          } else {
                            return true;
                          }
                        }
                      } else {
                        L10: {
                          ((qm) this).b((byte) -118);
                          if ((gg.field_c ^ -1) != -1) {
                            break L10;
                          } else {
                            if (-1 != (qk.field_D ^ -1)) {
                              L11: {
                                ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                                var6 = ok.field_e;
                                if (var6 == null) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (var6.field_l instanceof sk) {
                                      ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  ok.field_e = null;
                                  break L11;
                                }
                              }
                              if (var7 == 0) {
                                break L10;
                              } else {
                                if (var5 == 0) {
                                  break L10;
                                } else {
                                  if ((pj.field_v ^ -1) != -1) {
                                    ((qm) this).b((byte) -110);
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            } else {
                              break L10;
                            }
                          }
                        }
                        qk.field_D = gg.field_c;
                        if (!param1) {
                          ia.a((byte) -47, ((qm) this).a((byte) -54));
                          return param2;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      L13: {
                        if ((gg.field_c ^ -1) != -1) {
                          break L13;
                        } else {
                          if (-1 != (qk.field_D ^ -1)) {
                            L14: {
                              ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                              var6 = ok.field_e;
                              if (var6 == null) {
                                break L14;
                              } else {
                                L15: {
                                  if (var6.field_l instanceof sk) {
                                    ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                ok.field_e = null;
                                break L14;
                              }
                            }
                            if (var7 == 0) {
                              break L13;
                            } else {
                              if (var5 == 0) {
                                break L13;
                              } else {
                                if ((pj.field_v ^ -1) != -1) {
                                  ((qm) this).b((byte) -110);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          } else {
                            break L13;
                          }
                        }
                      }
                      qk.field_D = gg.field_c;
                      if (!param1) {
                        ia.a((byte) -47, ((qm) this).a((byte) -54));
                        return param2;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
              L16: {
                if (pj.field_v == 0) {
                  break L16;
                } else {
                  L17: {
                    if (!((qm) this).a(param3, dp.field_h, (qm) this, false, param0, pj.field_v, to.field_a)) {
                      break L17;
                    } else {
                      param2 = false;
                      if (var7 == 0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  if (var5 == 0) {
                    break L16;
                  } else {
                    L18: {
                      ((qm) this).b((byte) -118);
                      if ((gg.field_c ^ -1) != -1) {
                        break L18;
                      } else {
                        if (-1 != (qk.field_D ^ -1)) {
                          L19: {
                            ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                            var6 = ok.field_e;
                            if (var6 == null) {
                              break L19;
                            } else {
                              L20: {
                                if (var6.field_l instanceof sk) {
                                  ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              ok.field_e = null;
                              break L19;
                            }
                          }
                          if (var7 == 0) {
                            break L18;
                          } else {
                            if (var5 == 0) {
                              break L18;
                            } else {
                              if ((pj.field_v ^ -1) != -1) {
                                ((qm) this).b((byte) -110);
                                break L18;
                              } else {
                                qk.field_D = gg.field_c;
                                if (!param1) {
                                  ia.a((byte) -47, ((qm) this).a((byte) -54));
                                  return param2;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        } else {
                          qk.field_D = gg.field_c;
                          if (!param1) {
                            ia.a((byte) -47, ((qm) this).a((byte) -54));
                            return param2;
                          } else {
                            return true;
                          }
                        }
                      }
                    }
                    qk.field_D = gg.field_c;
                    if (!param1) {
                      ia.a((byte) -47, ((qm) this).a((byte) -54));
                      return param2;
                    } else {
                      return true;
                    }
                  }
                }
              }
              if ((gg.field_c ^ -1) != -1) {
                break L0;
              } else {
                if (-1 != (qk.field_D ^ -1)) {
                  L21: {
                    ((qm) this).a(bm.field_h, param0, param3, qh.field_i, (qm) this, 0);
                    var6 = ok.field_e;
                    if (var6 == null) {
                      break L21;
                    } else {
                      L22: {
                        if (var6.field_l instanceof sk) {
                          ((sk) (Object) var6.field_l).a((ed) null, -27167, var6);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      ok.field_e = null;
                      break L21;
                    }
                  }
                  if (var7 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  qk.field_D = gg.field_c;
                  if (!param1) {
                    ia.a((byte) -47, ((qm) this).a((byte) -54));
                    return param2;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
          if (var5 == 0) {
            break L0;
          } else {
            if ((pj.field_v ^ -1) != -1) {
              ((qm) this).b((byte) -110);
              break L0;
            } else {
              qk.field_D = gg.field_c;
              if (!param1) {
                ia.a((byte) -47, ((qm) this).a((byte) -54));
                return param2;
              } else {
                return true;
              }
            }
          }
        }
        qk.field_D = gg.field_c;
        if (!param1) {
          ia.a((byte) -47, ((qm) this).a((byte) -54));
          return param2;
        } else {
          return true;
        }
    }

    final void f(int param0) {
        ((qm) this).a(((qm) this).field_f, ((qm) this).field_r, ((qm) this).field_j, ((qm) this).field_g, (byte) -52);
        if (param0 > -27) {
            boolean discarded$0 = ((qm) this).e(-107);
        }
    }

    boolean e(int param0) {
        if (param0 >= -107) {
            return true;
        }
        return false;
    }

    boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        if (((qm) this).a(param1, param0, param3, param4, param6)) {
            ((qm) this).field_s = param5;
            return false;
        }
        return false;
    }

    boolean a(boolean param0, qm param1) {
        if (!param0) {
            return true;
        }
        return false;
    }

    boolean a(int param0, int param1, qm param2, char param3) {
        if (param1 != 19279) {
            return false;
        }
        return false;
    }

    int c(byte param0) {
        if (param0 < 30) {
            StringBuilder discarded$0 = ((qm) this).a(-13, -26, (Hashtable) null, (StringBuilder) null);
            return 0;
        }
        return 0;
    }

    qm(String param0, bi param1) {
        this(param0, pi.field_j.field_n, param1);
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4) {
        if (!param2) {
          if (param1 + ((qm) this).field_r <= param4) {
            if (((qm) this).field_j + param3 <= param0) {
              if (param1 - (-((qm) this).field_r - ((qm) this).field_g) > param4) {
                if (param3 - -((qm) this).field_j - -((qm) this).field_f <= param0) {
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

    final boolean a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        if (param0 == 0) {
          if (!param3.containsKey(this)) {
            Object discarded$4 = param3.put(this, this);
            return true;
          } else {
            StringBuilder discarded$5 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
        } else {
          return true;
        }
    }

    protected qm() {
        ((qm) this).field_h = 0;
        ((qm) this).field_k = 0;
    }

    qm(String param0, wo param1, bi param2) {
        fi var4 = null;
        ((qm) this).field_h = 0;
        ((qm) this).field_k = 0;
        ((qm) this).field_l = param2;
        ((qm) this).field_o = param0;
        ((qm) this).field_i = param1;
        if (((qm) this).field_i instanceof fi) {
            var4 = (fi) (Object) ((qm) this).field_i;
            ((qm) this).field_g = var4.b((qm) this, -12817);
            ((qm) this).field_f = var4.c((qm) this, -1);
        }
    }

    final static int a(rh param0, int param1, rh param2) {
        if (param1 <= 84) {
          qm.g(-54);
          return ai.a(param2, false, (String) null, 0, param0, (byte) 84, 0);
        } else {
          return ai.a(param2, false, (String) null, 0, param0, (byte) 84, 0);
        }
    }

    qm(int param0, int param1, int param2, int param3, wo param4, bi param5) {
        ((qm) this).field_h = 0;
        ((qm) this).field_k = 0;
        ((qm) this).field_g = param2;
        ((qm) this).field_i = param4;
        ((qm) this).field_r = param0;
        ((qm) this).field_l = param5;
        ((qm) this).field_f = param3;
        ((qm) this).field_j = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[8192];
    }
}
