/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sha extends oda {
    private vcb field_v;
    private boolean field_A;
    static String field_x;
    private boolean field_z;
    vcb field_B;
    bk field_y;
    static int field_w;

    final void a(boolean param0, vcb param1, byte param2) {
        try {
            this.field_B = param1;
            this.field_u[1] = (shb) ((Object) param1);
            if (param2 > -91) {
                this.e(17);
            }
            this.field_A = param0 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "sha.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void f(int param0) {
        field_x = null;
        if (param0 != 1) {
            eab var2 = (eab) null;
            sha.a(56, (String) null, 29, -128, (byte) -61, -80, -20, (eab) null, 10);
        }
    }

    sha(int param0, int param1, int param2, int param3, wwa param4, shb param5, wwa param6) {
        super(param0, param1, param2, param3, param4);
        bk dupTemp$0 = null;
        try {
            this.field_u = new shb[3];
            dupTemp$0 = new bk(param0, param1, param2, param3, param6, param5);
            this.field_y = dupTemp$0;
            this.field_u[2] = (shb) ((Object) dupTemp$0);
            this.d(16777215);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "sha.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    private final void h(byte param0) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        var2 = -85 % ((param0 - -47) / 56);
        if (this.field_B != null) {
          if (this.field_y.field_f >= this.field_y.field_t.field_f) {
            this.field_B.c(1, 1, 127);
            if (null != this.field_v) {
              if (this.field_y.field_h >= this.field_y.field_t.field_h) {
                this.field_v.b(1, 21944, 1);
                return;
              } else {
                this.field_v.b(this.field_y.field_h, 21944, this.field_y.field_t.field_h);
                return;
              }
            } else {
              return;
            }
          } else {
            this.field_B.c(this.field_y.field_f, this.field_y.field_t.field_f, 127);
            if (null != this.field_v) {
              if (this.field_y.field_h >= this.field_y.field_t.field_h) {
                this.field_v.b(1, 21944, 1);
                return;
              } else {
                this.field_v.b(this.field_y.field_h, 21944, this.field_y.field_t.field_h);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (null != this.field_v) {
            if (this.field_y.field_h >= this.field_y.field_t.field_h) {
              this.field_v.b(1, 21944, 1);
              return;
            } else {
              this.field_v.b(this.field_y.field_h, 21944, this.field_y.field_t.field_h);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, String param1, int param2, int param3, byte param4, int param5, int param6, eab param7, int param8) {
        wlb.field_o = param0;
        gia.field_k = param7;
        hob.field_l = param1;
        nia.field_p = param5;
        qfa.field_Ib = param8;
        ea.field_d = param6;
        if (param4 != -2) {
            return;
        }
        try {
            esa.field_p = param2;
            vwa.field_p = param3;
            ff.field_o = (ona) ((Object) new wh());
            nj.field_a = new pfa(param7);
            ho.field_a = new fwa(ff.field_o, nj.field_a);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "sha.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    final void d(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        vcb stackIn_15_0 = null;
        vcb stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        vcb stackIn_21_0;
        int stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        vcb stackIn_22_0;
        int stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_22_4;
        int stackIn_22_5;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        vcb stackIn_37_0 = null;
        vcb stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        vcb stackIn_43_0;
        int stackIn_43_1;
        int stackIn_43_2;
        int stackIn_43_3;
        int stackIn_43_4;
        vcb stackIn_44_0;
        int stackIn_44_1;
        int stackIn_44_2;
        int stackIn_44_3;
        int stackIn_44_4;
        int stackIn_44_5;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        vcb stackIn_57_0 = null;
        vcb stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        vcb stackIn_63_0;
        int stackIn_63_1;
        int stackIn_63_2;
        int stackIn_63_3;
        int stackIn_63_4;
        vcb stackIn_64_0;
        int stackIn_64_1;
        int stackIn_64_2;
        int stackIn_64_3;
        int stackIn_64_4;
        int stackIn_64_5;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        vcb stackIn_76_0 = null;
        vcb stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        vcb stackIn_82_0;
        int stackIn_82_1;
        int stackIn_82_2;
        int stackIn_82_3;
        int stackIn_82_4;
        vcb stackIn_83_0;
        int stackIn_83_1;
        int stackIn_83_2;
        int stackIn_83_3;
        int stackIn_83_4;
        int stackIn_83_5;
        int stackIn_88_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_96_0 = 0;
        vcb stackIn_100_0 = null;
        vcb stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        vcb stackIn_106_0;
        int stackIn_106_1;
        int stackIn_106_2;
        int stackIn_106_3;
        int stackIn_106_4;
        vcb stackIn_107_0;
        int stackIn_107_1;
        int stackIn_107_2;
        int stackIn_107_3;
        int stackIn_107_4;
        int stackIn_107_5;
        int stackIn_112_0 = 0;
        int stackIn_115_0 = 0;
        vcb stackIn_119_0 = null;
        vcb stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        vcb stackIn_125_0;
        int stackIn_125_1;
        int stackIn_125_2;
        int stackIn_125_3;
        int stackIn_125_4;
        vcb stackIn_126_0;
        int stackIn_126_1;
        int stackIn_126_2;
        int stackIn_126_3;
        int stackIn_126_4;
        int stackIn_126_5;
        int stackIn_134_0 = 0;
        int stackIn_137_0 = 0;
        vcb stackIn_141_0 = null;
        vcb stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        vcb stackIn_147_0;
        int stackIn_147_1;
        int stackIn_147_2;
        int stackIn_147_3;
        int stackIn_147_4;
        vcb stackIn_148_0;
        int stackIn_148_1;
        int stackIn_148_2;
        int stackIn_148_3;
        int stackIn_148_4;
        int stackIn_148_5;
        int stackIn_153_0 = 0;
        int stackIn_156_0 = 0;
        vcb stackIn_160_0 = null;
        vcb stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        vcb stackIn_166_0;
        int stackIn_166_1;
        int stackIn_166_2;
        int stackIn_166_3;
        int stackIn_166_4;
        vcb stackIn_167_0;
        int stackIn_167_1;
        int stackIn_167_2;
        int stackIn_167_3;
        int stackIn_167_4;
        int stackIn_167_5;
        int stackIn_174_0 = 0;
        int stackIn_177_0 = 0;
        vcb stackIn_181_0 = null;
        vcb stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        vcb stackIn_187_0;
        int stackIn_187_1;
        int stackIn_187_2;
        int stackIn_187_3;
        int stackIn_187_4;
        vcb stackIn_188_0;
        int stackIn_188_1;
        int stackIn_188_2;
        int stackIn_188_3;
        int stackIn_188_4;
        int stackIn_188_5;
        int stackIn_193_0 = 0;
        int stackIn_196_0 = 0;
        vcb stackIn_200_0 = null;
        vcb stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        vcb stackIn_206_0;
        int stackIn_206_1;
        int stackIn_206_2;
        int stackIn_206_3;
        int stackIn_206_4;
        vcb stackIn_207_0;
        int stackIn_207_1;
        int stackIn_207_2;
        int stackIn_207_3;
        int stackIn_207_4;
        int stackIn_207_5;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          if (this.field_A) {
            stackIn_88_0 = 0;
            break L0;
          } else {
            if (null != this.field_B) {
              stackIn_88_0 = this.field_B.field_h;
              break L0;
            } else {
              var2 = 0;
              if (!this.field_z) {
                if (this.field_v != null) {
                  var3 = this.field_v.field_f;
                  if (param0 != 16777215) {
                    L1: {
                      this.field_y = (bk) null;
                      if (null == this.field_B) {
                        stackIn_69_0 = this.field_h;
                        break L1;
                      } else {
                        stackIn_69_0 = -this.field_B.field_h + this.field_h;
                        break L1;
                      }
                    }
                    L2: {
                      var4 = stackIn_69_0;
                      if (null != this.field_v) {
                        stackIn_72_0 = this.field_f + -this.field_v.field_f;
                        break L2;
                      } else {
                        stackIn_72_0 = this.field_f;
                        break L2;
                      }
                    }
                    L3: {
                      var5 = stackIn_72_0;
                      this.field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                      if (null != this.field_B) {
                        L4: {
                          stackIn_76_0 = this.field_B;

                          if (!this.field_A) {
                            stackIn_77_0 = (vcb) ((Object) stackIn_76_0);
                            stackIn_77_1 = 0;
                            break L4;
                          } else {
                            stackIn_77_0 = (vcb) ((Object) stackIn_76_0);
                            stackIn_77_1 = this.field_h + -this.field_B.field_h;
                            break L4;
                          }
                        }
                        ((vcb) (Object) stackIn_77_0).a(stackIn_77_1, this.field_B.field_h, this.field_y.field_f, 1, this.field_y.field_r);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L5: {
                      if (null != this.field_v) {
                        L6: {
                          stackIn_82_0 = this.field_v;

                          stackIn_82_1 = this.field_y.field_g;

                          stackIn_82_2 = this.field_y.field_h;

                          stackIn_82_3 = this.field_v.field_f;

                          stackIn_82_4 = 1;

                          if (this.field_z) {
                            stackIn_83_0 = (vcb) ((Object) stackIn_82_0);
                            stackIn_83_1 = stackIn_82_1;
                            stackIn_83_2 = stackIn_82_2;
                            stackIn_83_3 = stackIn_82_3;
                            stackIn_83_4 = stackIn_82_4;
                            stackIn_83_5 = -this.field_v.field_f + this.field_f;
                            break L6;
                          } else {
                            stackIn_83_0 = (vcb) ((Object) stackIn_82_0);
                            stackIn_83_1 = stackIn_82_1;
                            stackIn_83_2 = stackIn_82_2;
                            stackIn_83_3 = stackIn_82_3;
                            stackIn_83_4 = stackIn_82_4;
                            stackIn_83_5 = 0;
                            break L6;
                          }
                        }
                        ((vcb) (Object) stackIn_83_0).a(stackIn_83_1, stackIn_83_2, stackIn_83_3, stackIn_83_4, stackIn_83_5);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.h((byte) -109);
                    return;
                  } else {
                    L7: {
                      if (null == this.field_B) {
                        stackIn_50_0 = this.field_h;
                        break L7;
                      } else {
                        stackIn_50_0 = -this.field_B.field_h + this.field_h;
                        break L7;
                      }
                    }
                    L8: {
                      var4 = stackIn_50_0;
                      if (null != this.field_v) {
                        stackIn_53_0 = this.field_f + -this.field_v.field_f;
                        break L8;
                      } else {
                        stackIn_53_0 = this.field_f;
                        break L8;
                      }
                    }
                    L9: {
                      var5 = stackIn_53_0;
                      this.field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                      if (null != this.field_B) {
                        L10: {
                          stackIn_57_0 = this.field_B;

                          if (!this.field_A) {
                            stackIn_58_0 = (vcb) ((Object) stackIn_57_0);
                            stackIn_58_1 = 0;
                            break L10;
                          } else {
                            stackIn_58_0 = (vcb) ((Object) stackIn_57_0);
                            stackIn_58_1 = this.field_h + -this.field_B.field_h;
                            break L10;
                          }
                        }
                        ((vcb) (Object) stackIn_58_0).a(stackIn_58_1, this.field_B.field_h, this.field_y.field_f, 1, this.field_y.field_r);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L11: {
                      if (null != this.field_v) {
                        L12: {
                          stackIn_63_0 = this.field_v;

                          stackIn_63_1 = this.field_y.field_g;

                          stackIn_63_2 = this.field_y.field_h;

                          stackIn_63_3 = this.field_v.field_f;

                          stackIn_63_4 = 1;

                          if (this.field_z) {
                            stackIn_64_0 = (vcb) ((Object) stackIn_63_0);
                            stackIn_64_1 = stackIn_63_1;
                            stackIn_64_2 = stackIn_63_2;
                            stackIn_64_3 = stackIn_63_3;
                            stackIn_64_4 = stackIn_63_4;
                            stackIn_64_5 = -this.field_v.field_f + this.field_f;
                            break L12;
                          } else {
                            stackIn_64_0 = (vcb) ((Object) stackIn_63_0);
                            stackIn_64_1 = stackIn_63_1;
                            stackIn_64_2 = stackIn_63_2;
                            stackIn_64_3 = stackIn_63_3;
                            stackIn_64_4 = stackIn_63_4;
                            stackIn_64_5 = 0;
                            break L12;
                          }
                        }
                        ((vcb) (Object) stackIn_64_0).a(stackIn_64_1, stackIn_64_2, stackIn_64_3, stackIn_64_4, stackIn_64_5);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    this.h((byte) -109);
                    return;
                  }
                } else {
                  L13: {
                    var3 = 0;
                    if (param0 == 16777215) {
                      break L13;
                    } else {
                      this.field_y = (bk) null;
                      break L13;
                    }
                  }
                  L14: {
                    if (null == this.field_B) {
                      stackIn_30_0 = this.field_h;
                      break L14;
                    } else {
                      stackIn_30_0 = -this.field_B.field_h + this.field_h;
                      break L14;
                    }
                  }
                  L15: {
                    var4 = stackIn_30_0;
                    if (null != this.field_v) {
                      stackIn_33_0 = this.field_f + -this.field_v.field_f;
                      break L15;
                    } else {
                      stackIn_33_0 = this.field_f;
                      break L15;
                    }
                  }
                  L16: {
                    var5 = stackIn_33_0;
                    this.field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                    if (null != this.field_B) {
                      L17: {
                        stackIn_37_0 = this.field_B;

                        if (!this.field_A) {
                          stackIn_38_0 = (vcb) ((Object) stackIn_37_0);
                          stackIn_38_1 = 0;
                          break L17;
                        } else {
                          stackIn_38_0 = (vcb) ((Object) stackIn_37_0);
                          stackIn_38_1 = this.field_h + -this.field_B.field_h;
                          break L17;
                        }
                      }
                      ((vcb) (Object) stackIn_38_0).a(stackIn_38_1, this.field_B.field_h, this.field_y.field_f, 1, this.field_y.field_r);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L18: {
                    if (null != this.field_v) {
                      L19: {
                        stackIn_43_0 = this.field_v;

                        stackIn_43_1 = this.field_y.field_g;

                        stackIn_43_2 = this.field_y.field_h;

                        stackIn_43_3 = this.field_v.field_f;

                        stackIn_43_4 = 1;

                        if (this.field_z) {
                          stackIn_44_0 = (vcb) ((Object) stackIn_43_0);
                          stackIn_44_1 = stackIn_43_1;
                          stackIn_44_2 = stackIn_43_2;
                          stackIn_44_3 = stackIn_43_3;
                          stackIn_44_4 = stackIn_43_4;
                          stackIn_44_5 = -this.field_v.field_f + this.field_f;
                          break L19;
                        } else {
                          stackIn_44_0 = (vcb) ((Object) stackIn_43_0);
                          stackIn_44_1 = stackIn_43_1;
                          stackIn_44_2 = stackIn_43_2;
                          stackIn_44_3 = stackIn_43_3;
                          stackIn_44_4 = stackIn_43_4;
                          stackIn_44_5 = 0;
                          break L19;
                        }
                      }
                      ((vcb) (Object) stackIn_44_0).a(stackIn_44_1, stackIn_44_2, stackIn_44_3, stackIn_44_4, stackIn_44_5);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  this.h((byte) -109);
                  return;
                }
              } else {
                L20: {
                  var3 = 0;
                  if (param0 == 16777215) {
                    break L20;
                  } else {
                    this.field_y = (bk) null;
                    break L20;
                  }
                }
                L21: {
                  if (null == this.field_B) {
                    stackIn_8_0 = this.field_h;
                    break L21;
                  } else {
                    stackIn_8_0 = -this.field_B.field_h + this.field_h;
                    break L21;
                  }
                }
                L22: {
                  var4 = stackIn_8_0;
                  if (null != this.field_v) {
                    stackIn_11_0 = this.field_f + -this.field_v.field_f;
                    break L22;
                  } else {
                    stackIn_11_0 = this.field_f;
                    break L22;
                  }
                }
                L23: {
                  var5 = stackIn_11_0;
                  this.field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                  if (null != this.field_B) {
                    L24: {
                      stackIn_15_0 = this.field_B;

                      if (!this.field_A) {
                        stackIn_16_0 = (vcb) ((Object) stackIn_15_0);
                        stackIn_16_1 = 0;
                        break L24;
                      } else {
                        stackIn_16_0 = (vcb) ((Object) stackIn_15_0);
                        stackIn_16_1 = this.field_h + -this.field_B.field_h;
                        break L24;
                      }
                    }
                    ((vcb) (Object) stackIn_16_0).a(stackIn_16_1, this.field_B.field_h, this.field_y.field_f, 1, this.field_y.field_r);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L25: {
                  if (null != this.field_v) {
                    L26: {
                      stackIn_21_0 = this.field_v;

                      stackIn_21_1 = this.field_y.field_g;

                      stackIn_21_2 = this.field_y.field_h;

                      stackIn_21_3 = this.field_v.field_f;

                      stackIn_21_4 = 1;

                      if (this.field_z) {
                        stackIn_22_0 = (vcb) ((Object) stackIn_21_0);
                        stackIn_22_1 = stackIn_21_1;
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = stackIn_21_3;
                        stackIn_22_4 = stackIn_21_4;
                        stackIn_22_5 = -this.field_v.field_f + this.field_f;
                        break L26;
                      } else {
                        stackIn_22_0 = (vcb) ((Object) stackIn_21_0);
                        stackIn_22_1 = stackIn_21_1;
                        stackIn_22_2 = stackIn_21_2;
                        stackIn_22_3 = stackIn_21_3;
                        stackIn_22_4 = stackIn_21_4;
                        stackIn_22_5 = 0;
                        break L26;
                      }
                    }
                    ((vcb) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_22_4, stackIn_22_5);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                this.h((byte) -109);
                return;
              }
            }
          }
        }
        var2 = stackIn_88_0;
        if (!this.field_z) {
          if (this.field_v != null) {
            var3 = this.field_v.field_f;
            if (param0 != 16777215) {
              L27: {
                this.field_y = (bk) null;
                if (null == this.field_B) {
                  stackIn_193_0 = this.field_h;
                  break L27;
                } else {
                  stackIn_193_0 = -this.field_B.field_h + this.field_h;
                  break L27;
                }
              }
              L28: {
                var4 = stackIn_193_0;
                if (null != this.field_v) {
                  stackIn_196_0 = this.field_f + -this.field_v.field_f;
                  break L28;
                } else {
                  stackIn_196_0 = this.field_f;
                  break L28;
                }
              }
              L29: {
                var5 = stackIn_196_0;
                this.field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                if (null != this.field_B) {
                  L30: {
                    stackIn_200_0 = this.field_B;

                    if (!this.field_A) {
                      stackIn_201_0 = (vcb) ((Object) stackIn_200_0);
                      stackIn_201_1 = 0;
                      break L30;
                    } else {
                      stackIn_201_0 = (vcb) ((Object) stackIn_200_0);
                      stackIn_201_1 = this.field_h + -this.field_B.field_h;
                      break L30;
                    }
                  }
                  ((vcb) (Object) stackIn_201_0).a(stackIn_201_1, this.field_B.field_h, this.field_y.field_f, 1, this.field_y.field_r);
                  break L29;
                } else {
                  break L29;
                }
              }
              L31: {
                if (null != this.field_v) {
                  L32: {
                    stackIn_206_0 = this.field_v;

                    stackIn_206_1 = this.field_y.field_g;

                    stackIn_206_2 = this.field_y.field_h;

                    stackIn_206_3 = this.field_v.field_f;

                    stackIn_206_4 = 1;

                    if (this.field_z) {
                      stackIn_207_0 = (vcb) ((Object) stackIn_206_0);
                      stackIn_207_1 = stackIn_206_1;
                      stackIn_207_2 = stackIn_206_2;
                      stackIn_207_3 = stackIn_206_3;
                      stackIn_207_4 = stackIn_206_4;
                      stackIn_207_5 = -this.field_v.field_f + this.field_f;
                      break L32;
                    } else {
                      stackIn_207_0 = (vcb) ((Object) stackIn_206_0);
                      stackIn_207_1 = stackIn_206_1;
                      stackIn_207_2 = stackIn_206_2;
                      stackIn_207_3 = stackIn_206_3;
                      stackIn_207_4 = stackIn_206_4;
                      stackIn_207_5 = 0;
                      break L32;
                    }
                  }
                  ((vcb) (Object) stackIn_207_0).a(stackIn_207_1, stackIn_207_2, stackIn_207_3, stackIn_207_4, stackIn_207_5);
                  break L31;
                } else {
                  break L31;
                }
              }
              this.h((byte) -109);
              return;
            } else {
              L33: {
                if (null == this.field_B) {
                  stackIn_174_0 = this.field_h;
                  break L33;
                } else {
                  stackIn_174_0 = -this.field_B.field_h + this.field_h;
                  break L33;
                }
              }
              L34: {
                var4 = stackIn_174_0;
                if (null != this.field_v) {
                  stackIn_177_0 = this.field_f + -this.field_v.field_f;
                  break L34;
                } else {
                  stackIn_177_0 = this.field_f;
                  break L34;
                }
              }
              L35: {
                var5 = stackIn_177_0;
                this.field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                if (null != this.field_B) {
                  L36: {
                    stackIn_181_0 = this.field_B;

                    if (!this.field_A) {
                      stackIn_182_0 = (vcb) ((Object) stackIn_181_0);
                      stackIn_182_1 = 0;
                      break L36;
                    } else {
                      stackIn_182_0 = (vcb) ((Object) stackIn_181_0);
                      stackIn_182_1 = this.field_h + -this.field_B.field_h;
                      break L36;
                    }
                  }
                  ((vcb) (Object) stackIn_182_0).a(stackIn_182_1, this.field_B.field_h, this.field_y.field_f, 1, this.field_y.field_r);
                  break L35;
                } else {
                  break L35;
                }
              }
              L37: {
                if (null != this.field_v) {
                  L38: {
                    stackIn_187_0 = this.field_v;

                    stackIn_187_1 = this.field_y.field_g;

                    stackIn_187_2 = this.field_y.field_h;

                    stackIn_187_3 = this.field_v.field_f;

                    stackIn_187_4 = 1;

                    if (this.field_z) {
                      stackIn_188_0 = (vcb) ((Object) stackIn_187_0);
                      stackIn_188_1 = stackIn_187_1;
                      stackIn_188_2 = stackIn_187_2;
                      stackIn_188_3 = stackIn_187_3;
                      stackIn_188_4 = stackIn_187_4;
                      stackIn_188_5 = -this.field_v.field_f + this.field_f;
                      break L38;
                    } else {
                      stackIn_188_0 = (vcb) ((Object) stackIn_187_0);
                      stackIn_188_1 = stackIn_187_1;
                      stackIn_188_2 = stackIn_187_2;
                      stackIn_188_3 = stackIn_187_3;
                      stackIn_188_4 = stackIn_187_4;
                      stackIn_188_5 = 0;
                      break L38;
                    }
                  }
                  ((vcb) (Object) stackIn_188_0).a(stackIn_188_1, stackIn_188_2, stackIn_188_3, stackIn_188_4, stackIn_188_5);
                  break L37;
                } else {
                  break L37;
                }
              }
              this.h((byte) -109);
              return;
            }
          } else {
            var3 = 0;
            if (param0 != 16777215) {
              L39: {
                this.field_y = (bk) null;
                if (null == this.field_B) {
                  stackIn_153_0 = this.field_h;
                  break L39;
                } else {
                  stackIn_153_0 = -this.field_B.field_h + this.field_h;
                  break L39;
                }
              }
              L40: {
                var4 = stackIn_153_0;
                if (null != this.field_v) {
                  stackIn_156_0 = this.field_f + -this.field_v.field_f;
                  break L40;
                } else {
                  stackIn_156_0 = this.field_f;
                  break L40;
                }
              }
              L41: {
                var5 = stackIn_156_0;
                this.field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                if (null != this.field_B) {
                  L42: {
                    stackIn_160_0 = this.field_B;

                    if (!this.field_A) {
                      stackIn_161_0 = (vcb) ((Object) stackIn_160_0);
                      stackIn_161_1 = 0;
                      break L42;
                    } else {
                      stackIn_161_0 = (vcb) ((Object) stackIn_160_0);
                      stackIn_161_1 = this.field_h + -this.field_B.field_h;
                      break L42;
                    }
                  }
                  ((vcb) (Object) stackIn_161_0).a(stackIn_161_1, this.field_B.field_h, this.field_y.field_f, 1, this.field_y.field_r);
                  break L41;
                } else {
                  break L41;
                }
              }
              L43: {
                if (null != this.field_v) {
                  L44: {
                    stackIn_166_0 = this.field_v;

                    stackIn_166_1 = this.field_y.field_g;

                    stackIn_166_2 = this.field_y.field_h;

                    stackIn_166_3 = this.field_v.field_f;

                    stackIn_166_4 = 1;

                    if (this.field_z) {
                      stackIn_167_0 = (vcb) ((Object) stackIn_166_0);
                      stackIn_167_1 = stackIn_166_1;
                      stackIn_167_2 = stackIn_166_2;
                      stackIn_167_3 = stackIn_166_3;
                      stackIn_167_4 = stackIn_166_4;
                      stackIn_167_5 = -this.field_v.field_f + this.field_f;
                      break L44;
                    } else {
                      stackIn_167_0 = (vcb) ((Object) stackIn_166_0);
                      stackIn_167_1 = stackIn_166_1;
                      stackIn_167_2 = stackIn_166_2;
                      stackIn_167_3 = stackIn_166_3;
                      stackIn_167_4 = stackIn_166_4;
                      stackIn_167_5 = 0;
                      break L44;
                    }
                  }
                  ((vcb) (Object) stackIn_167_0).a(stackIn_167_1, stackIn_167_2, stackIn_167_3, stackIn_167_4, stackIn_167_5);
                  break L43;
                } else {
                  break L43;
                }
              }
              this.h((byte) -109);
              return;
            } else {
              L45: {
                if (null == this.field_B) {
                  stackIn_134_0 = this.field_h;
                  break L45;
                } else {
                  stackIn_134_0 = -this.field_B.field_h + this.field_h;
                  break L45;
                }
              }
              L46: {
                var4 = stackIn_134_0;
                if (null != this.field_v) {
                  stackIn_137_0 = this.field_f + -this.field_v.field_f;
                  break L46;
                } else {
                  stackIn_137_0 = this.field_f;
                  break L46;
                }
              }
              L47: {
                var5 = stackIn_137_0;
                this.field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                if (null != this.field_B) {
                  L48: {
                    stackIn_141_0 = this.field_B;

                    if (!this.field_A) {
                      stackIn_142_0 = (vcb) ((Object) stackIn_141_0);
                      stackIn_142_1 = 0;
                      break L48;
                    } else {
                      stackIn_142_0 = (vcb) ((Object) stackIn_141_0);
                      stackIn_142_1 = this.field_h + -this.field_B.field_h;
                      break L48;
                    }
                  }
                  ((vcb) (Object) stackIn_142_0).a(stackIn_142_1, this.field_B.field_h, this.field_y.field_f, 1, this.field_y.field_r);
                  break L47;
                } else {
                  break L47;
                }
              }
              L49: {
                if (null != this.field_v) {
                  L50: {
                    stackIn_147_0 = this.field_v;

                    stackIn_147_1 = this.field_y.field_g;

                    stackIn_147_2 = this.field_y.field_h;

                    stackIn_147_3 = this.field_v.field_f;

                    stackIn_147_4 = 1;

                    if (this.field_z) {
                      stackIn_148_0 = (vcb) ((Object) stackIn_147_0);
                      stackIn_148_1 = stackIn_147_1;
                      stackIn_148_2 = stackIn_147_2;
                      stackIn_148_3 = stackIn_147_3;
                      stackIn_148_4 = stackIn_147_4;
                      stackIn_148_5 = -this.field_v.field_f + this.field_f;
                      break L50;
                    } else {
                      stackIn_148_0 = (vcb) ((Object) stackIn_147_0);
                      stackIn_148_1 = stackIn_147_1;
                      stackIn_148_2 = stackIn_147_2;
                      stackIn_148_3 = stackIn_147_3;
                      stackIn_148_4 = stackIn_147_4;
                      stackIn_148_5 = 0;
                      break L50;
                    }
                  }
                  ((vcb) (Object) stackIn_148_0).a(stackIn_148_1, stackIn_148_2, stackIn_148_3, stackIn_148_4, stackIn_148_5);
                  break L49;
                } else {
                  break L49;
                }
              }
              this.h((byte) -109);
              return;
            }
          }
        } else {
          var3 = 0;
          if (param0 != 16777215) {
            L51: {
              this.field_y = (bk) null;
              if (null == this.field_B) {
                stackIn_112_0 = this.field_h;
                break L51;
              } else {
                stackIn_112_0 = -this.field_B.field_h + this.field_h;
                break L51;
              }
            }
            L52: {
              var4 = stackIn_112_0;
              if (null != this.field_v) {
                stackIn_115_0 = this.field_f + -this.field_v.field_f;
                break L52;
              } else {
                stackIn_115_0 = this.field_f;
                break L52;
              }
            }
            L53: {
              var5 = stackIn_115_0;
              this.field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
              if (null != this.field_B) {
                L54: {
                  stackIn_119_0 = this.field_B;

                  if (!this.field_A) {
                    stackIn_120_0 = (vcb) ((Object) stackIn_119_0);
                    stackIn_120_1 = 0;
                    break L54;
                  } else {
                    stackIn_120_0 = (vcb) ((Object) stackIn_119_0);
                    stackIn_120_1 = this.field_h + -this.field_B.field_h;
                    break L54;
                  }
                }
                ((vcb) (Object) stackIn_120_0).a(stackIn_120_1, this.field_B.field_h, this.field_y.field_f, 1, this.field_y.field_r);
                break L53;
              } else {
                break L53;
              }
            }
            L55: {
              if (null != this.field_v) {
                L56: {
                  stackIn_125_0 = this.field_v;

                  stackIn_125_1 = this.field_y.field_g;

                  stackIn_125_2 = this.field_y.field_h;

                  stackIn_125_3 = this.field_v.field_f;

                  stackIn_125_4 = 1;

                  if (this.field_z) {
                    stackIn_126_0 = (vcb) ((Object) stackIn_125_0);
                    stackIn_126_1 = stackIn_125_1;
                    stackIn_126_2 = stackIn_125_2;
                    stackIn_126_3 = stackIn_125_3;
                    stackIn_126_4 = stackIn_125_4;
                    stackIn_126_5 = -this.field_v.field_f + this.field_f;
                    break L56;
                  } else {
                    stackIn_126_0 = (vcb) ((Object) stackIn_125_0);
                    stackIn_126_1 = stackIn_125_1;
                    stackIn_126_2 = stackIn_125_2;
                    stackIn_126_3 = stackIn_125_3;
                    stackIn_126_4 = stackIn_125_4;
                    stackIn_126_5 = 0;
                    break L56;
                  }
                }
                ((vcb) (Object) stackIn_126_0).a(stackIn_126_1, stackIn_126_2, stackIn_126_3, stackIn_126_4, stackIn_126_5);
                break L55;
              } else {
                break L55;
              }
            }
            this.h((byte) -109);
            return;
          } else {
            L57: {
              if (null == this.field_B) {
                stackIn_93_0 = this.field_h;
                break L57;
              } else {
                stackIn_93_0 = -this.field_B.field_h + this.field_h;
                break L57;
              }
            }
            L58: {
              var4 = stackIn_93_0;
              if (null != this.field_v) {
                stackIn_96_0 = this.field_f + -this.field_v.field_f;
                break L58;
              } else {
                stackIn_96_0 = this.field_f;
                break L58;
              }
            }
            L59: {
              var5 = stackIn_96_0;
              this.field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
              if (null != this.field_B) {
                L60: {
                  stackIn_100_0 = this.field_B;

                  if (!this.field_A) {
                    stackIn_101_0 = (vcb) ((Object) stackIn_100_0);
                    stackIn_101_1 = 0;
                    break L60;
                  } else {
                    stackIn_101_0 = (vcb) ((Object) stackIn_100_0);
                    stackIn_101_1 = this.field_h + -this.field_B.field_h;
                    break L60;
                  }
                }
                ((vcb) (Object) stackIn_101_0).a(stackIn_101_1, this.field_B.field_h, this.field_y.field_f, 1, this.field_y.field_r);
                break L59;
              } else {
                break L59;
              }
            }
            L61: {
              if (null != this.field_v) {
                L62: {
                  stackIn_106_0 = this.field_v;

                  stackIn_106_1 = this.field_y.field_g;

                  stackIn_106_2 = this.field_y.field_h;

                  stackIn_106_3 = this.field_v.field_f;

                  stackIn_106_4 = 1;

                  if (this.field_z) {
                    stackIn_107_0 = (vcb) ((Object) stackIn_106_0);
                    stackIn_107_1 = stackIn_106_1;
                    stackIn_107_2 = stackIn_106_2;
                    stackIn_107_3 = stackIn_106_3;
                    stackIn_107_4 = stackIn_106_4;
                    stackIn_107_5 = -this.field_v.field_f + this.field_f;
                    break L62;
                  } else {
                    stackIn_107_0 = (vcb) ((Object) stackIn_106_0);
                    stackIn_107_1 = stackIn_106_1;
                    stackIn_107_2 = stackIn_106_2;
                    stackIn_107_3 = stackIn_106_3;
                    stackIn_107_4 = stackIn_106_4;
                    stackIn_107_5 = 0;
                    break L62;
                  }
                }
                ((vcb) (Object) stackIn_107_0).a(stackIn_107_1, stackIn_107_2, stackIn_107_3, stackIn_107_4, stackIn_107_5);
                break L61;
              } else {
                break L61;
              }
            }
            this.h((byte) -109);
            return;
          }
        }
    }

    private final boolean a(int param0, int param1) {
        if (this.field_B != null) {
          this.field_B.c(param1 + 1715701295, this.field_B.field_K * param0 + this.field_B.field_L);
          return true;
        } else {
          if (param1 != -1715704688) {
            this.e(-30);
            return false;
          } else {
            return false;
          }
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        shb var6 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -15834) {
                break L1;
              } else {
                var6 = (shb) null;
                this.a(-106, -5, (shb) null, '￘');
                break L1;
              }
            }
            if (super.a(param0 + 0, param1, param2, param3)) {
              this.e(-1715704688);
              stackIn_5_0 = 1;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("sha.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1, int param2, shb param3) {
        try {
            super.a(param0, param1, param2 ^ 0, param3);
            if (param2 != -981) {
                shb var6 = (shb) null;
                this.a(23, 55, 77, (shb) null);
            }
            this.h((byte) -113);
            this.e(-1715704688);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "sha.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(int param0) {
        eab var3;
        L0: {
          if (null != this.field_B) {
            this.field_y.field_t.field_r = -(int)((long)(this.field_y.field_t.field_f + -this.field_y.field_f) * (long)this.field_B.field_L >> -1821903600);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == -1715704688) {
          if (null != this.field_v) {
            this.field_y.field_t.field_g = -(int)((long)(this.field_y.field_t.field_h + -this.field_y.field_h) * (long)this.field_v.field_M >> -1715704688);
            return;
          } else {
            return;
          }
        } else {
          var3 = (eab) null;
          sha.a(74, (String) null, -117, -2, (byte) 104, -89, -50, (eab) null, -99);
          if (null == this.field_v) {
            return;
          } else {
            this.field_y.field_t.field_g = -(int)((long)(this.field_y.field_t.field_h + -this.field_y.field_h) * (long)this.field_v.field_M >> -1715704688);
            return;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, shb param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  if (!this.e((byte) -120)) {
                    break L2;
                  } else {
                    if (!this.a(param2, param1 + -1715698682)) {
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_8_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("sha.WA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    static {
        field_x = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
