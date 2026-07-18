/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static vo field_a;
    static String field_b;
    static String field_d;
    static String field_e;
    static int field_c;
    static int field_f;

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -43) {
          we.a((byte) 95);
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    final static int a(int param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (!param1) {
          param0 = param0 & 8191;
          if (param0 < 4096) {
            L0: {
              if (param0 < 2048) {
                stackOut_18_0 = mg.field_b[2048 - param0];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -mg.field_b[param0 + -2048];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param0 < 6144) {
                stackOut_14_0 = -mg.field_b[6144 - param0];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = mg.field_b[-6144 + param0];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          we.a((byte) 50);
          param0 = param0 & 8191;
          if (param0 < 4096) {
            L2: {
              if (param0 < 2048) {
                stackOut_8_0 = mg.field_b[2048 - param0];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -mg.field_b[param0 + -2048];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param0 < 6144) {
                stackOut_4_0 = -mg.field_b[6144 - param0];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = mg.field_b[-6144 + param0];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static void a(boolean param0, boolean param1, byte param2, int param3) {
        hd stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        hd stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        hd stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        hd stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        hd stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        hd stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        hd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        hd stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        hd stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        hd stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        hd stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        hd stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        hd stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        hd stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        hd stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        hd stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        hd stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        hd stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        hd stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        hd stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        hd stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        hd stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        hd stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        hd stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        hd stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        hd stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        hd stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        hd stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        hd stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        hd stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        hd stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        hd stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        hd stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        hd stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        hd stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        hd stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        hd stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        hd stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        hd stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        hd stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        hd stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        hd stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        hd stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        hd stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        hd stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        hd stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        hd stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        hd stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        hd stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        hd stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        hd stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        hd stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        hd stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        hd stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        hd stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        hd stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        hd stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        hd stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        hd stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        hd stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        hd stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        hd stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        hd stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        hd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        hd stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        hd stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        hd stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        hd stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        hd stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        hd stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        hd stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        hd stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        hd stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        hd stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        hd stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        hd stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        pa.b((byte) 123);
        if (mi.field_d >= 0) {
          L0: {
            L1: {
              li.field_a.field_E = vo.a((byte) -18, id.field_r, new String[1]);
              stackOut_66_0 = ss.field_c;
              stackOut_66_1 = 0;
              stackIn_72_0 = stackOut_66_0;
              stackIn_72_1 = stackOut_66_1;
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              if (!param0) {
                break L1;
              } else {
                stackOut_67_0 = (hd) (Object) stackIn_67_0;
                stackOut_67_1 = stackIn_67_1;
                stackIn_72_0 = stackOut_67_0;
                stackIn_72_1 = stackOut_67_1;
                stackIn_68_0 = stackOut_67_0;
                stackIn_68_1 = stackOut_67_1;
                if (param1) {
                  break L1;
                } else {
                  stackOut_68_0 = (hd) (Object) stackIn_68_0;
                  stackOut_68_1 = stackIn_68_1;
                  stackIn_72_0 = stackOut_68_0;
                  stackIn_72_1 = stackOut_68_1;
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  if (qv.field_f) {
                    break L1;
                  } else {
                    stackOut_69_0 = (hd) (Object) stackIn_69_0;
                    stackOut_69_1 = stackIn_69_1;
                    stackIn_72_0 = stackOut_69_0;
                    stackIn_72_1 = stackOut_69_1;
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    if (uv.field_i != null) {
                      break L1;
                    } else {
                      stackOut_70_0 = (hd) (Object) stackIn_70_0;
                      stackOut_70_1 = stackIn_70_1;
                      stackIn_72_0 = stackOut_70_0;
                      stackIn_72_1 = stackOut_70_1;
                      stackIn_71_0 = stackOut_70_0;
                      stackIn_71_1 = stackOut_70_1;
                      if (null != ow.field_b) {
                        break L1;
                      } else {
                        stackOut_71_0 = (hd) (Object) stackIn_71_0;
                        stackOut_71_1 = stackIn_71_1;
                        stackOut_71_2 = 1;
                        stackIn_73_0 = stackOut_71_0;
                        stackIn_73_1 = stackOut_71_1;
                        stackIn_73_2 = stackOut_71_2;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_72_0 = (hd) (Object) stackIn_72_0;
            stackOut_72_1 = stackIn_72_1;
            stackOut_72_2 = 0;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            stackIn_73_2 = stackOut_72_2;
            break L0;
          }
          L2: {
            L3: {
              ((hd) (Object) stackIn_73_0).b(stackIn_73_1, stackIn_73_2 != 0);
              stackOut_73_0 = af.field_d;
              stackOut_73_1 = 0;
              stackIn_79_0 = stackOut_73_0;
              stackIn_79_1 = stackOut_73_1;
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              if (!param0) {
                break L3;
              } else {
                stackOut_74_0 = (hd) (Object) stackIn_74_0;
                stackOut_74_1 = stackIn_74_1;
                stackIn_79_0 = stackOut_74_0;
                stackIn_79_1 = stackOut_74_1;
                stackIn_75_0 = stackOut_74_0;
                stackIn_75_1 = stackOut_74_1;
                if (param1) {
                  break L3;
                } else {
                  stackOut_75_0 = (hd) (Object) stackIn_75_0;
                  stackOut_75_1 = stackIn_75_1;
                  stackIn_79_0 = stackOut_75_0;
                  stackIn_79_1 = stackOut_75_1;
                  stackIn_76_0 = stackOut_75_0;
                  stackIn_76_1 = stackOut_75_1;
                  if (qv.field_f) {
                    break L3;
                  } else {
                    stackOut_76_0 = (hd) (Object) stackIn_76_0;
                    stackOut_76_1 = stackIn_76_1;
                    stackIn_79_0 = stackOut_76_0;
                    stackIn_79_1 = stackOut_76_1;
                    stackIn_77_0 = stackOut_76_0;
                    stackIn_77_1 = stackOut_76_1;
                    if (uv.field_i != null) {
                      break L3;
                    } else {
                      stackOut_77_0 = (hd) (Object) stackIn_77_0;
                      stackOut_77_1 = stackIn_77_1;
                      stackIn_79_0 = stackOut_77_0;
                      stackIn_79_1 = stackOut_77_1;
                      stackIn_78_0 = stackOut_77_0;
                      stackIn_78_1 = stackOut_77_1;
                      if (ow.field_b != null) {
                        break L3;
                      } else {
                        stackOut_78_0 = (hd) (Object) stackIn_78_0;
                        stackOut_78_1 = stackIn_78_1;
                        stackOut_78_2 = 1;
                        stackIn_80_0 = stackOut_78_0;
                        stackIn_80_1 = stackOut_78_1;
                        stackIn_80_2 = stackOut_78_2;
                        break L2;
                      }
                    }
                  }
                }
              }
            }
            stackOut_79_0 = (hd) (Object) stackIn_79_0;
            stackOut_79_1 = stackIn_79_1;
            stackOut_79_2 = 0;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            stackIn_80_2 = stackOut_79_2;
            break L2;
          }
          L4: {
            L5: {
              ((hd) (Object) stackIn_80_0).b(stackIn_80_1, stackIn_80_2 != 0);
              stackOut_80_0 = kk.field_j;
              stackOut_80_1 = 0;
              stackIn_84_0 = stackOut_80_0;
              stackIn_84_1 = stackOut_80_1;
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              if (!param0) {
                break L5;
              } else {
                stackOut_81_0 = (hd) (Object) stackIn_81_0;
                stackOut_81_1 = stackIn_81_1;
                stackIn_84_0 = stackOut_81_0;
                stackIn_84_1 = stackOut_81_1;
                stackIn_82_0 = stackOut_81_0;
                stackIn_82_1 = stackOut_81_1;
                if (param1) {
                  break L5;
                } else {
                  stackOut_82_0 = (hd) (Object) stackIn_82_0;
                  stackOut_82_1 = stackIn_82_1;
                  stackIn_84_0 = stackOut_82_0;
                  stackIn_84_1 = stackOut_82_1;
                  stackIn_83_0 = stackOut_82_0;
                  stackIn_83_1 = stackOut_82_1;
                  if (!qv.field_f) {
                    break L5;
                  } else {
                    stackOut_83_0 = (hd) (Object) stackIn_83_0;
                    stackOut_83_1 = stackIn_83_1;
                    stackOut_83_2 = 1;
                    stackIn_85_0 = stackOut_83_0;
                    stackIn_85_1 = stackOut_83_1;
                    stackIn_85_2 = stackOut_83_2;
                    break L4;
                  }
                }
              }
            }
            stackOut_84_0 = (hd) (Object) stackIn_84_0;
            stackOut_84_1 = stackIn_84_1;
            stackOut_84_2 = 0;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            stackIn_85_2 = stackOut_84_2;
            break L4;
          }
          ((hd) (Object) stackIn_85_0).b(stackIn_85_1, stackIn_85_2 != 0);
          tn.field_d.field_b.h((byte) 47);
          if (rg.field_a.field_sb == 0) {
            if (dr.field_d.field_sb != 0) {
              if (fv.field_d) {
                L6: {
                  ov.a(-43, 11);
                  if (ps.field_b.field_sb == 0) {
                    break L6;
                  } else {
                    L7: {
                      if (1 != rn.field_d.length) {
                        break L7;
                      } else {
                        if (rn.field_d[0] == ir.field_D) {
                          break L7;
                        } else {
                          L8: {
                            ir.field_D = rn.field_d[0];
                            oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                            if (ao.field_a.field_sb != 0) {
                              qv.field_f = false;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          return;
                        }
                      }
                    }
                    oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                    break L6;
                  }
                }
                L9: {
                  if (ao.field_a.field_sb != 0) {
                    qv.field_f = false;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return;
              } else {
                if (eq.field_d > 0) {
                  L10: {
                    ov.a(-43, 11);
                    if (ps.field_b.field_sb == 0) {
                      break L10;
                    } else {
                      L11: {
                        if (1 != rn.field_d.length) {
                          break L11;
                        } else {
                          if (rn.field_d[0] == ir.field_D) {
                            break L11;
                          } else {
                            L12: {
                              ir.field_D = rn.field_d[0];
                              oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                              if (ao.field_a.field_sb != 0) {
                                qv.field_f = false;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            return;
                          }
                        }
                      }
                      oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                      break L10;
                    }
                  }
                  L13: {
                    if (ao.field_a.field_sb != 0) {
                      qv.field_f = false;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  return;
                } else {
                  if (tk.field_Ib >= 2) {
                    if (ne.field_G[12]) {
                      L14: {
                        ov.a(-43, 11);
                        if (ps.field_b.field_sb == 0) {
                          break L14;
                        } else {
                          L15: {
                            if (1 != rn.field_d.length) {
                              break L15;
                            } else {
                              if (rn.field_d[0] == ir.field_D) {
                                break L15;
                              } else {
                                L16: {
                                  ir.field_D = rn.field_d[0];
                                  oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                                  if (ao.field_a.field_sb != 0) {
                                    qv.field_f = false;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                return;
                              }
                            }
                          }
                          oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                          break L14;
                        }
                      }
                      L17: {
                        if (ao.field_a.field_sb != 0) {
                          qv.field_f = false;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      return;
                    } else {
                      L18: {
                        if (ps.field_b.field_sb == 0) {
                          break L18;
                        } else {
                          L19: {
                            if (1 != rn.field_d.length) {
                              break L19;
                            } else {
                              if (rn.field_d[0] == ir.field_D) {
                                break L19;
                              } else {
                                L20: {
                                  ir.field_D = rn.field_d[0];
                                  oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                                  if (ao.field_a.field_sb != 0) {
                                    qv.field_f = false;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                return;
                              }
                            }
                          }
                          oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                          break L18;
                        }
                      }
                      L21: {
                        if (ao.field_a.field_sb != 0) {
                          qv.field_f = false;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      return;
                    }
                  } else {
                    L22: {
                      if (ps.field_b.field_sb == 0) {
                        break L22;
                      } else {
                        L23: {
                          if (1 != rn.field_d.length) {
                            break L23;
                          } else {
                            if (rn.field_d[0] == ir.field_D) {
                              break L23;
                            } else {
                              L24: {
                                ir.field_D = rn.field_d[0];
                                oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                                if (ao.field_a.field_sb != 0) {
                                  qv.field_f = false;
                                  break L24;
                                } else {
                                  break L24;
                                }
                              }
                              return;
                            }
                          }
                        }
                        oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                        break L22;
                      }
                    }
                    L25: {
                      if (ao.field_a.field_sb != 0) {
                        qv.field_f = false;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              if (ps.field_b.field_sb == 0) {
                L26: {
                  if (ao.field_a.field_sb != 0) {
                    qv.field_f = false;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                return;
              } else {
                if (1 == rn.field_d.length) {
                  if (rn.field_d[0] != ir.field_D) {
                    L27: {
                      ir.field_D = rn.field_d[0];
                      oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                      if (ao.field_a.field_sb != 0) {
                        qv.field_f = false;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    return;
                  } else {
                    L28: {
                      oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                      if (ao.field_a.field_sb != 0) {
                        qv.field_f = false;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    return;
                  }
                } else {
                  L29: {
                    oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                    if (ao.field_a.field_sb != 0) {
                      qv.field_f = false;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            L30: {
              mg.field_f = true;
              if (dr.field_d.field_sb != 0) {
                if (fv.field_d) {
                  ov.a(-43, 11);
                  break L30;
                } else {
                  if (eq.field_d > 0) {
                    ov.a(-43, 11);
                    break L30;
                  } else {
                    if (tk.field_Ib < 2) {
                      break L30;
                    } else {
                      if (!ne.field_G[12]) {
                        break L30;
                      } else {
                        L31: {
                          ov.a(-43, 11);
                          if (ps.field_b.field_sb == 0) {
                            break L31;
                          } else {
                            L32: {
                              if (1 != rn.field_d.length) {
                                break L32;
                              } else {
                                if (rn.field_d[0] == ir.field_D) {
                                  break L32;
                                } else {
                                  ir.field_D = rn.field_d[0];
                                  break L32;
                                }
                              }
                            }
                            oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                            break L31;
                          }
                        }
                        L33: {
                          if (ao.field_a.field_sb != 0) {
                            qv.field_f = false;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              } else {
                break L30;
              }
            }
            L34: {
              if (ps.field_b.field_sb == 0) {
                break L34;
              } else {
                L35: {
                  if (1 != rn.field_d.length) {
                    break L35;
                  } else {
                    if (rn.field_d[0] == ir.field_D) {
                      break L35;
                    } else {
                      L36: {
                        ir.field_D = rn.field_d[0];
                        oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                        if (ao.field_a.field_sb != 0) {
                          qv.field_f = false;
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                      return;
                    }
                  }
                }
                oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                break L34;
              }
            }
            L37: {
              if (ao.field_a.field_sb != 0) {
                qv.field_f = false;
                break L37;
              } else {
                break L37;
              }
            }
            return;
          }
        } else {
          L38: {
            L39: {
              li.field_a.field_E = null;
              stackOut_1_0 = ss.field_c;
              stackOut_1_1 = 0;
              stackIn_7_0 = stackOut_1_0;
              stackIn_7_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (!param0) {
                break L39;
              } else {
                stackOut_2_0 = (hd) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackIn_7_0 = stackOut_2_0;
                stackIn_7_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (param1) {
                  break L39;
                } else {
                  stackOut_3_0 = (hd) (Object) stackIn_3_0;
                  stackOut_3_1 = stackIn_3_1;
                  stackIn_7_0 = stackOut_3_0;
                  stackIn_7_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (qv.field_f) {
                    break L39;
                  } else {
                    stackOut_4_0 = (hd) (Object) stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_7_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (uv.field_i != null) {
                      break L39;
                    } else {
                      stackOut_5_0 = (hd) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (null != ow.field_b) {
                        break L39;
                      } else {
                        stackOut_6_0 = (hd) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        break L38;
                      }
                    }
                  }
                }
              }
            }
            stackOut_7_0 = (hd) (Object) stackIn_7_0;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = 0;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            stackIn_8_2 = stackOut_7_2;
            break L38;
          }
          L40: {
            L41: {
              ((hd) (Object) stackIn_8_0).b(stackIn_8_1, stackIn_8_2 != 0);
              stackOut_8_0 = af.field_d;
              stackOut_8_1 = 0;
              stackIn_14_0 = stackOut_8_0;
              stackIn_14_1 = stackOut_8_1;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              if (!param0) {
                break L41;
              } else {
                stackOut_9_0 = (hd) (Object) stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackIn_14_0 = stackOut_9_0;
                stackIn_14_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1) {
                  break L41;
                } else {
                  stackOut_10_0 = (hd) (Object) stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackIn_14_0 = stackOut_10_0;
                  stackIn_14_1 = stackOut_10_1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  if (qv.field_f) {
                    break L41;
                  } else {
                    stackOut_11_0 = (hd) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackIn_14_0 = stackOut_11_0;
                    stackIn_14_1 = stackOut_11_1;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    if (uv.field_i != null) {
                      break L41;
                    } else {
                      stackOut_12_0 = (hd) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if (ow.field_b != null) {
                        break L41;
                      } else {
                        stackOut_13_0 = (hd) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        break L40;
                      }
                    }
                  }
                }
              }
            }
            stackOut_14_0 = (hd) (Object) stackIn_14_0;
            stackOut_14_1 = stackIn_14_1;
            stackOut_14_2 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            stackIn_15_2 = stackOut_14_2;
            break L40;
          }
          L42: {
            L43: {
              ((hd) (Object) stackIn_15_0).b(stackIn_15_1, stackIn_15_2 != 0);
              stackOut_15_0 = kk.field_j;
              stackOut_15_1 = 0;
              stackIn_19_0 = stackOut_15_0;
              stackIn_19_1 = stackOut_15_1;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              if (!param0) {
                break L43;
              } else {
                stackOut_16_0 = (hd) (Object) stackIn_16_0;
                stackOut_16_1 = stackIn_16_1;
                stackIn_19_0 = stackOut_16_0;
                stackIn_19_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param1) {
                  break L43;
                } else {
                  stackOut_17_0 = (hd) (Object) stackIn_17_0;
                  stackOut_17_1 = stackIn_17_1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  if (!qv.field_f) {
                    break L43;
                  } else {
                    stackOut_18_0 = (hd) (Object) stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    break L42;
                  }
                }
              }
            }
            stackOut_19_0 = (hd) (Object) stackIn_19_0;
            stackOut_19_1 = stackIn_19_1;
            stackOut_19_2 = 0;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            stackIn_20_2 = stackOut_19_2;
            break L42;
          }
          L44: {
            ((hd) (Object) stackIn_20_0).b(stackIn_20_1, stackIn_20_2 != 0);
            tn.field_d.field_b.h((byte) 47);
            if (rg.field_a.field_sb == 0) {
              break L44;
            } else {
              mg.field_f = true;
              break L44;
            }
          }
          L45: {
            if (dr.field_d.field_sb != 0) {
              if (fv.field_d) {
                ov.a(-43, 11);
                break L45;
              } else {
                if (eq.field_d > 0) {
                  ov.a(-43, 11);
                  break L45;
                } else {
                  if (tk.field_Ib >= 2) {
                    if (ne.field_G[12]) {
                      ov.a(-43, 11);
                      break L45;
                    } else {
                      L46: {
                        if (ps.field_b.field_sb == 0) {
                          break L46;
                        } else {
                          if (1 != rn.field_d.length) {
                            oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                            break L46;
                          } else {
                            if (rn.field_d[0] == ir.field_D) {
                              oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                              break L46;
                            } else {
                              ir.field_D = rn.field_d[0];
                              oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                              break L46;
                            }
                          }
                        }
                      }
                      L47: {
                        if (ao.field_a.field_sb != 0) {
                          qv.field_f = false;
                          break L47;
                        } else {
                          break L47;
                        }
                      }
                      return;
                    }
                  } else {
                    L48: {
                      if (ps.field_b.field_sb == 0) {
                        break L48;
                      } else {
                        if (1 != rn.field_d.length) {
                          oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                          break L48;
                        } else {
                          if (rn.field_d[0] == ir.field_D) {
                            oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                            break L48;
                          } else {
                            ir.field_D = rn.field_d[0];
                            oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                            break L48;
                          }
                        }
                      }
                    }
                    L49: {
                      if (ao.field_a.field_sb != 0) {
                        qv.field_f = false;
                        break L49;
                      } else {
                        break L49;
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              break L45;
            }
          }
          L50: {
            if (ps.field_b.field_sb == 0) {
              break L50;
            } else {
              if (1 != rn.field_d.length) {
                oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                break L50;
              } else {
                if (rn.field_d[0] == ir.field_D) {
                  oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                  break L50;
                } else {
                  ir.field_D = rn.field_d[0];
                  oa.a(false, 11, ir.field_D, true, 0, no.field_J);
                  break L50;
                }
              }
            }
          }
          L51: {
            if (ao.field_a.field_sb != 0) {
              qv.field_f = false;
              break L51;
            } else {
              break L51;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This password contains your Player Name, and would be easy to guess";
        field_e = "Encouraging rule breaking";
        field_c = 1;
        field_d = "Go to the Orb Downloads section of FunOrb.com to purchase this item";
        field_f = 0;
    }
}
