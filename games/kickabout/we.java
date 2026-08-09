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
        if (!param1) {
          param0 = param0 & 8191;
          if (-4097 < (param0 ^ -1)) {
            L0: {
              if (param0 < 2048) {
                stackIn_19_0 = mg.field_b[2048 - param0];
                break L0;
              } else {
                stackIn_19_0 = -mg.field_b[param0 + -2048];
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param0 < 6144) {
                stackIn_15_0 = -mg.field_b[6144 - param0];
                break L1;
              } else {
                stackIn_15_0 = mg.field_b[-6144 + param0];
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          we.a((byte) 50);
          param0 = param0 & 8191;
          if (-4097 < (param0 ^ -1)) {
            L2: {
              if (param0 < 2048) {
                stackIn_9_0 = mg.field_b[2048 - param0];
                break L2;
              } else {
                stackIn_9_0 = -mg.field_b[param0 + -2048];
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param0 < 6144) {
                stackIn_5_0 = -mg.field_b[6144 - param0];
                break L3;
              } else {
                stackIn_5_0 = mg.field_b[-6144 + param0];
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static void a(boolean param0, boolean param1, byte param2, int param3) {
        hd stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        hd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        hd stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        hd stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        hd stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        hd stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        hd stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        hd stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        hd stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        hd stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        hd stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        hd stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        pa.b((byte) 123);
        if ((mi.field_d ^ -1) <= -1) {
          L0: {
            L1: {
              li.field_a.field_E = vo.a((byte) -18, id.field_r, new String[]{Integer.toString(mi.field_d)});
              stackIn_51_0 = ss.field_c;

              stackIn_51_1 = 0;

              if (!param0) {
                break L1;
              } else {
                stackIn_51_0 = (hd) ((Object) stackIn_51_0);

                if (param1) {
                  break L1;
                } else {
                  stackIn_51_0 = (hd) ((Object) stackIn_51_0);

                  if (qv.field_f) {
                    break L1;
                  } else {
                    stackIn_51_0 = (hd) ((Object) stackIn_51_0);

                    if (uv.field_i != null) {
                      break L1;
                    } else {
                      stackIn_51_0 = (hd) ((Object) stackIn_51_0);

                      if (null != ow.field_b) {
                        break L1;
                      } else {
                        stackIn_52_0 = (hd) ((Object) stackIn_51_0);
                        stackIn_52_1 = stackIn_51_1;
                        stackIn_52_2 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackIn_52_0 = (hd) ((Object) stackIn_51_0);
            stackIn_52_1 = stackIn_51_1;
            stackIn_52_2 = 0;
            break L0;
          }
          L2: {
            ((hd) (Object) stackIn_52_0).b(stackIn_52_1, stackIn_52_2 != 0);
            if (param2 <= -37) {
              break L2;
            } else {
              we.a((byte) -81);
              break L2;
            }
          }
          L3: {
            L4: {
              stackIn_60_0 = af.field_d;

              stackIn_60_1 = 0;

              if (!param0) {
                break L4;
              } else {
                stackIn_60_0 = (hd) ((Object) stackIn_60_0);

                if (param1) {
                  break L4;
                } else {
                  stackIn_60_0 = (hd) ((Object) stackIn_60_0);

                  if (qv.field_f) {
                    break L4;
                  } else {
                    stackIn_60_0 = (hd) ((Object) stackIn_60_0);

                    if (uv.field_i != null) {
                      break L4;
                    } else {
                      stackIn_60_0 = (hd) ((Object) stackIn_60_0);

                      if (ow.field_b != null) {
                        break L4;
                      } else {
                        stackIn_61_0 = (hd) ((Object) stackIn_60_0);
                        stackIn_61_1 = stackIn_60_1;
                        stackIn_61_2 = 1;
                        break L3;
                      }
                    }
                  }
                }
              }
            }
            stackIn_61_0 = (hd) ((Object) stackIn_60_0);
            stackIn_61_1 = stackIn_60_1;
            stackIn_61_2 = 0;
            break L3;
          }
          L5: {
            L6: {
              ((hd) (Object) stackIn_61_0).b(stackIn_61_1, stackIn_61_2 != 0);
              stackIn_65_0 = kk.field_j;

              stackIn_65_1 = 0;

              if (!param0) {
                break L6;
              } else {
                stackIn_65_0 = (hd) ((Object) stackIn_65_0);

                if (param1) {
                  break L6;
                } else {
                  stackIn_65_0 = (hd) ((Object) stackIn_65_0);

                  if (!qv.field_f) {
                    break L6;
                  } else {
                    stackIn_66_0 = (hd) ((Object) stackIn_65_0);
                    stackIn_66_1 = stackIn_65_1;
                    stackIn_66_2 = 1;
                    break L5;
                  }
                }
              }
            }
            stackIn_66_0 = (hd) ((Object) stackIn_65_0);
            stackIn_66_1 = stackIn_65_1;
            stackIn_66_2 = 0;
            break L5;
          }
          L7: {
            ((hd) (Object) stackIn_66_0).b(stackIn_66_1, stackIn_66_2 != 0);
            tn.field_d.field_b.h((byte) 47);
            if (rg.field_a.field_sb == 0) {
              break L7;
            } else {
              mg.field_f = true;
              break L7;
            }
          }
          L8: {
            if (dr.field_d.field_sb != 0) {
              if (fv.field_d) {
                ov.a(-43, param3);
                break L8;
              } else {
                if (-1 > (eq.field_d ^ -1)) {
                  ov.a(-43, param3);
                  break L8;
                } else {
                  if ((tk.field_Ib ^ -1) > -3) {
                    break L8;
                  } else {
                    if (!ne.field_G[12]) {
                      break L8;
                    } else {
                      ov.a(-43, param3);
                      break L8;
                    }
                  }
                }
              }
            } else {
              break L8;
            }
          }
          L9: {
            if (ps.field_b.field_sb == 0) {
              break L9;
            } else {
              L10: {
                if (1 != rn.field_d.length) {
                  break L10;
                } else {
                  if (rn.field_d[0] == ir.field_D) {
                    break L10;
                  } else {
                    ir.field_D = rn.field_d[0];
                    break L10;
                  }
                }
              }
              oa.a(false, param3, ir.field_D, true, 0, no.field_J);
              break L9;
            }
          }
          L11: {
            if (ao.field_a.field_sb != 0) {
              qv.field_f = false;
              break L11;
            } else {
              break L11;
            }
          }
          return;
        } else {
          L12: {
            L13: {
              li.field_a.field_E = null;
              stackIn_7_0 = ss.field_c;

              stackIn_7_1 = 0;

              if (!param0) {
                break L13;
              } else {
                stackIn_7_0 = (hd) ((Object) stackIn_7_0);

                if (param1) {
                  break L13;
                } else {
                  stackIn_7_0 = (hd) ((Object) stackIn_7_0);

                  if (qv.field_f) {
                    break L13;
                  } else {
                    stackIn_7_0 = (hd) ((Object) stackIn_7_0);

                    if (uv.field_i != null) {
                      break L13;
                    } else {
                      stackIn_7_0 = (hd) ((Object) stackIn_7_0);

                      if (null != ow.field_b) {
                        break L13;
                      } else {
                        stackIn_8_0 = (hd) ((Object) stackIn_7_0);
                        stackIn_8_1 = stackIn_7_1;
                        stackIn_8_2 = 1;
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            stackIn_8_0 = (hd) ((Object) stackIn_7_0);
            stackIn_8_1 = stackIn_7_1;
            stackIn_8_2 = 0;
            break L12;
          }
          L14: {
            ((hd) (Object) stackIn_8_0).b(stackIn_8_1, stackIn_8_2 != 0);
            if (param2 <= -37) {
              break L14;
            } else {
              we.a((byte) -81);
              break L14;
            }
          }
          L15: {
            L16: {
              stackIn_16_0 = af.field_d;

              stackIn_16_1 = 0;

              if (!param0) {
                break L16;
              } else {
                stackIn_16_0 = (hd) ((Object) stackIn_16_0);

                if (param1) {
                  break L16;
                } else {
                  stackIn_16_0 = (hd) ((Object) stackIn_16_0);

                  if (qv.field_f) {
                    break L16;
                  } else {
                    stackIn_16_0 = (hd) ((Object) stackIn_16_0);

                    if (uv.field_i != null) {
                      break L16;
                    } else {
                      stackIn_16_0 = (hd) ((Object) stackIn_16_0);

                      if (ow.field_b != null) {
                        break L16;
                      } else {
                        stackIn_17_0 = (hd) ((Object) stackIn_16_0);
                        stackIn_17_1 = stackIn_16_1;
                        stackIn_17_2 = 1;
                        break L15;
                      }
                    }
                  }
                }
              }
            }
            stackIn_17_0 = (hd) ((Object) stackIn_16_0);
            stackIn_17_1 = stackIn_16_1;
            stackIn_17_2 = 0;
            break L15;
          }
          L17: {
            L18: {
              ((hd) (Object) stackIn_17_0).b(stackIn_17_1, stackIn_17_2 != 0);
              stackIn_21_0 = kk.field_j;

              stackIn_21_1 = 0;

              if (!param0) {
                break L18;
              } else {
                stackIn_21_0 = (hd) ((Object) stackIn_21_0);

                if (param1) {
                  break L18;
                } else {
                  stackIn_21_0 = (hd) ((Object) stackIn_21_0);

                  if (!qv.field_f) {
                    break L18;
                  } else {
                    stackIn_22_0 = (hd) ((Object) stackIn_21_0);
                    stackIn_22_1 = stackIn_21_1;
                    stackIn_22_2 = 1;
                    break L17;
                  }
                }
              }
            }
            stackIn_22_0 = (hd) ((Object) stackIn_21_0);
            stackIn_22_1 = stackIn_21_1;
            stackIn_22_2 = 0;
            break L17;
          }
          L19: {
            ((hd) (Object) stackIn_22_0).b(stackIn_22_1, stackIn_22_2 != 0);
            tn.field_d.field_b.h((byte) 47);
            if (rg.field_a.field_sb == 0) {
              break L19;
            } else {
              mg.field_f = true;
              break L19;
            }
          }
          L20: {
            if (dr.field_d.field_sb != 0) {
              if (fv.field_d) {
                ov.a(-43, param3);
                break L20;
              } else {
                if (-1 > (eq.field_d ^ -1)) {
                  ov.a(-43, param3);
                  break L20;
                } else {
                  if ((tk.field_Ib ^ -1) > -3) {
                    break L20;
                  } else {
                    if (!ne.field_G[12]) {
                      break L20;
                    } else {
                      ov.a(-43, param3);
                      break L20;
                    }
                  }
                }
              }
            } else {
              break L20;
            }
          }
          L21: {
            if (ps.field_b.field_sb == 0) {
              break L21;
            } else {
              if (1 != rn.field_d.length) {
                oa.a(false, param3, ir.field_D, true, 0, no.field_J);
                break L21;
              } else {
                if (rn.field_d[0] == ir.field_D) {
                  oa.a(false, param3, ir.field_D, true, 0, no.field_J);
                  break L21;
                } else {
                  ir.field_D = rn.field_d[0];
                  oa.a(false, param3, ir.field_D, true, 0, no.field_J);
                  break L21;
                }
              }
            }
          }
          L22: {
            if (ao.field_a.field_sb != 0) {
              qv.field_f = false;
              break L22;
            } else {
              break L22;
            }
          }
          return;
        }
    }

    static {
        field_b = "This password contains your Player Name, and would be easy to guess";
        field_e = "Encouraging rule breaking";
        field_c = 1;
        field_d = "Go to the Orb Downloads section of FunOrb.com to purchase this item";
        field_f = 0;
    }
}
