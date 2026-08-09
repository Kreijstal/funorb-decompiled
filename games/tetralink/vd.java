/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    private int[] field_d;
    static mi field_c;
    private boolean field_f;
    static String field_h;
    private int field_j;
    private int field_e;
    static String field_i;
    static int field_a;
    static String field_g;
    static String field_b;

    private final void a(boolean param0, int param1) {
        int[] var3;
        int[] var4;
        if (!param0) {
          this.field_j = 31;
          var4 = new int[this.b(0, param1)];
          var3 = var4;
          rd.a(this.field_d, 0, var4, 0, this.field_d.length);
          this.field_d = var4;
          return;
        } else {
          var4 = new int[this.b(0, param1)];
          var3 = var4;
          rd.a(this.field_d, 0, var4, 0, this.field_d.length);
          this.field_d = var4;
          return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_c = null;
        if (param0 < 32) {
          vd.a((byte) -56);
          field_h = null;
          field_b = null;
          field_g = null;
          return;
        } else {
          field_h = null;
          field_b = null;
          field_g = null;
          return;
        }
    }

    final void a(int param0, int param1) {
        if (param0 == 0) {
          if (-1 >= (param1 ^ -1)) {
            if (param1 <= this.field_j) {
              if (this.field_j != param1) {
                rd.a(this.field_d, param1 - -1, this.field_d, param1, this.field_j - param1);
                this.field_j = this.field_j - 1;
                return;
              } else {
                this.field_j = this.field_j - 1;
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param1);
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          this.a(false, 25);
          if (-1 >= (param1 ^ -1)) {
            if (param1 <= this.field_j) {
              if (this.field_j == param1) {
                this.field_j = this.field_j - 1;
                return;
              } else {
                rd.a(this.field_d, param1 - -1, this.field_d, param1, this.field_j - param1);
                this.field_j = this.field_j - 1;
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param1);
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        }
    }

    final int a(int param0, byte param1) {
        if (this.field_j < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        } else {
          if (param1 != 11) {
            vd.b(true, 17);
            return this.field_d[param0];
          } else {
            return this.field_d[param0];
          }
        }
    }

    private vd() throws Throwable {
        throw new Error();
    }

    final void a(byte param0, int param1) {
        if (param0 <= 79) {
          this.a(-79, (byte) 90);
          this.a(false, param1, this.field_j - -1);
          return;
        } else {
          this.a(false, param1, this.field_j - -1);
          return;
        }
    }

    final static void b(boolean param0, int param1) {
        hl stackIn_7_0 = null;
        hl stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        hl stackIn_11_0 = null;
        hl stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        hl stackIn_20_0 = null;
        hl stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        hl stackIn_24_0 = null;
        hl stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        hl stackIn_33_0 = null;
        hl stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        hl stackIn_37_0 = null;
        hl stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        hl stackIn_47_0 = null;
        hl stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        hl stackIn_51_0 = null;
        hl stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        hl stackIn_61_0 = null;
        hl stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        hl stackIn_65_0 = null;
        hl stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        kl.a(640 + ra.field_f >> -2033808831, ra.field_e, 0, (byte) -79, -640 + ra.field_f >> 1618882657);
        if ((qd.field_ab ^ -1) < -1) {
          L0: {
            if (null == hd.field_r) {
              break L0;
            } else {
              hd.field_r.b(hn.field_P.field_M, 0);
              break L0;
            }
          }
          L1: {
            L2: {
              stackIn_7_0 = hn.field_P;

              if (!param0) {
                break L2;
              } else {
                stackIn_7_0 = (hl) ((Object) stackIn_7_0);

                if (hm.field_b) {
                  break L2;
                } else {
                  stackIn_8_0 = (hl) ((Object) stackIn_7_0);
                  stackIn_8_1 = 1;
                  break L1;
                }
              }
            }
            stackIn_8_0 = (hl) ((Object) stackIn_7_0);
            stackIn_8_1 = 0;
            break L1;
          }
          L3: {
            L4: {
              ((hl) (Object) stackIn_8_0).a(stackIn_8_1 != 0, 256);
              stackIn_11_0 = qe.field_c;

              if (!param0) {
                break L4;
              } else {
                stackIn_11_0 = (hl) ((Object) stackIn_11_0);

                if (hm.field_b) {
                  break L4;
                } else {
                  stackIn_12_0 = (hl) ((Object) stackIn_11_0);
                  stackIn_12_1 = 1;
                  break L3;
                }
              }
            }
            stackIn_12_0 = (hl) ((Object) stackIn_11_0);
            stackIn_12_1 = 0;
            break L3;
          }
          ((hl) (Object) stackIn_12_0).a(stackIn_12_1 != 0, 256);
          if (ng.field_t > param1) {
            L5: {
              if (hd.field_r != null) {
                hd.field_r.b(tl.field_P.field_M, 0);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              L7: {
                stackIn_33_0 = tl.field_P;

                if (!param0) {
                  break L7;
                } else {
                  stackIn_33_0 = (hl) ((Object) stackIn_33_0);

                  if (lg.field_S) {
                    break L7;
                  } else {
                    stackIn_34_0 = (hl) ((Object) stackIn_33_0);
                    stackIn_34_1 = 1;
                    break L6;
                  }
                }
              }
              stackIn_34_0 = (hl) ((Object) stackIn_33_0);
              stackIn_34_1 = 0;
              break L6;
            }
            L8: {
              L9: {
                ((hl) (Object) stackIn_34_0).a(stackIn_34_1 != 0, 256);
                stackIn_37_0 = fk.field_V;

                if (!param0) {
                  break L9;
                } else {
                  stackIn_37_0 = (hl) ((Object) stackIn_37_0);

                  if (lg.field_S) {
                    break L9;
                  } else {
                    stackIn_38_0 = (hl) ((Object) stackIn_37_0);
                    stackIn_38_1 = 1;
                    break L8;
                  }
                }
              }
              stackIn_38_0 = (hl) ((Object) stackIn_37_0);
              stackIn_38_1 = 0;
              break L8;
            }
            ((hl) (Object) stackIn_38_0).a(stackIn_38_1 != 0, param1 + 256);
            dh.a(-581);
            return;
          } else {
            L10: {
              if (-1 <= (am.field_f ^ -1)) {
                break L10;
              } else {
                L11: {
                  if (hd.field_r != null) {
                    hd.field_r.b(tl.field_P.field_M, 0);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  L13: {
                    stackIn_20_0 = tl.field_P;

                    if (!param0) {
                      break L13;
                    } else {
                      stackIn_20_0 = (hl) ((Object) stackIn_20_0);

                      if (lg.field_S) {
                        break L13;
                      } else {
                        stackIn_21_0 = (hl) ((Object) stackIn_20_0);
                        stackIn_21_1 = 1;
                        break L12;
                      }
                    }
                  }
                  stackIn_21_0 = (hl) ((Object) stackIn_20_0);
                  stackIn_21_1 = 0;
                  break L12;
                }
                L14: {
                  L15: {
                    ((hl) (Object) stackIn_21_0).a(stackIn_21_1 != 0, 256);
                    stackIn_24_0 = fk.field_V;

                    if (!param0) {
                      break L15;
                    } else {
                      stackIn_24_0 = (hl) ((Object) stackIn_24_0);

                      if (lg.field_S) {
                        break L15;
                      } else {
                        stackIn_25_0 = (hl) ((Object) stackIn_24_0);
                        stackIn_25_1 = 1;
                        break L14;
                      }
                    }
                  }
                  stackIn_25_0 = (hl) ((Object) stackIn_24_0);
                  stackIn_25_1 = 0;
                  break L14;
                }
                ((hl) (Object) stackIn_25_0).a(stackIn_25_1 != 0, param1 + 256);
                break L10;
              }
            }
            dh.a(-581);
            return;
          }
        } else {
          if (ng.field_t <= param1) {
            if (-1 > (am.field_f ^ -1)) {
              L16: {
                if (hd.field_r != null) {
                  hd.field_r.b(tl.field_P.field_M, 0);
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                L18: {
                  stackIn_61_0 = tl.field_P;

                  if (!param0) {
                    break L18;
                  } else {
                    stackIn_61_0 = (hl) ((Object) stackIn_61_0);

                    if (lg.field_S) {
                      break L18;
                    } else {
                      stackIn_62_0 = (hl) ((Object) stackIn_61_0);
                      stackIn_62_1 = 1;
                      break L17;
                    }
                  }
                }
                stackIn_62_0 = (hl) ((Object) stackIn_61_0);
                stackIn_62_1 = 0;
                break L17;
              }
              L19: {
                L20: {
                  ((hl) (Object) stackIn_62_0).a(stackIn_62_1 != 0, 256);
                  stackIn_65_0 = fk.field_V;

                  if (!param0) {
                    break L20;
                  } else {
                    stackIn_65_0 = (hl) ((Object) stackIn_65_0);

                    if (lg.field_S) {
                      break L20;
                    } else {
                      stackIn_66_0 = (hl) ((Object) stackIn_65_0);
                      stackIn_66_1 = 1;
                      break L19;
                    }
                  }
                }
                stackIn_66_0 = (hl) ((Object) stackIn_65_0);
                stackIn_66_1 = 0;
                break L19;
              }
              ((hl) (Object) stackIn_66_0).a(stackIn_66_1 != 0, param1 + 256);
              dh.a(-581);
              return;
            } else {
              dh.a(-581);
              return;
            }
          } else {
            L21: {
              if (hd.field_r != null) {
                hd.field_r.b(tl.field_P.field_M, 0);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              L23: {
                stackIn_47_0 = tl.field_P;

                if (!param0) {
                  break L23;
                } else {
                  stackIn_47_0 = (hl) ((Object) stackIn_47_0);

                  if (lg.field_S) {
                    break L23;
                  } else {
                    stackIn_48_0 = (hl) ((Object) stackIn_47_0);
                    stackIn_48_1 = 1;
                    break L22;
                  }
                }
              }
              stackIn_48_0 = (hl) ((Object) stackIn_47_0);
              stackIn_48_1 = 0;
              break L22;
            }
            L24: {
              L25: {
                ((hl) (Object) stackIn_48_0).a(stackIn_48_1 != 0, 256);
                stackIn_51_0 = fk.field_V;

                if (!param0) {
                  break L25;
                } else {
                  stackIn_51_0 = (hl) ((Object) stackIn_51_0);

                  if (lg.field_S) {
                    break L25;
                  } else {
                    stackIn_52_0 = (hl) ((Object) stackIn_51_0);
                    stackIn_52_1 = 1;
                    break L24;
                  }
                }
              }
              stackIn_52_0 = (hl) ((Object) stackIn_51_0);
              stackIn_52_1 = 0;
              break L24;
            }
            ((hl) (Object) stackIn_52_0).a(stackIn_52_1 != 0, param1 + 256);
            dh.a(-581);
            return;
          }
        }
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = TetraLink.field_J;
        var3 = this.field_d.length;
        L0: while (true) {
          if (var3 > param1) {
            if (param0 != 0) {
              vd.a((byte) -117);
              return var3;
            } else {
              return var3;
            }
          } else {
            if (this.field_f) {
              if (0 != var3) {
                var3 = var3 * this.field_e;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            } else {
              var3 = var3 + this.field_e;
              continue L0;
            }
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            vd.a((byte) -40);
            return 1 + this.field_j;
        }
        return 1 + this.field_j;
    }

    private final void a(boolean param0, int param1, int param2) {
        if (param2 <= this.field_j) {
          if (this.field_d.length > param2) {
            this.field_d[param2] = param1;
            if (param0) {
              this.a(26, (byte) 120);
              return;
            } else {
              return;
            }
          } else {
            this.a(true, param2);
            this.field_d[param2] = param1;
            if (param0) {
              this.a(26, (byte) 120);
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_j = param2;
          if (this.field_d.length <= param2) {
            this.a(true, param2);
            this.field_d[param2] = param1;
            if (!param0) {
              return;
            } else {
              this.a(26, (byte) 120);
              return;
            }
          } else {
            this.field_d[param2] = param1;
            if (param0) {
              this.a(26, (byte) 120);
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_i = "<%0> might change the options - wait and see.";
        field_g = "Toggle fullscreen mode";
        field_b = "To <%0>: ";
    }
}
