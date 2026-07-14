/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aqa implements ntb {
    private boolean field_d;
    private tbb field_b;
    private gqb field_c;
    static String[] field_a;

    final int c(int param0) {
        if (!(((aqa) this).field_c == null)) {
            return ((aqa) this).field_c.field_c;
        }
        if (param0 != 0) {
            ((aqa) this).field_d = false;
            return 0;
        }
        return 0;
    }

    private final void a(pe param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, anb param8) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param3 != 0) {
          return;
        } else {
          L0: {
            var10 = ((aqa) this).a(param6, false) * param1 >> -1600749560;
            var11 = var10 * fc.a(param2, (byte) 31) >> 755971176;
            var12 = var10 * eu.a(param2, param3 ^ 50) >> -1347339608;
            param8.a(var12, param4, param7, (byte) -117, var11);
            if (veb.field_b != 0) {
              break L0;
            } else {
              if ((param6 ^ -1) != -47) {
                param0.a(1, -var11 >> ina.field_p, 0, slb.field_a, 30273, param4, 0, param7, -var12 >> ina.field_p);
                break L0;
              } else {
                param0.a(5, -var11 >> ina.field_p, 0, slb.field_a, 30273, param4, 1024, param7, -var12 >> ina.field_p);
                break L0;
              }
            }
          }
          L1: {
            if (((aqa) this).field_b == null) {
              break L1;
            } else {
              if (!param0.c((byte) -86)) {
                ((aqa) this).field_b.a((byte) 98, 16);
                break L1;
              } else {
                break L1;
              }
            }
          }
          return;
        }
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        if (((aqa) this).field_b != null) {
            ((aqa) this).field_b.a(98);
        }
    }

    final void a(boolean param0, int param1) {
        L0: {
          if (veb.field_b == 0) {
            param0 = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == 1024) {
          if (param0) {
            if (((aqa) this).field_b != null) {
              if (!param0) {
                if (null == ((aqa) this).field_b) {
                  return;
                } else {
                  ((aqa) this).field_b = null;
                  return;
                }
              } else {
                return;
              }
            } else {
              ((aqa) this).field_b = new tbb();
              return;
            }
          } else {
            if (null == ((aqa) this).field_b) {
              return;
            } else {
              ((aqa) this).field_b = null;
              return;
            }
          }
        } else {
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        Object var3 = null;
        aqa var3_ref = null;
        int var4 = 0;
        var3 = null;
        var4 = -36 % ((22 - param0) / 59);
        var3_ref = (aqa) (Object) param1;
        gqb discarded$3 = var3_ref.field_c;
        if (null == var3_ref.field_c) {
          tbb discarded$4 = var3_ref.field_b;
          if (null != var3_ref.field_b) {
            if (var3_ref.field_b.a((byte) -44, (tv) (Object) var3_ref.field_b)) {
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          if (!var3_ref.field_c.a((byte) -83, (tv) (Object) var3_ref.field_c)) {
            tbb discarded$5 = var3_ref.field_b;
            if (null != var3_ref.field_b) {
              if (!var3_ref.field_b.a((byte) -44, (tv) (Object) var3_ref.field_b)) {
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

    public final void b(faa param0, int param1) {
        Object var4 = null;
        faa stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        faa stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        faa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        faa stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        faa stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        faa stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        faa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        faa stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        L0: {
          stackOut_0_0 = (faa) param0;
          stackOut_0_1 = 53;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (((aqa) this).field_c == null) {
            stackOut_2_0 = (faa) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (faa) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        L1: {
          if (vq.a(stackIn_3_0, stackIn_3_1, stackIn_3_2 != 0)) {
            ((aqa) this).field_c.b(param0, -123);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          stackOut_6_0 = (faa) param0;
          stackOut_6_1 = 87;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          if (null == ((aqa) this).field_b) {
            stackOut_8_0 = (faa) (Object) stackIn_8_0;
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            break L2;
          } else {
            stackOut_7_0 = (faa) (Object) stackIn_7_0;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            break L2;
          }
        }
        if (vq.a(stackIn_9_0, stackIn_9_1, stackIn_9_2 == 0)) {
          if (param1 >= -109) {
            var4 = null;
            ((aqa) this).a((tv) null, -102);
            return;
          } else {
            return;
          }
        } else {
          ((aqa) this).field_b.b(param0, -126);
          if (param1 < -109) {
            return;
          } else {
            var4 = null;
            ((aqa) this).a((tv) null, -102);
            return;
          }
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        Object var5 = null;
        aqa var5_ref = null;
        var5 = null;
        var5_ref = (aqa) (Object) param0;
        if (param1 <= -19) {
          if (var5_ref.field_c != null) {
            if (var5_ref.field_c != null) {
              L0: {
                var5_ref.field_c.a((tv) (Object) var5_ref.field_c, -100);
                if (var5_ref.field_b == null) {
                  break L0;
                } else {
                  if (null != var5_ref.field_b) {
                    var5_ref.field_b.a((tv) (Object) var5_ref.field_b, -61);
                    break L0;
                  } else {
                    var4 = 0;
                    gqb discarded$18 = var5_ref.field_c;
                    L1: {
                      if (null == var5_ref.field_c) {
                        break L1;
                      } else {
                        if (!var5_ref.field_c.a((byte) 81, (tv) (Object) var5_ref.field_c)) {
                          break L1;
                        } else {
                          System.out.println("TimedSpecialOrderBehaviour timer has changed. before=" + var5_ref.field_c + ", now=" + var5_ref.field_c);
                          var4 = 1;
                          break L1;
                        }
                      }
                    }
                    tbb discarded$19 = var5_ref.field_b;
                    L2: {
                      if (null == var5_ref.field_b) {
                        break L2;
                      } else {
                        if (!var5_ref.field_b.a((byte) 91, (tv) (Object) var5_ref.field_b)) {
                          break L2;
                        } else {
                          var4 = 1;
                          System.out.println("TrailHolder trail has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                          break L2;
                        }
                      }
                    }
                    L3: {
                      if (var4 == 0) {
                        break L3;
                      } else {
                        System.out.println("This instance of ThrusterBehaviour has changed");
                        break L3;
                      }
                    }
                    return;
                  }
                }
              }
              var4 = 0;
              gqb discarded$20 = var5_ref.field_c;
              if (null != var5_ref.field_c) {
                if (!var5_ref.field_c.a((byte) 81, (tv) (Object) var5_ref.field_c)) {
                  tbb discarded$21 = var5_ref.field_b;
                  L4: {
                    if (null == var5_ref.field_b) {
                      break L4;
                    } else {
                      if (!var5_ref.field_b.a((byte) 91, (tv) (Object) var5_ref.field_b)) {
                        break L4;
                      } else {
                        var4 = 1;
                        System.out.println("TrailHolder trail has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var4 == 0) {
                      break L5;
                    } else {
                      System.out.println("This instance of ThrusterBehaviour has changed");
                      break L5;
                    }
                  }
                  return;
                } else {
                  System.out.println("TimedSpecialOrderBehaviour timer has changed. before=" + var5_ref.field_c + ", now=" + var5_ref.field_c);
                  var4 = 1;
                  tbb discarded$22 = var5_ref.field_b;
                  L6: {
                    if (null == var5_ref.field_b) {
                      break L6;
                    } else {
                      if (!var5_ref.field_b.a((byte) 91, (tv) (Object) var5_ref.field_b)) {
                        break L6;
                      } else {
                        var4 = 1;
                        System.out.println("TrailHolder trail has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var4 == 0) {
                      break L7;
                    } else {
                      System.out.println("This instance of ThrusterBehaviour has changed");
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                tbb discarded$23 = var5_ref.field_b;
                L8: {
                  if (null == var5_ref.field_b) {
                    break L8;
                  } else {
                    if (!var5_ref.field_b.a((byte) 91, (tv) (Object) var5_ref.field_b)) {
                      break L8;
                    } else {
                      var4 = 1;
                      System.out.println("TrailHolder trail has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                      break L8;
                    }
                  }
                }
                L9: {
                  if (var4 == 0) {
                    break L9;
                  } else {
                    System.out.println("This instance of ThrusterBehaviour has changed");
                    break L9;
                  }
                }
                return;
              }
            } else {
              L10: {
                if (var5_ref.field_b == null) {
                  break L10;
                } else {
                  if (null != var5_ref.field_b) {
                    var5_ref.field_b.a((tv) (Object) var5_ref.field_b, -61);
                    break L10;
                  } else {
                    var4 = 0;
                    gqb discarded$24 = var5_ref.field_c;
                    L11: {
                      if (null == var5_ref.field_c) {
                        break L11;
                      } else {
                        if (!var5_ref.field_c.a((byte) 81, (tv) (Object) var5_ref.field_c)) {
                          break L11;
                        } else {
                          System.out.println("TimedSpecialOrderBehaviour timer has changed. before=" + var5_ref.field_c + ", now=" + var5_ref.field_c);
                          var4 = 1;
                          break L11;
                        }
                      }
                    }
                    tbb discarded$25 = var5_ref.field_b;
                    L12: {
                      if (null == var5_ref.field_b) {
                        break L12;
                      } else {
                        if (!var5_ref.field_b.a((byte) 91, (tv) (Object) var5_ref.field_b)) {
                          break L12;
                        } else {
                          var4 = 1;
                          System.out.println("TrailHolder trail has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (var4 == 0) {
                        break L13;
                      } else {
                        System.out.println("This instance of ThrusterBehaviour has changed");
                        break L13;
                      }
                    }
                    return;
                  }
                }
              }
              var4 = 0;
              gqb discarded$26 = var5_ref.field_c;
              if (null != var5_ref.field_c) {
                if (!var5_ref.field_c.a((byte) 81, (tv) (Object) var5_ref.field_c)) {
                  tbb discarded$27 = var5_ref.field_b;
                  L14: {
                    if (null == var5_ref.field_b) {
                      break L14;
                    } else {
                      if (!var5_ref.field_b.a((byte) 91, (tv) (Object) var5_ref.field_b)) {
                        break L14;
                      } else {
                        var4 = 1;
                        System.out.println("TrailHolder trail has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (var4 == 0) {
                      break L15;
                    } else {
                      System.out.println("This instance of ThrusterBehaviour has changed");
                      break L15;
                    }
                  }
                  return;
                } else {
                  System.out.println("TimedSpecialOrderBehaviour timer has changed. before=" + var5_ref.field_c + ", now=" + var5_ref.field_c);
                  var4 = 1;
                  tbb discarded$28 = var5_ref.field_b;
                  L16: {
                    if (null == var5_ref.field_b) {
                      break L16;
                    } else {
                      if (!var5_ref.field_b.a((byte) 91, (tv) (Object) var5_ref.field_b)) {
                        break L16;
                      } else {
                        var4 = 1;
                        System.out.println("TrailHolder trail has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                        break L16;
                      }
                    }
                  }
                  L17: {
                    if (var4 == 0) {
                      break L17;
                    } else {
                      System.out.println("This instance of ThrusterBehaviour has changed");
                      break L17;
                    }
                  }
                  return;
                }
              } else {
                tbb discarded$29 = var5_ref.field_b;
                L18: {
                  if (null == var5_ref.field_b) {
                    break L18;
                  } else {
                    if (!var5_ref.field_b.a((byte) 91, (tv) (Object) var5_ref.field_b)) {
                      break L18;
                    } else {
                      var4 = 1;
                      System.out.println("TrailHolder trail has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                      break L18;
                    }
                  }
                }
                L19: {
                  if (var4 == 0) {
                    break L19;
                  } else {
                    System.out.println("This instance of ThrusterBehaviour has changed");
                    break L19;
                  }
                }
                return;
              }
            }
          } else {
            L20: {
              if (var5_ref.field_b == null) {
                break L20;
              } else {
                if (null != var5_ref.field_b) {
                  var5_ref.field_b.a((tv) (Object) var5_ref.field_b, -61);
                  break L20;
                } else {
                  var4 = 0;
                  gqb discarded$30 = var5_ref.field_c;
                  L21: {
                    if (null == var5_ref.field_c) {
                      break L21;
                    } else {
                      if (!var5_ref.field_c.a((byte) 81, (tv) (Object) var5_ref.field_c)) {
                        break L21;
                      } else {
                        System.out.println("TimedSpecialOrderBehaviour timer has changed. before=" + var5_ref.field_c + ", now=" + var5_ref.field_c);
                        var4 = 1;
                        break L21;
                      }
                    }
                  }
                  tbb discarded$31 = var5_ref.field_b;
                  L22: {
                    if (null == var5_ref.field_b) {
                      break L22;
                    } else {
                      if (!var5_ref.field_b.a((byte) 91, (tv) (Object) var5_ref.field_b)) {
                        break L22;
                      } else {
                        var4 = 1;
                        System.out.println("TrailHolder trail has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (var4 == 0) {
                      break L23;
                    } else {
                      System.out.println("This instance of ThrusterBehaviour has changed");
                      break L23;
                    }
                  }
                  return;
                }
              }
            }
            var4 = 0;
            gqb discarded$32 = var5_ref.field_c;
            if (null != var5_ref.field_c) {
              if (!var5_ref.field_c.a((byte) 81, (tv) (Object) var5_ref.field_c)) {
                tbb discarded$33 = var5_ref.field_b;
                L24: {
                  if (null == var5_ref.field_b) {
                    break L24;
                  } else {
                    if (!var5_ref.field_b.a((byte) 91, (tv) (Object) var5_ref.field_b)) {
                      break L24;
                    } else {
                      var4 = 1;
                      System.out.println("TrailHolder trail has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                      break L24;
                    }
                  }
                }
                L25: {
                  if (var4 == 0) {
                    break L25;
                  } else {
                    System.out.println("This instance of ThrusterBehaviour has changed");
                    break L25;
                  }
                }
                return;
              } else {
                System.out.println("TimedSpecialOrderBehaviour timer has changed. before=" + var5_ref.field_c + ", now=" + var5_ref.field_c);
                var4 = 1;
                tbb discarded$34 = var5_ref.field_b;
                L26: {
                  if (null == var5_ref.field_b) {
                    break L26;
                  } else {
                    if (!var5_ref.field_b.a((byte) 91, (tv) (Object) var5_ref.field_b)) {
                      break L26;
                    } else {
                      var4 = 1;
                      System.out.println("TrailHolder trail has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                      break L26;
                    }
                  }
                }
                L27: {
                  if (var4 == 0) {
                    break L27;
                  } else {
                    System.out.println("This instance of ThrusterBehaviour has changed");
                    break L27;
                  }
                }
                return;
              }
            } else {
              tbb discarded$35 = var5_ref.field_b;
              L28: {
                if (null == var5_ref.field_b) {
                  break L28;
                } else {
                  if (!var5_ref.field_b.a((byte) 91, (tv) (Object) var5_ref.field_b)) {
                    break L28;
                  } else {
                    var4 = 1;
                    System.out.println("TrailHolder trail has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                    break L28;
                  }
                }
              }
              L29: {
                if (var4 == 0) {
                  break L29;
                } else {
                  System.out.println("This instance of ThrusterBehaviour has changed");
                  break L29;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        aqa var3 = null;
        aqa var4 = null;
        L0: {
          var4 = (aqa) (Object) param1;
          var3 = var4;
          if (null != var4.field_c) {
            L1: {
              if (var3.field_c == null) {
                var3.field_c = new gqb();
                break L1;
              } else {
                break L1;
              }
            }
            var4.field_c.b((byte) 102, (tv) (Object) var3.field_c);
            break L0;
          } else {
            var4.field_c = null;
            break L0;
          }
        }
        ((aqa) this).field_d = false;
        var3.field_b = var4.field_b;
        if (param0 < 54) {
          aqa.b(-40);
          var3.field_d = false;
          return;
        } else {
          var3.field_d = false;
          return;
        }
    }

    final void b(boolean param0) {
        tbb var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        if (!((aqa) this).field_d) {
          if (null == ((aqa) this).field_b) {
            return;
          } else {
            L0: {
              var2 = ((aqa) this).field_b;
              ((aqa) this).field_b = new tbb();
              var2.b((byte) 112, (tv) (Object) ((aqa) this).field_b);
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!param0) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L0;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L0;
              }
            }
            ((aqa) this).field_d = stackIn_6_1 != 0;
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != -61) {
          L0: {
            ((aqa) this).field_d = false;
            if (param0 != 46) {
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
            if (param0 != 46) {
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

    final void a(byte param0, int param1, lta param2, int[] param3) {
        if (param0 != -116) {
          L0: {
            ((aqa) this).a(false, -52);
            if (((aqa) this).field_b != null) {
              ((aqa) this).field_b.a(param2, 1325107016, param1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((aqa) this).field_b != null) {
              ((aqa) this).field_b.a(param2, 1325107016, param1);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, anb param1, int param2) {
        uj var4 = null;
        if (46 == param0) {
          if (!(param1 instanceof sg)) {
            var4 = pca.field_i[5];
            if (((aqa) this).field_c.field_c > var4.d((byte) 64)) {
              ((aqa) this).field_c.field_c = var4.d((byte) 64);
              param1.d((byte) -55);
              if (param2 != -24213) {
                ((aqa) this).field_b = null;
                return;
              } else {
                return;
              }
            } else {
              if (param2 != -24213) {
                ((aqa) this).field_b = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param2 != -24213) {
              ((aqa) this).field_b = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 != -24213) {
            ((aqa) this).field_b = null;
            return;
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 > -52) {
            boolean discarded$0 = aqa.a(115);
        }
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        var3 = param0;
        if (-47 != (var3 ^ -1)) {
          if (var3 != 13) {
            if (var3 != 12) {
              if (param1) {
                return 127;
              } else {
                return 0;
              }
            } else {
              return clb.field_a;
            }
          } else {
            return pwa.field_b;
          }
        } else {
          return enb.field_c;
        }
    }

    final static boolean a(int param0) {
        if (param0 > -53) {
            return false;
        }
        return ho.field_a.a(true);
    }

    public aqa() {
    }

    final void a(boolean param0, anb param1, int param2, int param3, int param4, int[] param5, int param6, int param7, pe param8) {
        int var10 = 0;
        L0: {
          if (!oua.field_a) {
            break L0;
          } else {
            if (null == ((aqa) this).field_b) {
              break L0;
            } else {
              if (param8.c((byte) 33)) {
                break L0;
              } else {
                ((aqa) this).field_b.a((byte) -128);
                ((aqa) this).field_b.a(param5[3], param5[2], (byte) -125, param5[4], param5[2] - -param5[4] >> -1002476799, param5[5], param5[3] + param5[5] >> -603423519);
                break L0;
              }
            }
          }
        }
        if (-47 == (param4 ^ -1)) {
          var10 = pca.field_i[5].d((byte) 64);
          if (param0) {
            L1: {
              if (((aqa) this).field_c.field_c <= var10) {
                break L1;
              } else {
                ((aqa) this).field_c.field_c = var10;
                param1.d((byte) -82);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (0 >= ((aqa) this).field_c.field_c) {
                break L2;
              } else {
                ((aqa) this).field_c.field_c = ((aqa) this).field_c.field_c - 1;
                param1.d((byte) -128);
                break L2;
              }
            }
            L3: {
              if (((aqa) this).field_c.field_c > var10) {
                rmb.a(param3, param1.field_l + param8.d(1000).length, 2, -64, param7);
                this.a(param8, 256, param2, param6 + 31501, param7, param5, param4, param3, param1);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param6 == -31501) {
                break L4;
              } else {
                ((aqa) this).field_c = null;
                break L4;
              }
            }
            return;
          }
        } else {
          L5: {
            if (param6 == -31501) {
              break L5;
            } else {
              ((aqa) this).field_c = null;
              break L5;
            }
          }
          return;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, anb param5, int[] param6, int[] param7, pe param8, int param9, int param10, int param11, int param12, int param13) {
        uj var16 = null;
        if (-47 != (param13 ^ -1)) {
            if (!(param13 == 12)) {
                rmb.a(param3, param5.field_l, 69, 87, param2);
            }
            this.a(param8, param11, param9, 0, param2, param7, param13, param3, param5);
        } else {
            if (((aqa) this).field_c.field_c <= 0) {
                var16 = pca.field_i[5];
                ((aqa) this).field_c.field_c = var16.d((byte) 64) + var16.b(-25131);
                param5.d((byte) -57);
            }
        }
        if (!param0) {
            boolean discarded$0 = aqa.a(-31);
        }
    }

    public final void a(faa param0, boolean param1) {
        int var4 = 0;
        Object var5 = null;
        var4 = VoidHunters.field_G;
        if (!param1) {
          if (!kv.a(param1, param0)) {
            ((aqa) this).field_c = null;
            if (!kv.a(param1, param0)) {
              ((aqa) this).field_b = null;
              return;
            } else {
              ((aqa) this).field_b = new tbb();
              ((aqa) this).field_b.a(param0, false);
              return;
            }
          } else {
            L0: {
              if (null == ((aqa) this).field_c) {
                ((aqa) this).field_c = new gqb();
                break L0;
              } else {
                break L0;
              }
            }
            ((aqa) this).field_c.a(param0, false);
            if (!kv.a(param1, param0)) {
              ((aqa) this).field_b = null;
              return;
            } else {
              ((aqa) this).field_b = new tbb();
              ((aqa) this).field_b.a(param0, false);
              return;
            }
          }
        } else {
          L1: {
            var5 = null;
            boolean discarded$1 = ((aqa) this).a((byte) 111, (tv) null);
            if (!kv.a(param1, param0)) {
              ((aqa) this).field_c = null;
              break L1;
            } else {
              L2: {
                if (null == ((aqa) this).field_c) {
                  ((aqa) this).field_c = new gqb();
                  break L2;
                } else {
                  break L2;
                }
              }
              ((aqa) this).field_c.a(param0, false);
              break L1;
            }
          }
          if (!kv.a(param1, param0)) {
            ((aqa) this).field_b = null;
            return;
          } else {
            ((aqa) this).field_b = new tbb();
            ((aqa) this).field_b.a(param0, false);
            return;
          }
        }
    }

    aqa(int param0) {
        if (-47 == (param0 ^ -1)) {
            ((aqa) this).field_c = new gqb();
        }
    }

    static {
    }
}
