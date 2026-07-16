/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rj extends gg {
    vk field_r;
    lf field_v;
    uk field_u;
    int field_l;
    int field_p;
    boolean field_q;
    String field_m;
    String field_x;
    int field_k;
    int field_o;
    int field_t;
    int field_n;
    static pb field_s;
    int field_w;

    public static void b(boolean param0) {
        field_s = null;
        if (!param0) {
            rj.c((byte) -1);
        }
    }

    void a(int param0, boolean param1, int param2, rj param3) {
        int var5 = 0;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (!param1) {
          L0: {
            var5 = ((rj) this).a((byte) 126, param0, eb.field_a, ni.field_e, param2) ? 1 : 0;
            stackOut_2_0 = ((rj) this).field_q;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (var5 != 0) {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          if ((stackIn_5_0 ? 1 : 0) == stackIn_5_1) {
            L1: {
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var5 == 0) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L1;
              }
            }
            ((rj) this).field_q = stackIn_10_1 != 0;
            if (null != ((rj) this).field_v) {
              if (!(((rj) this).field_v instanceof da)) {
                return;
              } else {
                ((da) (Object) ((rj) this).field_v).a((byte) 76, var5 != 0, (rj) this);
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

    String d(int param0) {
        if (param0 == 3690) {
          if (!((rj) this).field_q) {
            return null;
          } else {
            return ((rj) this).field_x;
          }
        } else {
          ((rj) this).field_m = null;
          if (!((rj) this).field_q) {
            return null;
          } else {
            return ((rj) this).field_x;
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 74 % ((param0 - -52) / 33);
        if (!((7 & param1) == 0)) {
            var2 = -(param1 & 7) + 8;
        }
        int var4 = param1 + var2;
        return var4;
    }

    boolean a(int param0, int param1, rj param2, int param3, int param4, int param5, int param6) {
        if (param4 < 30) {
            return false;
        }
        return false;
    }

    boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        if (!((rj) this).a((byte) 126, param6, param3, param1, param4)) {
          if (param5 < 24) {
            ((rj) this).field_m = null;
            return false;
          } else {
            return false;
          }
        } else {
          ((rj) this).field_o = param2;
          if (param5 >= 24) {
            return false;
          } else {
            ((rj) this).field_m = null;
            return false;
          }
        }
    }

    boolean a(int param0, rj param1) {
        if (param0 != -2147483648) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return ((rj) this).a(0, false, new StringBuilder(), new Hashtable()).toString();
    }

    rj(String param0, lf param1) {
        this(param0, n.field_i.field_r, param1);
    }

    int a(boolean param0) {
        if (param0) {
            ((rj) this).a(-18, -25, 118);
            return 0;
        }
        return 0;
    }

    final boolean a(boolean param0, byte param1, int param2, int param3) {
        int var5 = 0;
        dl var6 = null;
        int var7 = 0;
        dl var8 = null;
        dl var9 = null;
        dl var11 = null;
        dl var13 = null;
        dl var15 = null;
        dl var17 = null;
        dl var19 = null;
        dl var20 = null;
        var7 = stellarshard.field_B;
        if (param1 < -116) {
          L0: {
            L1: {
              ((rj) this).a(param2, false, param3, (rj) this);
              var5 = ((rj) this).e(0) ? 1 : 0;
              if (!param0) {
                break L1;
              } else {
                L2: {
                  if ((ke.field_b ^ -1) == -1) {
                    break L2;
                  } else {
                    if (var5 == 0) {
                      break L2;
                    } else {
                      L3: {
                        boolean discarded$2 = ((rj) this).a(param2, eb.field_a, (rj) this, ni.field_e, 63, ke.field_b, param3);
                        if (-1 == (gh.field_c ^ -1)) {
                          break L3;
                        } else {
                          if (((rj) this).a((rj) this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                            param0 = false;
                            break L3;
                          } else {
                            if (var5 == 0) {
                              break L3;
                            } else {
                              ((rj) this).c(true);
                              if (var7 == 0) {
                                break L3;
                              } else {
                                L4: {
                                  param0 = false;
                                  if (0 != fb.field_n) {
                                    break L4;
                                  } else {
                                    if (nb.field_H != 0) {
                                      L5: {
                                        ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                                        var15 = lk.field_e;
                                        var6 = var15;
                                        if (var15 != null) {
                                          L6: {
                                            if (var15.field_v instanceof jh) {
                                              ((jh) (Object) var15.field_v).a((of) null, (byte) 106, var15);
                                              break L6;
                                            } else {
                                              break L6;
                                            }
                                          }
                                          lk.field_e = null;
                                          break L5;
                                        } else {
                                          break L5;
                                        }
                                      }
                                      if (var7 == 0) {
                                        break L4;
                                      } else {
                                        if (var5 == 0) {
                                          break L4;
                                        } else {
                                          if ((gh.field_c ^ -1) == -1) {
                                            break L4;
                                          } else {
                                            ((rj) this).c(true);
                                            break L4;
                                          }
                                        }
                                      }
                                    } else {
                                      nb.field_H = fb.field_n;
                                      cl.a(((rj) this).d(3690), (byte) 96);
                                      return param0;
                                    }
                                  }
                                }
                                nb.field_H = fb.field_n;
                                cl.a(((rj) this).d(3690), (byte) 96);
                                return param0;
                              }
                            }
                          }
                        }
                      }
                      L7: {
                        if (0 != fb.field_n) {
                          break L7;
                        } else {
                          if (nb.field_H != 0) {
                            L8: {
                              ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                              var17 = lk.field_e;
                              var6 = var17;
                              if (var17 != null) {
                                L9: {
                                  if (var17.field_v instanceof jh) {
                                    ((jh) (Object) var17.field_v).a((of) null, (byte) 106, var17);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                lk.field_e = null;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            if (var7 == 0) {
                              break L7;
                            } else {
                              if (var5 == 0) {
                                break L7;
                              } else {
                                if ((gh.field_c ^ -1) == -1) {
                                  break L7;
                                } else {
                                  ((rj) this).c(true);
                                  nb.field_H = fb.field_n;
                                  cl.a(((rj) this).d(3690), (byte) 96);
                                  return param0;
                                }
                              }
                            }
                          } else {
                            nb.field_H = fb.field_n;
                            cl.a(((rj) this).d(3690), (byte) 96);
                            return param0;
                          }
                        }
                      }
                      nb.field_H = fb.field_n;
                      cl.a(((rj) this).d(3690), (byte) 96);
                      return param0;
                    }
                  }
                }
                L10: {
                  if (-1 == (gh.field_c ^ -1)) {
                    break L10;
                  } else {
                    if (((rj) this).a((rj) this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                      param0 = false;
                      break L10;
                    } else {
                      if (var5 == 0) {
                        break L10;
                      } else {
                        ((rj) this).c(true);
                        if (var7 == 0) {
                          break L10;
                        } else {
                          L11: {
                            param0 = false;
                            if (0 != fb.field_n) {
                              break L11;
                            } else {
                              if (nb.field_H != 0) {
                                L12: {
                                  ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                                  var19 = lk.field_e;
                                  var6 = var19;
                                  if (var19 != null) {
                                    L13: {
                                      if (var19.field_v instanceof jh) {
                                        ((jh) (Object) var19.field_v).a((of) null, (byte) 106, var19);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    lk.field_e = null;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                if (var7 == 0) {
                                  break L11;
                                } else {
                                  if (var5 == 0) {
                                    break L11;
                                  } else {
                                    if ((gh.field_c ^ -1) == -1) {
                                      break L11;
                                    } else {
                                      ((rj) this).c(true);
                                      nb.field_H = fb.field_n;
                                      cl.a(((rj) this).d(3690), (byte) 96);
                                      return param0;
                                    }
                                  }
                                }
                              } else {
                                nb.field_H = fb.field_n;
                                cl.a(((rj) this).d(3690), (byte) 96);
                                return param0;
                              }
                            }
                          }
                          nb.field_H = fb.field_n;
                          cl.a(((rj) this).d(3690), (byte) 96);
                          return param0;
                        }
                      }
                    }
                  }
                }
                if (0 != fb.field_n) {
                  break L0;
                } else {
                  if (nb.field_H != 0) {
                    L14: {
                      ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                      var20 = lk.field_e;
                      if (var20 != null) {
                        L15: {
                          if (var20.field_v instanceof jh) {
                            ((jh) (Object) var20.field_v).a((of) null, (byte) 106, var20);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        lk.field_e = null;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    if (var7 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    nb.field_H = fb.field_n;
                    cl.a(((rj) this).d(3690), (byte) 96);
                    return param0;
                  }
                }
              }
            }
            if (var5 == 0) {
              break L0;
            } else {
              if ((gh.field_c ^ -1) == -1) {
                break L0;
              } else {
                ((rj) this).c(true);
                nb.field_H = fb.field_n;
                cl.a(((rj) this).d(3690), (byte) 96);
                return param0;
              }
            }
          }
          nb.field_H = fb.field_n;
          cl.a(((rj) this).d(3690), (byte) 96);
          return param0;
        } else {
          L16: {
            L17: {
              ((rj) this).field_p = 21;
              ((rj) this).a(param2, false, param3, (rj) this);
              var5 = ((rj) this).e(0) ? 1 : 0;
              if (!param0) {
                break L17;
              } else {
                if ((ke.field_b ^ -1) != -1) {
                  if (var5 != 0) {
                    L18: {
                      boolean discarded$3 = ((rj) this).a(param2, eb.field_a, (rj) this, ni.field_e, 63, ke.field_b, param3);
                      if (-1 == (gh.field_c ^ -1)) {
                        break L18;
                      } else {
                        if (((rj) this).a((rj) this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                          param0 = false;
                          break L18;
                        } else {
                          if (var5 == 0) {
                            break L18;
                          } else {
                            ((rj) this).c(true);
                            if (var7 == 0) {
                              break L18;
                            } else {
                              L19: {
                                param0 = false;
                                if (0 != fb.field_n) {
                                  break L19;
                                } else {
                                  if (nb.field_H != 0) {
                                    L20: {
                                      ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                                      var11 = lk.field_e;
                                      var6 = var11;
                                      if (var11 != null) {
                                        L21: {
                                          if (var11.field_v instanceof jh) {
                                            ((jh) (Object) var11.field_v).a((of) null, (byte) 106, var11);
                                            break L21;
                                          } else {
                                            break L21;
                                          }
                                        }
                                        lk.field_e = null;
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    if (var7 == 0) {
                                      break L19;
                                    } else {
                                      if (var5 == 0) {
                                        break L19;
                                      } else {
                                        if ((gh.field_c ^ -1) == -1) {
                                          break L19;
                                        } else {
                                          ((rj) this).c(true);
                                          break L19;
                                        }
                                      }
                                    }
                                  } else {
                                    nb.field_H = fb.field_n;
                                    cl.a(((rj) this).d(3690), (byte) 96);
                                    return param0;
                                  }
                                }
                              }
                              nb.field_H = fb.field_n;
                              cl.a(((rj) this).d(3690), (byte) 96);
                              return param0;
                            }
                          }
                        }
                      }
                    }
                    if (0 != fb.field_n) {
                      break L16;
                    } else {
                      if (nb.field_H != 0) {
                        L22: {
                          ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                          var13 = lk.field_e;
                          var6 = var13;
                          if (var13 != null) {
                            L23: {
                              if (var13.field_v instanceof jh) {
                                ((jh) (Object) var13.field_v).a((of) null, (byte) 106, var13);
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            lk.field_e = null;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if (var7 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      } else {
                        nb.field_H = fb.field_n;
                        cl.a(((rj) this).d(3690), (byte) 96);
                        return param0;
                      }
                    }
                  } else {
                    L24: {
                      if (-1 == (gh.field_c ^ -1)) {
                        break L24;
                      } else {
                        L25: {
                          if (((rj) this).a((rj) this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                            break L25;
                          } else {
                            if (var5 == 0) {
                              break L24;
                            } else {
                              ((rj) this).c(true);
                              if (var7 == 0) {
                                break L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        param0 = false;
                        break L24;
                      }
                    }
                    L26: {
                      if (0 != fb.field_n) {
                        break L26;
                      } else {
                        if (nb.field_H != 0) {
                          L27: {
                            ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                            var9 = lk.field_e;
                            var6 = var9;
                            if (var9 != null) {
                              L28: {
                                if (var9.field_v instanceof jh) {
                                  ((jh) (Object) var9.field_v).a((of) null, (byte) 106, var9);
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              lk.field_e = null;
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          if (var7 == 0) {
                            break L26;
                          } else {
                            if (var5 == 0) {
                              break L26;
                            } else {
                              if ((gh.field_c ^ -1) == -1) {
                                break L26;
                              } else {
                                ((rj) this).c(true);
                                break L26;
                              }
                            }
                          }
                        } else {
                          nb.field_H = fb.field_n;
                          cl.a(((rj) this).d(3690), (byte) 96);
                          return param0;
                        }
                      }
                    }
                    nb.field_H = fb.field_n;
                    cl.a(((rj) this).d(3690), (byte) 96);
                    return param0;
                  }
                } else {
                  L29: {
                    if (-1 == (gh.field_c ^ -1)) {
                      break L29;
                    } else {
                      L30: {
                        if (((rj) this).a((rj) this, di.field_b, gh.field_c, oc.field_e, param3, (byte) 88, param2)) {
                          break L30;
                        } else {
                          if (var5 == 0) {
                            break L29;
                          } else {
                            ((rj) this).c(true);
                            if (var7 == 0) {
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                        }
                      }
                      param0 = false;
                      break L29;
                    }
                  }
                  L31: {
                    if (0 != fb.field_n) {
                      break L31;
                    } else {
                      if (nb.field_H != 0) {
                        L32: {
                          ((rj) this).a(eb.field_a, -109, (rj) this, param3, param2, ni.field_e);
                          var8 = lk.field_e;
                          var6 = var8;
                          if (var8 != null) {
                            L33: {
                              if (var8.field_v instanceof jh) {
                                ((jh) (Object) var8.field_v).a((of) null, (byte) 106, var8);
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                            lk.field_e = null;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        if (var7 == 0) {
                          break L31;
                        } else {
                          if (var5 == 0) {
                            break L31;
                          } else {
                            if ((gh.field_c ^ -1) == -1) {
                              break L31;
                            } else {
                              ((rj) this).c(true);
                              break L31;
                            }
                          }
                        }
                      } else {
                        nb.field_H = fb.field_n;
                        cl.a(((rj) this).d(3690), (byte) 96);
                        return param0;
                      }
                    }
                  }
                  nb.field_H = fb.field_n;
                  cl.a(((rj) this).d(3690), (byte) 96);
                  return param0;
                }
              }
            }
            if (var5 == 0) {
              break L16;
            } else {
              if ((gh.field_c ^ -1) == -1) {
                break L16;
              } else {
                ((rj) this).c(true);
                nb.field_H = fb.field_n;
                cl.a(((rj) this).d(3690), (byte) 96);
                return param0;
              }
            }
          }
          nb.field_H = fb.field_n;
          cl.a(((rj) this).d(3690), (byte) 96);
          return param0;
        }
    }

    final void f(int param0) {
        if (param0 != 0) {
          ((rj) this).field_r = null;
          ((rj) this).b(((rj) this).field_p, ((rj) this).field_w, ((rj) this).field_k, ((rj) this).field_t, 23987);
          return;
        } else {
          ((rj) this).b(((rj) this).field_p, ((rj) this).field_w, ((rj) this).field_k, ((rj) this).field_t, 23987);
          return;
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param0 > 123) {
          if (param3 >= param4 - -((rj) this).field_w) {
            if (param1 - -((rj) this).field_k > param2) {
              return false;
            } else {
              L0: {
                L1: {
                  if (((rj) this).field_w + (param4 - -((rj) this).field_p) <= param3) {
                    break L1;
                  } else {
                    if (param1 + (((rj) this).field_k + ((rj) this).field_t) <= param2) {
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
          boolean discarded$1 = ((rj) this).a((byte) -24, 123, -112, 102, -44);
          if (param3 >= param4 - -((rj) this).field_w) {
            if (param1 - -((rj) this).field_k <= param2) {
              if (((rj) this).field_w + (param4 - -((rj) this).field_p) > param3) {
                if (param1 + (((rj) this).field_k + ((rj) this).field_t) <= param2) {
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

    void c(boolean param0) {
        if (!param0) {
            field_s = null;
        }
    }

    final boolean a(int param0, char param1, boolean param2) {
        int var4 = 0;
        if (((rj) this).e(0)) {
          if (!((rj) this).a(29657, param0, param1, (rj) this)) {
            if (param2) {
              var4 = param0;
              if ((var4 ^ -1) == -81) {
                return ((rj) this).a(-2147483648, (rj) this);
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (param2) {
            var4 = param0;
            if ((var4 ^ -1) != -81) {
              return false;
            } else {
              return ((rj) this).a(-2147483648, (rj) this);
            }
          } else {
            return false;
          }
        }
    }

    final static void c(byte param0) {
        if (param0 == -94) {
          if (!cg.field_a) {
            throw new IllegalStateException();
          } else {
            qh.field_d = true;
            va.a(true, -844);
            eg.field_d = 0;
            return;
          }
        } else {
          field_s = null;
          if (!cg.field_a) {
            throw new IllegalStateException();
          } else {
            qh.field_d = true;
            va.a(true, -844);
            eg.field_d = 0;
            return;
          }
        }
    }

    final boolean a(byte param0, Hashtable param1, StringBuilder param2, int param3) {
        int var5 = 0;
        var5 = 44 / ((param0 - 15) / 38);
        if (param1.containsKey(this)) {
          StringBuilder discarded$4 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } else {
          Object discarded$5 = param1.put(this, this);
          return true;
        }
    }

    boolean a(int param0, int param1, char param2, rj param3) {
        if (param0 != 29657) {
            return false;
        }
        return false;
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        ((rj) this).field_w = param1;
        if (param4 != 23987) {
          boolean discarded$2 = ((rj) this).a(50, (rj) null);
          ((rj) this).field_p = param0;
          ((rj) this).field_k = param2;
          ((rj) this).field_t = param3;
          return;
        } else {
          ((rj) this).field_p = param0;
          ((rj) this).field_k = param2;
          ((rj) this).field_t = param3;
          return;
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (param1 != -57) {
            boolean discarded$10 = ((rj) this).a(-120, -51, 'ﾁ', (rj) null);
            if (-1 != (param0 ^ -1)) {
                return;
            }
            if (((rj) this).field_u == null) {
                return;
            }
            ((rj) this).field_u.a(true, param3, param2, (rj) this, 4549);
            return;
        }
        if (-1 != (param0 ^ -1)) {
            return;
        }
        if (((rj) this).field_u == null) {
            return;
        }
        ((rj) this).field_u.a(true, param3, param2, (rj) this, 4549);
    }

    void a(int param0, int param1, rj param2, int param3, int param4, int param5) {
        int var7 = -122 / ((-50 - param1) / 57);
        ((rj) this).field_o = 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        var6 = stellarshard.field_B;
        var4 = ((rj) this).a(false);
        var5_int = param1;
        L0: while (true) {
          L1: {
            if (var4 < var5_int) {
              break L1;
            } else {
              ((rj) this).a(var5_int, (byte) -57, param2, param0);
              var5_int++;
              if (var6 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var5 = e.b(-1);
          if (var5 != null) {
            n.field_i.a(var5, h.field_c, am.field_f, (byte) 127);
            return;
          } else {
            return;
          }
        }
    }

    StringBuilder a(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
        if (param1) {
          L0: {
            rj.b(false);
            if (((rj) this).a((byte) 55, param3, param2, param0)) {
              ((rj) this).a((byte) 126, param0, param2, param3);
              break L0;
            } else {
              break L0;
            }
          }
          return param2;
        } else {
          L1: {
            if (((rj) this).a((byte) 55, param3, param2, param0)) {
              ((rj) this).a((byte) 126, param0, param2, param3);
              break L1;
            } else {
              break L1;
            }
          }
          return param2;
        }
    }

    final void a(byte param0, int param1, StringBuilder param2, Hashtable param3) {
        int var6 = 0;
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        L0: {
          var6 = stellarshard.field_B;
          StringBuilder discarded$25 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((rj) this).field_w).append(",").append(((rj) this).field_k).append(" ").append(((rj) this).field_p).append("x").append(((rj) this).field_t);
          if (((rj) this).field_m != null) {
            StringBuilder discarded$26 = param2.append(" text=\"").append(((rj) this).field_m).append(34);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 <= 76) {
          L1: {
            ((rj) this).field_q = false;
            if (!((rj) this).field_q) {
              break L1;
            } else {
              StringBuilder discarded$27 = param2.append(" mouseover");
              break L1;
            }
          }
          L2: {
            if (((rj) this).e(0)) {
              StringBuilder discarded$28 = param2.append(" focused");
              break L2;
            } else {
              break L2;
            }
          }
          if (null == ((rj) this).field_u) {
            L3: {
              if (null != ((rj) this).field_v) {
                StringBuilder discarded$29 = param2.append(" listener=");
                if (((rj) this).field_v instanceof rj) {
                  param2 = ((rj) this).a(1 + param1, false, param2, param3);
                  break L3;
                } else {
                  StringBuilder discarded$30 = param2.append(((rj) this).field_v);
                  if (var6 == 0) {
                    break L3;
                  } else {
                    param2 = ((rj) this).a(1 + param1, false, param2, param3);
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              StringBuilder discarded$31 = param2.append(" renderer=");
              if (((rj) this).field_u instanceof rj) {
                param2 = ((rj) this).a(param1 + 1, false, param2, param3);
                break L4;
              } else {
                StringBuilder discarded$32 = param2.append(((rj) this).field_u);
                if (var6 == 0) {
                  break L4;
                } else {
                  param2 = ((rj) this).a(param1 + 1, false, param2, param3);
                  break L4;
                }
              }
            }
            L5: {
              if (null != ((rj) this).field_v) {
                StringBuilder discarded$33 = param2.append(" listener=");
                if (((rj) this).field_v instanceof rj) {
                  param2 = ((rj) this).a(1 + param1, false, param2, param3);
                  break L5;
                } else {
                  StringBuilder discarded$34 = param2.append(((rj) this).field_v);
                  if (var6 == 0) {
                    break L5;
                  } else {
                    param2 = ((rj) this).a(1 + param1, false, param2, param3);
                    break L5;
                  }
                }
              } else {
                break L5;
              }
            }
            return;
          }
        } else {
          if (!((rj) this).field_q) {
            L6: {
              if (((rj) this).e(0)) {
                StringBuilder discarded$35 = param2.append(" focused");
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (null == ((rj) this).field_u) {
                break L7;
              } else {
                StringBuilder discarded$36 = param2.append(" renderer=");
                if (((rj) this).field_u instanceof rj) {
                  L8: {
                    var7 = ((rj) this).a(param1 + 1, false, param2, param3);
                    if (null != ((rj) this).field_v) {
                      StringBuilder discarded$37 = var7.append(" listener=");
                      if (((rj) this).field_v instanceof rj) {
                        param2 = ((rj) this).a(1 + param1, false, var7, param3);
                        break L8;
                      } else {
                        StringBuilder discarded$38 = var7.append(((rj) this).field_v);
                        param2 = ((rj) this).a(1 + param1, false, var7, param3);
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  return;
                } else {
                  StringBuilder discarded$39 = param2.append(((rj) this).field_u);
                  if (var6 == 0) {
                    break L7;
                  } else {
                    L9: {
                      var8 = ((rj) this).a(param1 + 1, false, param2, param3);
                      if (null != ((rj) this).field_v) {
                        StringBuilder discarded$40 = var8.append(" listener=");
                        if (((rj) this).field_v instanceof rj) {
                          param2 = ((rj) this).a(1 + param1, false, var8, param3);
                          break L9;
                        } else {
                          StringBuilder discarded$41 = var8.append(((rj) this).field_v);
                          param2 = ((rj) this).a(1 + param1, false, var8, param3);
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (null != ((rj) this).field_v) {
              StringBuilder discarded$42 = param2.append(" listener=");
              if (!(((rj) this).field_v instanceof rj)) {
                StringBuilder discarded$43 = param2.append(((rj) this).field_v);
                if (var6 != 0) {
                  param2 = ((rj) this).a(1 + param1, false, param2, param3);
                  return;
                } else {
                  return;
                }
              } else {
                param2 = ((rj) this).a(1 + param1, false, param2, param3);
                return;
              }
            } else {
              return;
            }
          } else {
            L10: {
              StringBuilder discarded$44 = param2.append(" mouseover");
              if (((rj) this).e(0)) {
                StringBuilder discarded$45 = param2.append(" focused");
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (null == ((rj) this).field_u) {
                break L11;
              } else {
                StringBuilder discarded$46 = param2.append(" renderer=");
                if (((rj) this).field_u instanceof rj) {
                  param2 = ((rj) this).a(param1 + 1, false, param2, param3);
                  break L11;
                } else {
                  StringBuilder discarded$47 = param2.append(((rj) this).field_u);
                  if (var6 == 0) {
                    break L11;
                  } else {
                    param2 = ((rj) this).a(param1 + 1, false, param2, param3);
                    break L11;
                  }
                }
              }
            }
            L12: {
              if (null != ((rj) this).field_v) {
                StringBuilder discarded$48 = param2.append(" listener=");
                if (((rj) this).field_v instanceof rj) {
                  param2 = ((rj) this).a(1 + param1, false, param2, param3);
                  break L12;
                } else {
                  StringBuilder discarded$49 = param2.append(((rj) this).field_v);
                  if (var6 == 0) {
                    break L12;
                  } else {
                    param2 = ((rj) this).a(1 + param1, false, param2, param3);
                    break L12;
                  }
                }
              } else {
                break L12;
              }
            }
            return;
          }
        }
    }

    boolean e(int param0) {
        if (param0 != 0) {
            StringBuilder discarded$0 = ((rj) this).a(-83, false, (StringBuilder) null, (Hashtable) null);
            return false;
        }
        return false;
    }

    protected rj() {
        ((rj) this).field_l = 0;
        ((rj) this).field_n = 0;
    }

    rj(String param0, uk param1, lf param2) {
        pj var4 = null;
        ((rj) this).field_l = 0;
        ((rj) this).field_n = 0;
        ((rj) this).field_u = param1;
        ((rj) this).field_m = param0;
        ((rj) this).field_v = param2;
        if (((rj) this).field_u instanceof pj) {
            var4 = (pj) (Object) ((rj) this).field_u;
            ((rj) this).field_p = var4.a((rj) this, (byte) 124);
            ((rj) this).field_t = var4.a((rj) this, 28361);
        }
    }

    final static void a(byte param0, int param1, int param2) {
        L0: {
          if (ge.field_n == null) {
            break L0;
          } else {
            if (ge.field_n.length >= param1) {
              if (null == se.field_B) {
                L1: {
                  L2: {
                    se.field_B = new int[2 * param1];
                    if (null == qf.field_g) {
                      break L2;
                    } else {
                      if (qf.field_g.length < param1) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  qf.field_g = new int[2 * param1];
                  break L1;
                }
                if (null != wb.field_e) {
                  if (param1 > wb.field_e.length) {
                    L3: {
                      L4: {
                        wb.field_e = new int[param1 * 2];
                        if (null == vc.field_f) {
                          break L4;
                        } else {
                          if (param1 > vc.field_f.length) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      vc.field_f = new int[param1 * 2];
                      break L3;
                    }
                    L5: {
                      L6: {
                        if (null == vh.field_h) {
                          break L6;
                        } else {
                          if (param1 > vh.field_h.length) {
                            break L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                      vh.field_h = new int[param1 * 2];
                      break L5;
                    }
                    L7: {
                      L8: {
                        if (fj.field_b == null) {
                          break L8;
                        } else {
                          if (fj.field_b.length < param1 - -param2) {
                            break L8;
                          } else {
                            break L7;
                          }
                        }
                      }
                      fj.field_b = new int[2 * (param1 + param2)];
                      break L7;
                    }
                    L9: {
                      L10: {
                        if (null == vl.field_s) {
                          break L10;
                        } else {
                          if (param1 > vl.field_s.length) {
                            break L10;
                          } else {
                            break L9;
                          }
                        }
                      }
                      vl.field_s = new boolean[param1 * 2];
                      break L9;
                    }
                    ta.field_q = 2147483647;
                    ce.field_b = -2147483648;
                    fh.field_b = 0;
                    if (param0 <= -13) {
                      af.field_k = 2147483647;
                      oe.field_c = -2147483648;
                      return;
                    } else {
                      int discarded$8 = rj.a((byte) 107, 88);
                      af.field_k = 2147483647;
                      oe.field_c = -2147483648;
                      return;
                    }
                  } else {
                    L11: {
                      L12: {
                        if (null == vc.field_f) {
                          break L12;
                        } else {
                          if (param1 > vc.field_f.length) {
                            break L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                      vc.field_f = new int[param1 * 2];
                      break L11;
                    }
                    L13: {
                      L14: {
                        if (null == vh.field_h) {
                          break L14;
                        } else {
                          if (param1 > vh.field_h.length) {
                            break L14;
                          } else {
                            break L13;
                          }
                        }
                      }
                      vh.field_h = new int[param1 * 2];
                      break L13;
                    }
                    L15: {
                      L16: {
                        if (fj.field_b == null) {
                          break L16;
                        } else {
                          if (fj.field_b.length < param1 - -param2) {
                            break L16;
                          } else {
                            break L15;
                          }
                        }
                      }
                      fj.field_b = new int[2 * (param1 + param2)];
                      break L15;
                    }
                    L17: {
                      L18: {
                        if (null == vl.field_s) {
                          break L18;
                        } else {
                          if (param1 > vl.field_s.length) {
                            break L18;
                          } else {
                            break L17;
                          }
                        }
                      }
                      vl.field_s = new boolean[param1 * 2];
                      break L17;
                    }
                    ta.field_q = 2147483647;
                    ce.field_b = -2147483648;
                    fh.field_b = 0;
                    if (param0 <= -13) {
                      af.field_k = 2147483647;
                      oe.field_c = -2147483648;
                      return;
                    } else {
                      int discarded$9 = rj.a((byte) 107, 88);
                      af.field_k = 2147483647;
                      oe.field_c = -2147483648;
                      return;
                    }
                  }
                } else {
                  L19: {
                    L20: {
                      wb.field_e = new int[param1 * 2];
                      if (null == vc.field_f) {
                        break L20;
                      } else {
                        if (param1 > vc.field_f.length) {
                          break L20;
                        } else {
                          break L19;
                        }
                      }
                    }
                    vc.field_f = new int[param1 * 2];
                    break L19;
                  }
                  L21: {
                    L22: {
                      if (null == vh.field_h) {
                        break L22;
                      } else {
                        if (param1 > vh.field_h.length) {
                          break L22;
                        } else {
                          break L21;
                        }
                      }
                    }
                    vh.field_h = new int[param1 * 2];
                    break L21;
                  }
                  L23: {
                    L24: {
                      if (fj.field_b == null) {
                        break L24;
                      } else {
                        if (fj.field_b.length < param1 - -param2) {
                          break L24;
                        } else {
                          break L23;
                        }
                      }
                    }
                    fj.field_b = new int[2 * (param1 + param2)];
                    break L23;
                  }
                  L25: {
                    L26: {
                      if (null == vl.field_s) {
                        break L26;
                      } else {
                        if (param1 > vl.field_s.length) {
                          break L26;
                        } else {
                          break L25;
                        }
                      }
                    }
                    vl.field_s = new boolean[param1 * 2];
                    break L25;
                  }
                  ta.field_q = 2147483647;
                  ce.field_b = -2147483648;
                  fh.field_b = 0;
                  if (param0 <= -13) {
                    af.field_k = 2147483647;
                    oe.field_c = -2147483648;
                    return;
                  } else {
                    int discarded$10 = rj.a((byte) 107, 88);
                    af.field_k = 2147483647;
                    oe.field_c = -2147483648;
                    return;
                  }
                }
              } else {
                if (param1 > se.field_B.length) {
                  L27: {
                    L28: {
                      se.field_B = new int[2 * param1];
                      if (null == qf.field_g) {
                        break L28;
                      } else {
                        if (qf.field_g.length < param1) {
                          break L28;
                        } else {
                          break L27;
                        }
                      }
                    }
                    qf.field_g = new int[2 * param1];
                    break L27;
                  }
                  if (null == wb.field_e) {
                    L29: {
                      L30: {
                        wb.field_e = new int[param1 * 2];
                        if (null == vc.field_f) {
                          break L30;
                        } else {
                          if (param1 > vc.field_f.length) {
                            break L30;
                          } else {
                            break L29;
                          }
                        }
                      }
                      vc.field_f = new int[param1 * 2];
                      break L29;
                    }
                    L31: {
                      L32: {
                        if (null == vh.field_h) {
                          break L32;
                        } else {
                          if (param1 > vh.field_h.length) {
                            break L32;
                          } else {
                            break L31;
                          }
                        }
                      }
                      vh.field_h = new int[param1 * 2];
                      break L31;
                    }
                    L33: {
                      L34: {
                        if (fj.field_b == null) {
                          break L34;
                        } else {
                          if (fj.field_b.length < param1 - -param2) {
                            break L34;
                          } else {
                            break L33;
                          }
                        }
                      }
                      fj.field_b = new int[2 * (param1 + param2)];
                      break L33;
                    }
                    L35: {
                      L36: {
                        if (null == vl.field_s) {
                          break L36;
                        } else {
                          if (param1 > vl.field_s.length) {
                            break L36;
                          } else {
                            break L35;
                          }
                        }
                      }
                      vl.field_s = new boolean[param1 * 2];
                      break L35;
                    }
                    ta.field_q = 2147483647;
                    ce.field_b = -2147483648;
                    fh.field_b = 0;
                    if (param0 <= -13) {
                      af.field_k = 2147483647;
                      oe.field_c = -2147483648;
                      return;
                    } else {
                      int discarded$11 = rj.a((byte) 107, 88);
                      af.field_k = 2147483647;
                      oe.field_c = -2147483648;
                      return;
                    }
                  } else {
                    if (param1 <= wb.field_e.length) {
                      L37: {
                        L38: {
                          if (null == vc.field_f) {
                            break L38;
                          } else {
                            if (param1 > vc.field_f.length) {
                              break L38;
                            } else {
                              break L37;
                            }
                          }
                        }
                        vc.field_f = new int[param1 * 2];
                        break L37;
                      }
                      L39: {
                        L40: {
                          if (null == vh.field_h) {
                            break L40;
                          } else {
                            if (param1 > vh.field_h.length) {
                              break L40;
                            } else {
                              break L39;
                            }
                          }
                        }
                        vh.field_h = new int[param1 * 2];
                        break L39;
                      }
                      L41: {
                        L42: {
                          if (fj.field_b == null) {
                            break L42;
                          } else {
                            if (fj.field_b.length < param1 - -param2) {
                              break L42;
                            } else {
                              break L41;
                            }
                          }
                        }
                        fj.field_b = new int[2 * (param1 + param2)];
                        break L41;
                      }
                      L43: {
                        L44: {
                          if (null == vl.field_s) {
                            break L44;
                          } else {
                            if (param1 > vl.field_s.length) {
                              break L44;
                            } else {
                              break L43;
                            }
                          }
                        }
                        vl.field_s = new boolean[param1 * 2];
                        break L43;
                      }
                      ta.field_q = 2147483647;
                      ce.field_b = -2147483648;
                      fh.field_b = 0;
                      if (param0 <= -13) {
                        af.field_k = 2147483647;
                        oe.field_c = -2147483648;
                        return;
                      } else {
                        int discarded$12 = rj.a((byte) 107, 88);
                        af.field_k = 2147483647;
                        oe.field_c = -2147483648;
                        return;
                      }
                    } else {
                      L45: {
                        L46: {
                          wb.field_e = new int[param1 * 2];
                          if (null == vc.field_f) {
                            break L46;
                          } else {
                            if (param1 > vc.field_f.length) {
                              break L46;
                            } else {
                              break L45;
                            }
                          }
                        }
                        vc.field_f = new int[param1 * 2];
                        break L45;
                      }
                      L47: {
                        L48: {
                          if (null == vh.field_h) {
                            break L48;
                          } else {
                            if (param1 > vh.field_h.length) {
                              break L48;
                            } else {
                              break L47;
                            }
                          }
                        }
                        vh.field_h = new int[param1 * 2];
                        break L47;
                      }
                      L49: {
                        L50: {
                          if (fj.field_b == null) {
                            break L50;
                          } else {
                            if (fj.field_b.length < param1 - -param2) {
                              break L50;
                            } else {
                              break L49;
                            }
                          }
                        }
                        fj.field_b = new int[2 * (param1 + param2)];
                        break L49;
                      }
                      L51: {
                        L52: {
                          if (null == vl.field_s) {
                            break L52;
                          } else {
                            if (param1 > vl.field_s.length) {
                              break L52;
                            } else {
                              break L51;
                            }
                          }
                        }
                        vl.field_s = new boolean[param1 * 2];
                        break L51;
                      }
                      ta.field_q = 2147483647;
                      ce.field_b = -2147483648;
                      fh.field_b = 0;
                      if (param0 <= -13) {
                        af.field_k = 2147483647;
                        oe.field_c = -2147483648;
                        return;
                      } else {
                        int discarded$13 = rj.a((byte) 107, 88);
                        af.field_k = 2147483647;
                        oe.field_c = -2147483648;
                        return;
                      }
                    }
                  }
                } else {
                  L53: {
                    L54: {
                      if (null == qf.field_g) {
                        break L54;
                      } else {
                        if (qf.field_g.length < param1) {
                          break L54;
                        } else {
                          break L53;
                        }
                      }
                    }
                    qf.field_g = new int[2 * param1];
                    break L53;
                  }
                  L55: {
                    L56: {
                      if (null == wb.field_e) {
                        break L56;
                      } else {
                        if (param1 <= wb.field_e.length) {
                          break L55;
                        } else {
                          break L56;
                        }
                      }
                    }
                    wb.field_e = new int[param1 * 2];
                    break L55;
                  }
                  L57: {
                    L58: {
                      if (null == vc.field_f) {
                        break L58;
                      } else {
                        if (param1 > vc.field_f.length) {
                          break L58;
                        } else {
                          break L57;
                        }
                      }
                    }
                    vc.field_f = new int[param1 * 2];
                    break L57;
                  }
                  L59: {
                    L60: {
                      if (null == vh.field_h) {
                        break L60;
                      } else {
                        if (param1 > vh.field_h.length) {
                          break L60;
                        } else {
                          break L59;
                        }
                      }
                    }
                    vh.field_h = new int[param1 * 2];
                    break L59;
                  }
                  L61: {
                    L62: {
                      if (fj.field_b == null) {
                        break L62;
                      } else {
                        if (fj.field_b.length < param1 - -param2) {
                          break L62;
                        } else {
                          break L61;
                        }
                      }
                    }
                    fj.field_b = new int[2 * (param1 + param2)];
                    break L61;
                  }
                  L63: {
                    L64: {
                      if (null == vl.field_s) {
                        break L64;
                      } else {
                        if (param1 > vl.field_s.length) {
                          break L64;
                        } else {
                          break L63;
                        }
                      }
                    }
                    vl.field_s = new boolean[param1 * 2];
                    break L63;
                  }
                  ta.field_q = 2147483647;
                  ce.field_b = -2147483648;
                  fh.field_b = 0;
                  if (param0 <= -13) {
                    af.field_k = 2147483647;
                    oe.field_c = -2147483648;
                    return;
                  } else {
                    int discarded$14 = rj.a((byte) 107, 88);
                    af.field_k = 2147483647;
                    oe.field_c = -2147483648;
                    return;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        L65: {
          L66: {
            ge.field_n = new int[param1 * 2];
            if (null == se.field_B) {
              break L66;
            } else {
              if (param1 > se.field_B.length) {
                break L66;
              } else {
                break L65;
              }
            }
          }
          se.field_B = new int[2 * param1];
          break L65;
        }
        L67: {
          L68: {
            if (null == qf.field_g) {
              break L68;
            } else {
              if (qf.field_g.length < param1) {
                break L68;
              } else {
                break L67;
              }
            }
          }
          qf.field_g = new int[2 * param1];
          break L67;
        }
        L69: {
          L70: {
            if (null == wb.field_e) {
              break L70;
            } else {
              if (param1 <= wb.field_e.length) {
                break L69;
              } else {
                break L70;
              }
            }
          }
          wb.field_e = new int[param1 * 2];
          break L69;
        }
        L71: {
          L72: {
            if (null == vc.field_f) {
              break L72;
            } else {
              if (param1 > vc.field_f.length) {
                break L72;
              } else {
                break L71;
              }
            }
          }
          vc.field_f = new int[param1 * 2];
          break L71;
        }
        L73: {
          L74: {
            if (null == vh.field_h) {
              break L74;
            } else {
              if (param1 > vh.field_h.length) {
                break L74;
              } else {
                break L73;
              }
            }
          }
          vh.field_h = new int[param1 * 2];
          break L73;
        }
        L75: {
          L76: {
            if (fj.field_b == null) {
              break L76;
            } else {
              if (fj.field_b.length < param1 - -param2) {
                break L76;
              } else {
                break L75;
              }
            }
          }
          fj.field_b = new int[2 * (param1 + param2)];
          break L75;
        }
        L77: {
          L78: {
            if (null == vl.field_s) {
              break L78;
            } else {
              if (param1 > vl.field_s.length) {
                break L78;
              } else {
                break L77;
              }
            }
          }
          vl.field_s = new boolean[param1 * 2];
          break L77;
        }
        ta.field_q = 2147483647;
        ce.field_b = -2147483648;
        fh.field_b = 0;
        if (param0 <= -13) {
          af.field_k = 2147483647;
          oe.field_c = -2147483648;
          return;
        } else {
          int discarded$15 = rj.a((byte) 107, 88);
          af.field_k = 2147483647;
          oe.field_c = -2147483648;
          return;
        }
    }

    rj(int param0, int param1, int param2, int param3, uk param4, lf param5) {
        ((rj) this).field_l = 0;
        ((rj) this).field_n = 0;
        ((rj) this).field_k = param1;
        ((rj) this).field_w = param0;
        ((rj) this).field_t = param3;
        ((rj) this).field_v = param5;
        ((rj) this).field_u = param4;
        ((rj) this).field_p = param2;
    }

    static {
    }
}
