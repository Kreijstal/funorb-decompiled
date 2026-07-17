/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends gq {
    private int field_s;
    private int[] field_r;
    private int[] field_w;
    private gd field_j;
    private int field_u;
    private ug field_p;
    static String field_n;
    private int field_k;
    private ug field_o;
    private boolean field_y;
    static fm field_A;
    private boolean field_l;
    private gd field_t;
    private ug field_x;
    private gd field_v;
    static ri field_z;
    static int field_m;
    private int field_q;

    private final void a(gd param0, int param1, int param2, int param3) {
        try {
            param0.a(param2, -1, false);
            param0.a((byte) -116, param3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "w.H(" + (param0 != null ? "{...}" : "null") + 44 + -1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final synchronized void a(ug param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_32_0 = 0;
        gd stackIn_39_0 = null;
        ug stackIn_39_1 = null;
        gd stackIn_40_0 = null;
        ug stackIn_40_1 = null;
        gd stackIn_41_0 = null;
        ug stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        gd stackIn_48_0 = null;
        ug stackIn_48_1 = null;
        gd stackIn_49_0 = null;
        ug stackIn_49_1 = null;
        gd stackIn_50_0 = null;
        ug stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        gd stackOut_47_0 = null;
        ug stackOut_47_1 = null;
        gd stackOut_49_0 = null;
        ug stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        gd stackOut_48_0 = null;
        ug stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        gd stackOut_38_0 = null;
        ug stackOut_38_1 = null;
        gd stackOut_40_0 = null;
        ug stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        gd stackOut_39_0 = null;
        ug stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((w) this).field_y) {
                break L1;
              } else {
                if (!param2) {
                  break L1;
                } else {
                  L2: {
                    if (0 >= ((w) this).field_q) {
                      L3: {
                        if (((w) this).field_o == null) {
                          break L3;
                        } else {
                          ((w) this).field_v.g(2);
                          break L3;
                        }
                      }
                      ((w) this).field_o = param0;
                      if (param0 != null) {
                        ((w) this).field_v.a(param0, false, 8361407);
                        this.a(((w) this).field_v, -1, param3, param1);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null == ((w) this).field_p) {
                          break L4;
                        } else {
                          ((w) this).field_j.g(2);
                          break L4;
                        }
                      }
                      ((w) this).field_p = param0;
                      if (param0 == null) {
                        break L2;
                      } else {
                        ((w) this).field_j.a(param0, false, 8361407);
                        this.a(((w) this).field_j, -1, param3, param1);
                        break L2;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L5: {
              stackOut_14_0 = this;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (!param2) {
                stackOut_16_0 = this;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L5;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L5;
              }
            }
            ((w) this).field_y = stackIn_17_1 != 0;
            if (param5) {
              if (((w) this).field_p == param0) {
                ((w) this).field_q = param4;
                this.a(((w) this).field_j, -1, param3, param1);
                return;
              } else {
                if (param0 != ((w) this).field_o) {
                  L6: {
                    if (((w) this).field_p != null) {
                      if (((w) this).field_o != null) {
                        L7: {
                          if (524288 <= ((w) this).field_s) {
                            stackOut_31_0 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            break L7;
                          } else {
                            stackOut_30_0 = 1;
                            stackIn_32_0 = stackOut_30_0;
                            break L7;
                          }
                        }
                        var7_int = stackIn_32_0;
                        break L6;
                      } else {
                        var7_int = 0;
                        break L6;
                      }
                    } else {
                      var7_int = 1;
                      break L6;
                    }
                  }
                  if (var7_int == 0) {
                    L8: {
                      if (null == ((w) this).field_o) {
                        break L8;
                      } else {
                        ((w) this).field_v.g(2);
                        break L8;
                      }
                    }
                    L9: {
                      ((w) this).field_o = param0;
                      if (param0 != null) {
                        L10: {
                          stackOut_47_0 = ((w) this).field_v;
                          stackOut_47_1 = (ug) param0;
                          stackIn_49_0 = stackOut_47_0;
                          stackIn_49_1 = stackOut_47_1;
                          stackIn_48_0 = stackOut_47_0;
                          stackIn_48_1 = stackOut_47_1;
                          if (param2) {
                            stackOut_49_0 = (gd) (Object) stackIn_49_0;
                            stackOut_49_1 = (ug) (Object) stackIn_49_1;
                            stackOut_49_2 = 0;
                            stackIn_50_0 = stackOut_49_0;
                            stackIn_50_1 = stackOut_49_1;
                            stackIn_50_2 = stackOut_49_2;
                            break L10;
                          } else {
                            stackOut_48_0 = (gd) (Object) stackIn_48_0;
                            stackOut_48_1 = (ug) (Object) stackIn_48_1;
                            stackOut_48_2 = 1;
                            stackIn_50_0 = stackOut_48_0;
                            stackIn_50_1 = stackOut_48_1;
                            stackIn_50_2 = stackOut_48_2;
                            break L10;
                          }
                        }
                        ((gd) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2 != 0, 8361407);
                        this.a(((w) this).field_v, -1, param3, param1);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    ((w) this).field_q = -param4;
                    break L0;
                  } else {
                    L11: {
                      if (((w) this).field_p == null) {
                        break L11;
                      } else {
                        ((w) this).field_j.g(2);
                        break L11;
                      }
                    }
                    L12: {
                      ((w) this).field_p = param0;
                      if (param0 != null) {
                        L13: {
                          stackOut_38_0 = ((w) this).field_j;
                          stackOut_38_1 = (ug) param0;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          if (param2) {
                            stackOut_40_0 = (gd) (Object) stackIn_40_0;
                            stackOut_40_1 = (ug) (Object) stackIn_40_1;
                            stackOut_40_2 = 0;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            stackIn_41_2 = stackOut_40_2;
                            break L13;
                          } else {
                            stackOut_39_0 = (gd) (Object) stackIn_39_0;
                            stackOut_39_1 = (ug) (Object) stackIn_39_1;
                            stackOut_39_2 = 1;
                            stackIn_41_0 = stackOut_39_0;
                            stackIn_41_1 = stackOut_39_1;
                            stackIn_41_2 = stackOut_39_2;
                            break L13;
                          }
                        }
                        ((gd) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2 != 0, 8361407);
                        this.a(((w) this).field_j, -1, param3, param1);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    ((w) this).field_q = param4;
                    return;
                  }
                } else {
                  ((w) this).field_q = -param4;
                  this.a(((w) this).field_v, -1, param3, param1);
                  return;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var7 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var7;
            stackOut_53_1 = new StringBuilder().append("w.C(");
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param0 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L14;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L14;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final gq d() {
        return null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        int discarded$0 = 0;
        ia.a(320, 180, true);
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (pk.field_b != null) {
          if (!pk.field_b.a(false)) {
            if (bk.field_i != null) {
              if (!bk.field_i.k(101)) {
                if (vc.a(4996418)) {
                  return true;
                } else {
                  int discarded$16 = 15;
                  int discarded$17 = 13;
                  int discarded$18 = 122;
                  int discarded$19 = 12;
                  if (sd.a()) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                bk.field_i = null;
                q.b(46);
                return true;
              }
            } else {
              if (vc.a(4996418)) {
                return true;
              } else {
                int discarded$20 = 15;
                int discarded$21 = 13;
                int discarded$22 = 122;
                int discarded$23 = 12;
                if (sd.a()) {
                  return true;
                } else {
                  return false;
                }
              }
            }
          } else {
            q.b(124);
            return true;
          }
        } else {
          if (bk.field_i != null) {
            if (!bk.field_i.k(101)) {
              if (vc.a(4996418)) {
                return true;
              } else {
                int discarded$24 = 15;
                int discarded$25 = 13;
                int discarded$26 = 122;
                int discarded$27 = 12;
                if (sd.a()) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              bk.field_i = null;
              q.b(46);
              return true;
            }
          } else {
            if (vc.a(4996418)) {
              return true;
            } else {
              int discarded$28 = 15;
              int discarded$29 = 13;
              int discarded$30 = 122;
              int discarded$31 = 12;
              if (sd.a()) {
                return true;
              } else {
                return false;
              }
            }
          }
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((w) this).field_s > 0) {
          L0: {
            if (null != ((w) this).field_p) {
              ((w) this).field_j.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (((w) this).field_s < 1048576) {
            if (((w) this).field_o == null) {
              L1: {
                if (0 >= ((w) this).field_u) {
                  break L1;
                } else {
                  if (((w) this).field_x != null) {
                    ((w) this).field_t.a(param0);
                    break L1;
                  } else {
                    if (((w) this).field_y) {
                      if (((w) this).field_q > 0) {
                        if (((w) this).field_j.c(-106)) {
                          L2: {
                            if (((w) this).field_q >= 0) {
                              break L2;
                            } else {
                              if (!((w) this).field_v.c(-61)) {
                                ((w) this).field_o = null;
                                ((w) this).field_q = -((w) this).field_q;
                                ((w) this).field_y = false;
                                break L2;
                              } else {
                                L3: {
                                  if (((w) this).field_q != 0) {
                                    ((w) this).field_s = ((w) this).field_s + param0 * ((w) this).field_q;
                                    if (((w) this).field_s >= 1048576) {
                                      ((w) this).field_s = 1048576;
                                      if (!((w) this).field_y) {
                                        ((w) this).field_q = 0;
                                        if (((w) this).field_l) {
                                          break L3;
                                        } else {
                                          L4: {
                                            if (null != ((w) this).field_o) {
                                              ((w) this).field_v.g(2);
                                              break L4;
                                            } else {
                                              break L4;
                                            }
                                          }
                                          ((w) this).field_o = null;
                                          break L3;
                                        }
                                      } else {
                                        return;
                                      }
                                    } else {
                                      if (0 >= ((w) this).field_s) {
                                        ((w) this).field_s = 0;
                                        if (!((w) this).field_y) {
                                          ((w) this).field_q = 0;
                                          if (!((w) this).field_l) {
                                            if (((w) this).field_p == null) {
                                              ((w) this).field_p = null;
                                              return;
                                            } else {
                                              ((w) this).field_j.g(2);
                                              ((w) this).field_p = null;
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
                                  } else {
                                    break L3;
                                  }
                                }
                                return;
                              }
                            }
                          }
                          if (((w) this).field_q != 0) {
                            ((w) this).field_s = ((w) this).field_s + param0 * ((w) this).field_q;
                            if (((w) this).field_s >= 1048576) {
                              ((w) this).field_s = 1048576;
                              if (!((w) this).field_y) {
                                L5: {
                                  ((w) this).field_q = 0;
                                  if (((w) this).field_l) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (null != ((w) this).field_o) {
                                        ((w) this).field_v.g(2);
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    }
                                    ((w) this).field_o = null;
                                    break L5;
                                  }
                                }
                                return;
                              } else {
                                return;
                              }
                            } else {
                              if (0 >= ((w) this).field_s) {
                                ((w) this).field_s = 0;
                                if (!((w) this).field_y) {
                                  ((w) this).field_q = 0;
                                  if (!((w) this).field_l) {
                                    if (((w) this).field_p == null) {
                                      ((w) this).field_p = null;
                                      return;
                                    } else {
                                      ((w) this).field_j.g(2);
                                      ((w) this).field_p = null;
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
                          } else {
                            return;
                          }
                        } else {
                          L7: {
                            ((w) this).field_p = null;
                            ((w) this).field_q = -((w) this).field_q;
                            ((w) this).field_y = false;
                            if (((w) this).field_q != 0) {
                              ((w) this).field_s = ((w) this).field_s + param0 * ((w) this).field_q;
                              if (((w) this).field_s >= 1048576) {
                                ((w) this).field_s = 1048576;
                                if (!((w) this).field_y) {
                                  ((w) this).field_q = 0;
                                  if (((w) this).field_l) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (null != ((w) this).field_o) {
                                        ((w) this).field_v.g(2);
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    ((w) this).field_o = null;
                                    break L7;
                                  }
                                } else {
                                  return;
                                }
                              } else {
                                if (0 >= ((w) this).field_s) {
                                  ((w) this).field_s = 0;
                                  if (!((w) this).field_y) {
                                    ((w) this).field_q = 0;
                                    if (!((w) this).field_l) {
                                      if (((w) this).field_p == null) {
                                        ((w) this).field_p = null;
                                        return;
                                      } else {
                                        ((w) this).field_j.g(2);
                                        ((w) this).field_p = null;
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
                            } else {
                              break L7;
                            }
                          }
                          return;
                        }
                      } else {
                        L9: {
                          if (((w) this).field_q >= 0) {
                            break L9;
                          } else {
                            if (!((w) this).field_v.c(-61)) {
                              ((w) this).field_o = null;
                              ((w) this).field_q = -((w) this).field_q;
                              ((w) this).field_y = false;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (((w) this).field_q != 0) {
                            ((w) this).field_s = ((w) this).field_s + param0 * ((w) this).field_q;
                            if (((w) this).field_s >= 1048576) {
                              ((w) this).field_s = 1048576;
                              if (!((w) this).field_y) {
                                ((w) this).field_q = 0;
                                if (((w) this).field_l) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (null != ((w) this).field_o) {
                                      ((w) this).field_v.g(2);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  ((w) this).field_o = null;
                                  break L10;
                                }
                              } else {
                                return;
                              }
                            } else {
                              if (0 >= ((w) this).field_s) {
                                ((w) this).field_s = 0;
                                if (!((w) this).field_y) {
                                  ((w) this).field_q = 0;
                                  if (!((w) this).field_l) {
                                    if (((w) this).field_p == null) {
                                      ((w) this).field_p = null;
                                      return;
                                    } else {
                                      ((w) this).field_j.g(2);
                                      ((w) this).field_p = null;
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
                          } else {
                            break L10;
                          }
                        }
                        return;
                      }
                    } else {
                      if (((w) this).field_q != 0) {
                        ((w) this).field_s = ((w) this).field_s + param0 * ((w) this).field_q;
                        if (((w) this).field_s >= 1048576) {
                          ((w) this).field_s = 1048576;
                          if (((w) this).field_y) {
                            return;
                          } else {
                            L12: {
                              ((w) this).field_q = 0;
                              if (((w) this).field_l) {
                                break L12;
                              } else {
                                L13: {
                                  if (null != ((w) this).field_o) {
                                    ((w) this).field_v.g(2);
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                ((w) this).field_o = null;
                                break L12;
                              }
                            }
                            return;
                          }
                        } else {
                          if (0 >= ((w) this).field_s) {
                            ((w) this).field_s = 0;
                            if (!((w) this).field_y) {
                              ((w) this).field_q = 0;
                              if (!((w) this).field_l) {
                                if (((w) this).field_p != null) {
                                  ((w) this).field_j.g(2);
                                  ((w) this).field_p = null;
                                  return;
                                } else {
                                  ((w) this).field_p = null;
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
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L14: {
                if (!((w) this).field_y) {
                  break L14;
                } else {
                  L15: {
                    if (((w) this).field_q <= 0) {
                      break L15;
                    } else {
                      if (((w) this).field_j.c(-106)) {
                        break L15;
                      } else {
                        ((w) this).field_p = null;
                        ((w) this).field_q = -((w) this).field_q;
                        ((w) this).field_y = false;
                        if (((w) this).field_q != 0) {
                          ((w) this).field_s = ((w) this).field_s + param0 * ((w) this).field_q;
                          if (((w) this).field_s >= 1048576) {
                            ((w) this).field_s = 1048576;
                            if (!((w) this).field_y) {
                              L16: {
                                ((w) this).field_q = 0;
                                if (((w) this).field_l) {
                                  break L16;
                                } else {
                                  L17: {
                                    if (null != ((w) this).field_o) {
                                      ((w) this).field_v.g(2);
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  ((w) this).field_o = null;
                                  break L16;
                                }
                              }
                              return;
                            } else {
                              return;
                            }
                          } else {
                            if (0 >= ((w) this).field_s) {
                              ((w) this).field_s = 0;
                              if (!((w) this).field_y) {
                                ((w) this).field_q = 0;
                                if (!((w) this).field_l) {
                                  if (((w) this).field_p == null) {
                                    ((w) this).field_p = null;
                                    return;
                                  } else {
                                    ((w) this).field_j.g(2);
                                    ((w) this).field_p = null;
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
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (((w) this).field_q >= 0) {
                    break L14;
                  } else {
                    if (!((w) this).field_v.c(-61)) {
                      ((w) this).field_o = null;
                      ((w) this).field_q = -((w) this).field_q;
                      ((w) this).field_y = false;
                      break L14;
                    } else {
                      if (((w) this).field_q != 0) {
                        ((w) this).field_s = ((w) this).field_s + param0 * ((w) this).field_q;
                        if (((w) this).field_s >= 1048576) {
                          ((w) this).field_s = 1048576;
                          if (!((w) this).field_y) {
                            L18: {
                              ((w) this).field_q = 0;
                              if (((w) this).field_l) {
                                break L18;
                              } else {
                                L19: {
                                  if (null != ((w) this).field_o) {
                                    ((w) this).field_v.g(2);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                ((w) this).field_o = null;
                                break L18;
                              }
                            }
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (0 >= ((w) this).field_s) {
                            ((w) this).field_s = 0;
                            if (!((w) this).field_y) {
                              ((w) this).field_q = 0;
                              if (!((w) this).field_l) {
                                if (((w) this).field_p == null) {
                                  ((w) this).field_p = null;
                                  return;
                                } else {
                                  ((w) this).field_j.g(2);
                                  ((w) this).field_p = null;
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
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              if (((w) this).field_q != 0) {
                ((w) this).field_s = ((w) this).field_s + param0 * ((w) this).field_q;
                if (((w) this).field_s >= 1048576) {
                  ((w) this).field_s = 1048576;
                  if (!((w) this).field_y) {
                    L20: {
                      ((w) this).field_q = 0;
                      if (((w) this).field_l) {
                        break L20;
                      } else {
                        L21: {
                          if (null != ((w) this).field_o) {
                            ((w) this).field_v.g(2);
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        ((w) this).field_o = null;
                        break L20;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (0 >= ((w) this).field_s) {
                    ((w) this).field_s = 0;
                    if (!((w) this).field_y) {
                      ((w) this).field_q = 0;
                      if (!((w) this).field_l) {
                        if (((w) this).field_p == null) {
                          ((w) this).field_p = null;
                          return;
                        } else {
                          ((w) this).field_j.g(2);
                          ((w) this).field_p = null;
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
              } else {
                return;
              }
            } else {
              L22: {
                ((w) this).field_v.a(param0);
                if (0 >= ((w) this).field_u) {
                  break L22;
                } else {
                  if (((w) this).field_x != null) {
                    ((w) this).field_t.a(param0);
                    break L22;
                  } else {
                    break L22;
                  }
                }
              }
              L23: {
                if (!((w) this).field_y) {
                  break L23;
                } else {
                  L24: {
                    if (((w) this).field_q <= 0) {
                      break L24;
                    } else {
                      if (((w) this).field_j.c(-106)) {
                        break L24;
                      } else {
                        ((w) this).field_p = null;
                        ((w) this).field_q = -((w) this).field_q;
                        ((w) this).field_y = false;
                        break L23;
                      }
                    }
                  }
                  if (((w) this).field_q >= 0) {
                    break L23;
                  } else {
                    if (!((w) this).field_v.c(-61)) {
                      ((w) this).field_o = null;
                      ((w) this).field_q = -((w) this).field_q;
                      ((w) this).field_y = false;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
              }
              if (((w) this).field_q != 0) {
                ((w) this).field_s = ((w) this).field_s + param0 * ((w) this).field_q;
                if (((w) this).field_s >= 1048576) {
                  ((w) this).field_s = 1048576;
                  if (((w) this).field_y) {
                    return;
                  } else {
                    L25: {
                      ((w) this).field_q = 0;
                      if (((w) this).field_l) {
                        break L25;
                      } else {
                        L26: {
                          if (null != ((w) this).field_o) {
                            ((w) this).field_v.g(2);
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        ((w) this).field_o = null;
                        break L25;
                      }
                    }
                    return;
                  }
                } else {
                  if (0 >= ((w) this).field_s) {
                    ((w) this).field_s = 0;
                    if (!((w) this).field_y) {
                      ((w) this).field_q = 0;
                      if (!((w) this).field_l) {
                        if (((w) this).field_p != null) {
                          ((w) this).field_j.g(2);
                          ((w) this).field_p = null;
                          return;
                        } else {
                          ((w) this).field_p = null;
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
              } else {
                return;
              }
            }
          } else {
            L27: {
              if (0 >= ((w) this).field_u) {
                break L27;
              } else {
                if (((w) this).field_x != null) {
                  ((w) this).field_t.a(param0);
                  break L27;
                } else {
                  break L27;
                }
              }
            }
            L28: {
              if (!((w) this).field_y) {
                break L28;
              } else {
                L29: {
                  if (((w) this).field_q <= 0) {
                    break L29;
                  } else {
                    if (((w) this).field_j.c(-106)) {
                      break L29;
                    } else {
                      ((w) this).field_p = null;
                      ((w) this).field_q = -((w) this).field_q;
                      ((w) this).field_y = false;
                      break L28;
                    }
                  }
                }
                if (((w) this).field_q >= 0) {
                  break L28;
                } else {
                  if (!((w) this).field_v.c(-61)) {
                    ((w) this).field_o = null;
                    ((w) this).field_q = -((w) this).field_q;
                    ((w) this).field_y = false;
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
            }
            if (((w) this).field_q != 0) {
              ((w) this).field_s = ((w) this).field_s + param0 * ((w) this).field_q;
              if (((w) this).field_s >= 1048576) {
                ((w) this).field_s = 1048576;
                if (((w) this).field_y) {
                  return;
                } else {
                  L30: {
                    ((w) this).field_q = 0;
                    if (((w) this).field_l) {
                      break L30;
                    } else {
                      L31: {
                        if (null != ((w) this).field_o) {
                          ((w) this).field_v.g(2);
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      ((w) this).field_o = null;
                      break L30;
                    }
                  }
                  return;
                }
              } else {
                if (0 >= ((w) this).field_s) {
                  ((w) this).field_s = 0;
                  if (!((w) this).field_y) {
                    ((w) this).field_q = 0;
                    if (!((w) this).field_l) {
                      if (((w) this).field_p != null) {
                        ((w) this).field_j.g(2);
                        ((w) this).field_p = null;
                        return;
                      } else {
                        ((w) this).field_p = null;
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
            } else {
              return;
            }
          }
        } else {
          L32: {
            if (((w) this).field_s >= 1048576) {
              break L32;
            } else {
              if (((w) this).field_o == null) {
                break L32;
              } else {
                ((w) this).field_v.a(param0);
                break L32;
              }
            }
          }
          L33: {
            if (0 >= ((w) this).field_u) {
              break L33;
            } else {
              if (((w) this).field_x != null) {
                ((w) this).field_t.a(param0);
                break L33;
              } else {
                break L33;
              }
            }
          }
          L34: {
            if (!((w) this).field_y) {
              break L34;
            } else {
              L35: {
                if (((w) this).field_q <= 0) {
                  break L35;
                } else {
                  if (((w) this).field_j.c(-106)) {
                    break L35;
                  } else {
                    ((w) this).field_p = null;
                    ((w) this).field_q = -((w) this).field_q;
                    ((w) this).field_y = false;
                    break L34;
                  }
                }
              }
              if (((w) this).field_q >= 0) {
                break L34;
              } else {
                if (!((w) this).field_v.c(-61)) {
                  ((w) this).field_o = null;
                  ((w) this).field_q = -((w) this).field_q;
                  ((w) this).field_y = false;
                  break L34;
                } else {
                  break L34;
                }
              }
            }
          }
          if (((w) this).field_q != 0) {
            ((w) this).field_s = ((w) this).field_s + param0 * ((w) this).field_q;
            if (((w) this).field_s >= 1048576) {
              ((w) this).field_s = 1048576;
              if (((w) this).field_y) {
                return;
              } else {
                L36: {
                  ((w) this).field_q = 0;
                  if (((w) this).field_l) {
                    break L36;
                  } else {
                    L37: {
                      if (null != ((w) this).field_o) {
                        ((w) this).field_v.g(2);
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    ((w) this).field_o = null;
                    break L36;
                  }
                }
                return;
              }
            } else {
              if (0 >= ((w) this).field_s) {
                ((w) this).field_s = 0;
                if (!((w) this).field_y) {
                  ((w) this).field_q = 0;
                  if (!((w) this).field_l) {
                    if (((w) this).field_p != null) {
                      ((w) this).field_j.g(2);
                      ((w) this).field_p = null;
                      return;
                    } else {
                      ((w) this).field_p = null;
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
          } else {
            return;
          }
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != 18813) {
            int discarded$0 = ((w) this).a();
            ((w) this).field_k = param0;
            return;
        }
        ((w) this).field_k = param0;
    }

    final synchronized int a() {
        return 2;
    }

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
            for (var1_int = 0; uf.field_g > var1_int; var1_int++) {
                uk.field_M[var1_int] = null;
            }
            uf.field_g = 0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "w.I(" + 0 + 41);
        }
    }

    final gq b() {
        return null;
    }

    public static void a(byte param0) {
        field_z = null;
        field_n = null;
        field_A = null;
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_32_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((w) this).field_k > 0) {
              L1: {
                if (((w) this).field_y) {
                  L2: {
                    if (0 >= ((w) this).field_q) {
                      break L2;
                    } else {
                      if (((w) this).field_j.c(-54)) {
                        break L2;
                      } else {
                        ((w) this).field_p = null;
                        ((w) this).field_y = false;
                        ((w) this).field_q = -((w) this).field_q;
                        break L1;
                      }
                    }
                  }
                  if (((w) this).field_q >= 0) {
                    break L1;
                  } else {
                    if (!((w) this).field_v.c(-103)) {
                      ((w) this).field_o = null;
                      ((w) this).field_q = -((w) this).field_q;
                      ((w) this).field_y = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = (((w) this).field_s >> 12) * ((w) this).field_k / 256;
                var5 = -var4_int + ((w) this).field_k;
                if (((w) this).field_q != 0) {
                  ((w) this).field_s = ((w) this).field_s + ((w) this).field_q * param2;
                  if (((w) this).field_s >= 1048576) {
                    ((w) this).field_s = 1048576;
                    if (((w) this).field_y) {
                      break L3;
                    } else {
                      ((w) this).field_q = 0;
                      if (!((w) this).field_l) {
                        L4: {
                          if (null == ((w) this).field_o) {
                            break L4;
                          } else {
                            ((w) this).field_v.g(2);
                            break L4;
                          }
                        }
                        ((w) this).field_o = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (0 < ((w) this).field_s) {
                      break L3;
                    } else {
                      ((w) this).field_s = 0;
                      if (((w) this).field_y) {
                        break L3;
                      } else {
                        ((w) this).field_q = 0;
                        if (((w) this).field_l) {
                          break L3;
                        } else {
                          L5: {
                            if (null != ((w) this).field_p) {
                              ((w) this).field_j.g(2);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ((w) this).field_p = null;
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (gp.field_j) {
                  stackOut_31_0 = param2 << 1;
                  stackIn_32_0 = stackOut_31_0;
                  break L6;
                } else {
                  stackOut_30_0 = param2;
                  stackIn_32_0 = stackOut_30_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_32_0;
                if (((w) this).field_u < 256) {
                  L8: {
                    if (null != ((w) this).field_p) {
                      break L8;
                    } else {
                      if (((w) this).field_o == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int == 256) {
                    ((w) this).field_j.b(param0, param1, param2);
                    break L7;
                  } else {
                    if (256 == var5) {
                      ((w) this).field_v.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (((w) this).field_w == null) {
                            break L10;
                          } else {
                            if (((w) this).field_w.length < var6) {
                              break L10;
                            } else {
                              d.a(((w) this).field_w, 0, var6);
                              d.a(((w) this).field_r, 0, var6);
                              break L9;
                            }
                          }
                        }
                        ((w) this).field_w = new int[var6];
                        ((w) this).field_r = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((w) this).field_j.b(((w) this).field_w, 0, param2);
                        ((w) this).field_v.b(((w) this).field_r, 0, param2);
                        if (!gp.field_j) {
                          stackOut_45_0 = param1;
                          stackIn_46_0 = stackOut_45_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_44_0 = param1 << 1;
                          stackIn_46_0 = stackOut_44_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_46_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (((w) this).field_r[var8] * var5 + var4_int * ((w) this).field_w[var8] >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                if (((w) this).field_x == null) {
                  break L13;
                } else {
                  if (((w) this).field_u != 0) {
                    L14: {
                      L15: {
                        if (null == ((w) this).field_w) {
                          break L15;
                        } else {
                          if (((w) this).field_w.length >= var6) {
                            d.a(((w) this).field_w, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      ((w) this).field_r = new int[var6];
                      ((w) this).field_w = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((w) this).field_t.b(((w) this).field_w, 0, param2);
                      if (!gp.field_j) {
                        stackOut_61_0 = param1;
                        stackIn_62_0 = stackOut_61_0;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackOut_60_0 = param1 << 1;
                        stackIn_62_0 = stackOut_60_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_62_0;
                    var8 = ((w) this).field_u * ((w) this).field_k / 256;
                    var9 = -var8 + ((w) this).field_k;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var10 + var7] = var8 * ((w) this).field_w[var10] + param0[var10 + var7] * var9 >> 8;
                        var10++;
                        continue L17;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            } else {
              ((w) this).a(param2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var4;
            stackOut_66_1 = new StringBuilder().append("w.F(");
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L18;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L18;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private w() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Ready";
    }
}
