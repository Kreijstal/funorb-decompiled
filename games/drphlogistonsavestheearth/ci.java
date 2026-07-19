/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends qa {
    private int field_X;
    private qi field_V;
    static int field_W;
    private nh field_Z;
    static volatile boolean field_U;
    static String field_K;
    private String field_Y;

    public static void i(int param0) {
        field_K = null;
        if (param0 > -45) {
            field_W = 31;
        }
    }

    final String e(int param0) {
        if (param0 <= -39) {
            return null;
        }
        field_W = 81;
        return null;
    }

    ci(qi param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, pe.a(2147483647));
        try {
            this.field_V = param0;
            this.field_Y = param1;
            this.a(param3, param5, param2, 16535, param4);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ci.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        this.field_X = this.field_X + 1;
        if (param3 > -127) {
            return;
        }
        try {
            super.a(param0, param1, param2, (byte) -128);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ci.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        vh var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        nh var16 = null;
        String var17 = null;
        Object var18 = null;
        nh var19 = null;
        nh var20 = null;
        nh var21 = null;
        String var22 = null;
        Object var23 = null;
        nh var24 = null;
        nh var25 = null;
        nh var26 = null;
        String var27 = null;
        Object var28 = null;
        nh var29 = null;
        nh var30 = null;
        nh var31 = null;
        String var32 = null;
        Object var33 = null;
        nh var34 = null;
        nh var35 = null;
        nh var36 = null;
        va var38 = null;
        va var39 = null;
        va var40 = null;
        va var41 = null;
        var18 = null;
        var23 = null;
        var28 = null;
        var33 = null;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var6 = this.field_V.a(-12317);
        if (var6 != ai.field_A) {
          if (nd.field_P != var6) {
            var27 = this.field_V.b(-16034);
            if (var27 == null) {
              L0: {
                var32 = this.field_Y;
                if (var32.equals(this.field_p)) {
                  break L0;
                } else {
                  this.field_p = var32;
                  this.h(126);
                  break L0;
                }
              }
              L1: {
                super.a(param0, param1, param2, param3);
                var6 = this.field_V.a(-12317);
                var41 = (va) ((Object) this.field_l);
                var9 = param0 - -this.field_o;
                var10 = var41.a((vg) (this), param3, (byte) -121) + (var41.a((vg) (this), true).b(20111) >> -1489986879);
                if (ai.field_A == var6) {
                  break L1;
                } else {
                  if (var6 == nd.field_P) {
                    break L1;
                  } else {
                    if (var6 != u.field_b) {
                      if (ce.field_e == var6) {
                        var34 = ja.field_n[1];
                        var34.a(var9, var10 - (var34.field_w >> -1369675327), 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var35 = ja.field_n[2];
                      var35.a(var9, var10 - (var35.field_w >> 1549637409), 256);
                      return;
                    }
                  }
                }
              }
              L2: {
                var36 = ja.field_n[0];
                var16 = var36;
                var11 = var36.field_z << 1009571841;
                var12 = var36.field_C << 2001067457;
                if (null == this.field_Z) {
                  break L2;
                } else {
                  if (this.field_Z.field_y < var11) {
                    break L2;
                  } else {
                    if (this.field_Z.field_w >= var12) {
                      aj.a(this.field_Z, (byte) 83);
                      wj.c();
                      var36.b(112, 144, var36.field_z << -1038284572, var36.field_C << 894508132, -this.field_X << 1961322666, 4096);
                      cl.d((byte) -94);
                      this.field_Z.a(-(var36.field_z >> 149902305) + var9, -var36.field_C + var10, 256);
                      return;
                    } else {
                      this.field_Z = new nh(var11, var12);
                      aj.a(this.field_Z, (byte) 85);
                      var36.b(112, 144, var36.field_z << -1038284572, var36.field_C << 894508132, -this.field_X << 1961322666, 4096);
                      cl.d((byte) -94);
                      this.field_Z.a(-(var36.field_z >> 149902305) + var9, -var36.field_C + var10, 256);
                      return;
                    }
                  }
                }
              }
              this.field_Z = new nh(var11, var12);
              aj.a(this.field_Z, (byte) 85);
              var36.b(112, 144, var36.field_z << -1038284572, var36.field_C << 894508132, -this.field_X << 1961322666, 4096);
              cl.d((byte) -94);
              this.field_Z.a(-(var36.field_z >> 149902305) + var9, -var36.field_C + var10, 256);
              return;
            } else {
              L3: {
                if (var27.equals(this.field_p)) {
                  break L3;
                } else {
                  this.field_p = var27;
                  this.h(126);
                  break L3;
                }
              }
              L4: {
                super.a(param0, param1, param2, param3);
                var6 = this.field_V.a(-12317);
                var40 = (va) ((Object) this.field_l);
                var9 = param0 - -this.field_o;
                var10 = var40.a((vg) (this), param3, (byte) -121) + (var40.a((vg) (this), true).b(20111) >> -1489986879);
                if (ai.field_A == var6) {
                  break L4;
                } else {
                  if (var6 == nd.field_P) {
                    break L4;
                  } else {
                    if (var6 != u.field_b) {
                      if (ce.field_e == var6) {
                        var29 = ja.field_n[1];
                        var29.a(var9, var10 - (var29.field_w >> -1369675327), 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var30 = ja.field_n[2];
                      var30.a(var9, var10 - (var30.field_w >> 1549637409), 256);
                      return;
                    }
                  }
                }
              }
              var31 = ja.field_n[0];
              var11 = var31.field_z << 1009571841;
              var12 = var31.field_C << 2001067457;
              if (null != this.field_Z) {
                if (this.field_Z.field_y >= var11) {
                  if (this.field_Z.field_w < var12) {
                    this.field_Z = new nh(var11, var12);
                    aj.a(this.field_Z, (byte) 85);
                    var31.b(112, 144, var31.field_z << -1038284572, var31.field_C << 894508132, -this.field_X << 1961322666, 4096);
                    cl.d((byte) -94);
                    this.field_Z.a(-(var31.field_z >> 149902305) + var9, -var31.field_C + var10, 256);
                    return;
                  } else {
                    aj.a(this.field_Z, (byte) 83);
                    wj.c();
                    var31.b(112, 144, var31.field_z << -1038284572, var31.field_C << 894508132, -this.field_X << 1961322666, 4096);
                    cl.d((byte) -94);
                    this.field_Z.a(-(var31.field_z >> 149902305) + var9, -var31.field_C + var10, 256);
                    return;
                  }
                } else {
                  this.field_Z = new nh(var11, var12);
                  aj.a(this.field_Z, (byte) 85);
                  var31.b(112, 144, var31.field_z << -1038284572, var31.field_C << 894508132, -this.field_X << 1961322666, 4096);
                  cl.d((byte) -94);
                  this.field_Z.a(-(var31.field_z >> 149902305) + var9, -var31.field_C + var10, 256);
                  return;
                }
              } else {
                this.field_Z = new nh(var11, var12);
                aj.a(this.field_Z, (byte) 85);
                var31.b(112, 144, var31.field_z << -1038284572, var31.field_C << 894508132, -this.field_X << 1961322666, 4096);
                cl.d((byte) -94);
                this.field_Z.a(-(var31.field_z >> 149902305) + var9, -var31.field_C + var10, 256);
                return;
              }
            }
          } else {
            L5: {
              var22 = ug.field_T;
              if (var22.equals(this.field_p)) {
                break L5;
              } else {
                this.field_p = var22;
                this.h(126);
                break L5;
              }
            }
            L6: {
              super.a(param0, param1, param2, param3);
              var6 = this.field_V.a(-12317);
              var39 = (va) ((Object) this.field_l);
              var9 = param0 - -this.field_o;
              var10 = var39.a((vg) (this), param3, (byte) -121) + (var39.a((vg) (this), true).b(20111) >> -1489986879);
              if (ai.field_A == var6) {
                break L6;
              } else {
                if (var6 == nd.field_P) {
                  break L6;
                } else {
                  if (var6 != u.field_b) {
                    if (ce.field_e != var6) {
                      return;
                    } else {
                      var24 = ja.field_n[1];
                      var24.a(var9, var10 - (var24.field_w >> -1369675327), 256);
                      return;
                    }
                  } else {
                    var25 = ja.field_n[2];
                    var25.a(var9, var10 - (var25.field_w >> 1549637409), 256);
                    return;
                  }
                }
              }
            }
            var26 = ja.field_n[0];
            var11 = var26.field_z << 1009571841;
            var12 = var26.field_C << 2001067457;
            if (null != this.field_Z) {
              if (this.field_Z.field_y >= var11) {
                if (this.field_Z.field_w >= var12) {
                  aj.a(this.field_Z, (byte) 83);
                  wj.c();
                  var26.b(112, 144, var26.field_z << -1038284572, var26.field_C << 894508132, -this.field_X << 1961322666, 4096);
                  cl.d((byte) -94);
                  this.field_Z.a(-(var26.field_z >> 149902305) + var9, -var26.field_C + var10, 256);
                  return;
                } else {
                  this.field_Z = new nh(var11, var12);
                  aj.a(this.field_Z, (byte) 85);
                  var26.b(112, 144, var26.field_z << -1038284572, var26.field_C << 894508132, -this.field_X << 1961322666, 4096);
                  cl.d((byte) -94);
                  this.field_Z.a(-(var26.field_z >> 149902305) + var9, -var26.field_C + var10, 256);
                  return;
                }
              } else {
                this.field_Z = new nh(var11, var12);
                aj.a(this.field_Z, (byte) 85);
                var26.b(112, 144, var26.field_z << -1038284572, var26.field_C << 894508132, -this.field_X << 1961322666, 4096);
                cl.d((byte) -94);
                this.field_Z.a(-(var26.field_z >> 149902305) + var9, -var26.field_C + var10, 256);
                return;
              }
            } else {
              this.field_Z = new nh(var11, var12);
              aj.a(this.field_Z, (byte) 85);
              var26.b(112, 144, var26.field_z << -1038284572, var26.field_C << 894508132, -this.field_X << 1961322666, 4096);
              cl.d((byte) -94);
              this.field_Z.a(-(var26.field_z >> 149902305) + var9, -var26.field_C + var10, 256);
              return;
            }
          }
        } else {
          L7: {
            var17 = ug.field_T;
            if (var17.equals(this.field_p)) {
              break L7;
            } else {
              this.field_p = var17;
              this.h(126);
              break L7;
            }
          }
          L8: {
            super.a(param0, param1, param2, param3);
            var6 = this.field_V.a(-12317);
            var38 = (va) ((Object) this.field_l);
            var9 = param0 - -this.field_o;
            var10 = var38.a((vg) (this), param3, (byte) -121) + (var38.a((vg) (this), true).b(20111) >> -1489986879);
            if (ai.field_A == var6) {
              break L8;
            } else {
              if (var6 == nd.field_P) {
                break L8;
              } else {
                if (var6 != u.field_b) {
                  if (ce.field_e != var6) {
                    return;
                  } else {
                    var19 = ja.field_n[1];
                    var19.a(var9, var10 - (var19.field_w >> -1369675327), 256);
                    return;
                  }
                } else {
                  var20 = ja.field_n[2];
                  var20.a(var9, var10 - (var20.field_w >> 1549637409), 256);
                  return;
                }
              }
            }
          }
          var21 = ja.field_n[0];
          var11 = var21.field_z << 1009571841;
          var12 = var21.field_C << 2001067457;
          if (null != this.field_Z) {
            if (this.field_Z.field_y >= var11) {
              if (this.field_Z.field_w < var12) {
                this.field_Z = new nh(var11, var12);
                aj.a(this.field_Z, (byte) 85);
                var21.b(112, 144, var21.field_z << -1038284572, var21.field_C << 894508132, -this.field_X << 1961322666, 4096);
                cl.d((byte) -94);
                this.field_Z.a(-(var21.field_z >> 149902305) + var9, -var21.field_C + var10, 256);
                return;
              } else {
                aj.a(this.field_Z, (byte) 83);
                wj.c();
                var21.b(112, 144, var21.field_z << -1038284572, var21.field_C << 894508132, -this.field_X << 1961322666, 4096);
                cl.d((byte) -94);
                this.field_Z.a(-(var21.field_z >> 149902305) + var9, -var21.field_C + var10, 256);
                return;
              }
            } else {
              this.field_Z = new nh(var11, var12);
              aj.a(this.field_Z, (byte) 85);
              var21.b(112, 144, var21.field_z << -1038284572, var21.field_C << 894508132, -this.field_X << 1961322666, 4096);
              cl.d((byte) -94);
              this.field_Z.a(-(var21.field_z >> 149902305) + var9, -var21.field_C + var10, 256);
              return;
            }
          } else {
            this.field_Z = new nh(var11, var12);
            aj.a(this.field_Z, (byte) 85);
            var21.b(112, 144, var21.field_z << -1038284572, var21.field_C << 894508132, -this.field_X << 1961322666, 4096);
            cl.d((byte) -94);
            this.field_Z.a(-(var21.field_z >> 149902305) + var9, -var21.field_C + var10, 256);
            return;
          }
        }
    }

    final boolean a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ci.M(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_U = false;
        field_K = "Type your age in years";
    }
}
