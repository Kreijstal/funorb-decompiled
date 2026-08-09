/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static String field_i;
    private pf field_d;
    static boolean field_b;
    static gq field_g;
    private oh field_e;
    static int field_c;
    static String field_f;
    static String field_a;
    static String field_h;

    final oh c(int param0) {
        oh var2 = this.field_d.field_h.field_e;
        int var3 = -32 % ((25 - param0) / 37);
        if (!(this.field_d.field_h != var2)) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_e;
        return var2;
    }

    final static String a(boolean param0) {
        if (param0) {
            on.a(false);
            if (sc.field_q) {
                return null;
            }
            if ((ri.field_F ^ -1) < (rq.field_e ^ -1)) {
                return null;
            }
            if (!((ri.field_F + de.field_i ^ -1) >= (rq.field_e ^ -1))) {
                return jq.field_d;
            }
            return null;
        }
        if (sc.field_q) {
            return null;
        }
        if ((ri.field_F ^ -1) < (rq.field_e ^ -1)) {
            return null;
        }
        if (!((ri.field_F + de.field_i ^ -1) >= (rq.field_e ^ -1))) {
            return jq.field_d;
        }
        return null;
    }

    final oh b(byte param0) {
        oh var2 = this.field_e;
        if (param0 != -124) {
            field_i = (String) null;
            if (!(this.field_d.field_h != var2)) {
                this.field_e = null;
                return null;
            }
            this.field_e = var2.field_e;
            return var2;
        }
        if (!(this.field_d.field_h != var2)) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_e;
        return var2;
    }

    final oh a(int param0) {
        oh var2 = this.field_d.field_h.field_f;
        if (param0 != 2) {
            field_b = false;
            if (!(this.field_d.field_h != var2)) {
                this.field_e = null;
                return null;
            }
            this.field_e = var2.field_f;
            return var2;
        }
        if (!(this.field_d.field_h != var2)) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_f;
        return var2;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_a = null;
        field_h = null;
        if (param0 != 22256) {
            field_h = (String) null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final oh a(boolean param0, oh param1) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        oh stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = this.field_d.field_h.field_f;
                break L1;
              }
            }
            if (var3 == this.field_d.field_h) {
              this.field_e = null;
              stackIn_6_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  field_c = 27;
                  break L2;
                }
              }
              this.field_e = var3.field_f;
              stackIn_10_0 = (oh) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("on.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (oh) ((Object) stackIn_6_0);
        } else {
          return stackIn_10_0;
        }
    }

    on(pf param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "on.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final oh a(byte param0, oh param1) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        oh stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = -19 / ((param0 - 20) / 59);
              if (param1 == null) {
                var3 = this.field_d.field_h.field_e;
                break L1;
              } else {
                var3 = param1;
                break L1;
              }
            }
            if (this.field_d.field_h == var3) {
              this.field_e = null;
              stackIn_6_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_e = var3.field_e;
              stackIn_8_0 = (oh) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("on.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (oh) ((Object) stackIn_6_0);
        } else {
          return stackIn_8_0;
        }
    }

    final oh a(byte param0) {
        oh var2 = this.field_e;
        if (this.field_d.field_h == var2) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_f;
        if (param0 < 44) {
            on.a(-53, false);
            return var2;
        }
        return var2;
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_106_0 = 0;
        if (ce.field_x == null) {
          if (param0 == 1) {
            if (in.field_g == null) {
              L0: {
                if (!cj.field_x) {
                  break L0;
                } else {
                  if (!cs.field_i) {
                    break L0;
                  } else {
                    L1: {
                      L2: {
                        if (!v.field_b) {
                          break L2;
                        } else {
                          if (!sr.field_h) {
                            break L2;
                          } else {
                            stackIn_94_0 = 1;
                            break L1;
                          }
                        }
                      }
                      stackIn_94_0 = 0;
                      break L1;
                    }
                    L3: {
                      L4: {
                        var2 = stackIn_94_0;
                        if (!param1) {
                          break L4;
                        } else {
                          if (var2 != 0) {
                            break L4;
                          } else {
                            if (!me.a(45)) {
                              break L4;
                            } else {
                              stackIn_99_0 = 1;
                              break L3;
                            }
                          }
                        }
                      }
                      stackIn_99_0 = 0;
                      break L3;
                    }
                    qr.a(stackIn_99_0 != 0, (byte) 112);
                    if (!v.field_b) {
                      break L0;
                    } else {
                      if (sr.field_h) {
                        L5: {
                          L6: {
                            if (!param1) {
                              break L6;
                            } else {
                              if (!me.a(119)) {
                                break L6;
                              } else {
                                stackIn_106_0 = 1;
                                break L5;
                              }
                            }
                          }
                          stackIn_106_0 = 0;
                          break L5;
                        }
                        kh.a(stackIn_106_0 != 0, false);
                        break L0;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              L7: {
                in.field_g.a(param1, param0 ^ -74);
                if (!cj.field_x) {
                  break L7;
                } else {
                  if (!cs.field_i) {
                    break L7;
                  } else {
                    L8: {
                      L9: {
                        if (!v.field_b) {
                          break L9;
                        } else {
                          if (!sr.field_h) {
                            break L9;
                          } else {
                            stackIn_74_0 = 1;
                            break L8;
                          }
                        }
                      }
                      stackIn_74_0 = 0;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var2 = stackIn_74_0;
                        if (!param1) {
                          break L11;
                        } else {
                          if (var2 != 0) {
                            break L11;
                          } else {
                            if (!me.a(45)) {
                              break L11;
                            } else {
                              stackIn_79_0 = 1;
                              break L10;
                            }
                          }
                        }
                      }
                      stackIn_79_0 = 0;
                      break L10;
                    }
                    qr.a(stackIn_79_0 != 0, (byte) 112);
                    if (!v.field_b) {
                      break L7;
                    } else {
                      if (sr.field_h) {
                        L12: {
                          L13: {
                            if (!param1) {
                              break L13;
                            } else {
                              if (!me.a(119)) {
                                break L13;
                              } else {
                                stackIn_86_0 = 1;
                                break L12;
                              }
                            }
                          }
                          stackIn_86_0 = 0;
                          break L12;
                        }
                        kh.a(stackIn_86_0 != 0, false);
                        break L7;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          ce.field_x.a(param1, 81);
          if (param0 == 1) {
            if (in.field_g != null) {
              in.field_g.a(param1, param0 ^ -74);
              if (cj.field_x) {
                if (cs.field_i) {
                  if (v.field_b) {
                    L14: {
                      if (!sr.field_h) {
                        stackIn_51_0 = 0;
                        break L14;
                      } else {
                        stackIn_51_0 = 1;
                        break L14;
                      }
                    }
                    L15: {
                      L16: {
                        var2 = stackIn_51_0;
                        if (!param1) {
                          break L16;
                        } else {
                          if (var2 != 0) {
                            break L16;
                          } else {
                            if (!me.a(45)) {
                              break L16;
                            } else {
                              stackIn_56_0 = 1;
                              break L15;
                            }
                          }
                        }
                      }
                      stackIn_56_0 = 0;
                      break L15;
                    }
                    L17: {
                      qr.a(stackIn_56_0 != 0, (byte) 112);
                      if (!v.field_b) {
                        break L17;
                      } else {
                        if (sr.field_h) {
                          L18: {
                            L19: {
                              if (!param1) {
                                break L19;
                              } else {
                                if (!me.a(119)) {
                                  break L19;
                                } else {
                                  stackIn_63_0 = 1;
                                  break L18;
                                }
                              }
                            }
                            stackIn_63_0 = 0;
                            break L18;
                          }
                          kh.a(stackIn_63_0 != 0, false);
                          break L17;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    L20: {
                      L21: {
                        var2 = 0;
                        if (!param1) {
                          break L21;
                        } else {
                          if (var2 != 0) {
                            break L21;
                          } else {
                            if (!me.a(45)) {
                              break L21;
                            } else {
                              stackIn_39_0 = 1;
                              break L20;
                            }
                          }
                        }
                      }
                      stackIn_39_0 = 0;
                      break L20;
                    }
                    L22: {
                      qr.a(stackIn_39_0 != 0, (byte) 112);
                      if (!v.field_b) {
                        break L22;
                      } else {
                        if (sr.field_h) {
                          L23: {
                            L24: {
                              if (!param1) {
                                break L24;
                              } else {
                                if (!me.a(119)) {
                                  break L24;
                                } else {
                                  stackIn_46_0 = 1;
                                  break L23;
                                }
                              }
                            }
                            stackIn_46_0 = 0;
                            break L23;
                          }
                          kh.a(stackIn_46_0 != 0, false);
                          break L22;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (cj.field_x) {
                if (cs.field_i) {
                  L25: {
                    L26: {
                      if (!v.field_b) {
                        break L26;
                      } else {
                        if (!sr.field_h) {
                          break L26;
                        } else {
                          stackIn_14_0 = 1;
                          break L25;
                        }
                      }
                    }
                    stackIn_14_0 = 0;
                    break L25;
                  }
                  L27: {
                    L28: {
                      var2 = stackIn_14_0;
                      if (!param1) {
                        break L28;
                      } else {
                        if (var2 != 0) {
                          break L28;
                        } else {
                          if (!me.a(45)) {
                            break L28;
                          } else {
                            stackIn_19_0 = 1;
                            break L27;
                          }
                        }
                      }
                    }
                    stackIn_19_0 = 0;
                    break L27;
                  }
                  L29: {
                    qr.a(stackIn_19_0 != 0, (byte) 112);
                    if (!v.field_b) {
                      break L29;
                    } else {
                      if (sr.field_h) {
                        L30: {
                          L31: {
                            if (!param1) {
                              break L31;
                            } else {
                              if (!me.a(119)) {
                                break L31;
                              } else {
                                stackIn_27_0 = 1;
                                break L30;
                              }
                            }
                          }
                          stackIn_27_0 = 0;
                          break L30;
                        }
                        kh.a(stackIn_27_0 != 0, false);
                        break L29;
                      } else {
                        return;
                      }
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
            return;
          }
        }
    }

    static {
        field_i = "Email (Login):";
        field_a = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_f = "Enter name of friend to delete from list";
        field_g = new gq(0, 2, 2, 1);
        field_h = "Loading fonts";
    }
}
