/*
 * Decompiled by CFR-JS 0.4.0.
 */
class iu {
    static int field_t;
    int field_g;
    static boolean field_n;
    private int field_p;
    private int field_f;
    int field_w;
    static je field_d;
    static String field_b;
    private int field_m;
    private int field_j;
    private boolean field_v;
    private boolean field_o;
    boolean field_c;
    GameplayController field_q;
    static String field_l;
    static String field_r;
    int field_k;
    private boolean field_s;
    static String field_i;
    private String field_e;
    private int field_a;
    static boolean field_h;
    static int field_x;
    static String field_u;

    private final boolean c(byte param0) {
        if (this.field_q.battlefield.unitsByPlayer[1].b(false) == 0 &&
          this.field_q.battlefield.tiles[DeployAction.field_s[0]].ownerPlayer == 0) {
          return true;
        }
        if (param0 != -62) {
          this.h((byte) -125);
        }
        return false;
    }

    final void a(String param0, byte param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_e = param0;
          if (this.field_e != null &&
            this.field_c) {
            this.field_a = 50 + rs.field_n.a(this.field_e, 220, 0);
            this.field_f = 240;
            if (ArmiesOfGielinor.obfuscationControl) {
              this.field_a = 40;
              if (this.field_k == 34) {
                this.field_f = 100;
              }
            }
          } else {
            this.field_a = 40;
            if (this.field_k == 34) {
              this.field_f = 100;
            }
          }
          if (param1 <= 108) {
            this.j((byte) 81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("iu.FA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 != -3) {
          return;
        }
        if (param2 == 5) {
          param2 = this.a(param0, (byte) -124);
        }
        if (this.c((byte) -62) &&
          this.field_v) {
          this.b(28, -30659);
          return;
        }
        regionExit1: {
          boolean decompiledFrameRemainder1 = true;
          regionExit2: {
            regionExit3: {
              regionExit4: {
                regionExit5: {
                  regionExit6: {
                    regionExit7: {
                      regionExit8: {
                        regionExit9: {
                          boolean decompiledFrameRemainder22 = true;
                          boolean decompiledFrameRemainder21 = true;
                          boolean decompiledFrameRemainder20 = true;
                          boolean decompiledFrameRemainder19 = true;
                          boolean decompiledFrameRemainder18 = true;
                          boolean decompiledFrameRemainder17 = true;
                          boolean decompiledFrameRemainder16 = true;
                          boolean decompiledFrameRemainder15 = true;
                          boolean decompiledFrameRemainder14 = true;
                          boolean decompiledFrameRemainder13 = true;
                          boolean decompiledFrameRemainder12 = true;
                          boolean decompiledFrameRemainder11 = true;
                          boolean decompiledFrameRemainder10 = true;
                          boolean decompiledFrameRemainder9 = true;
                          boolean decompiledFrameRemainder8 = true;
                          boolean decompiledFrameRemainder7 = true;
                          boolean decompiledFrameRemainder6 = true;
                          boolean decompiledFrameRemainder5 = true;
                          boolean decompiledFrameRemainder4 = true;
                          boolean decompiledFrameRemainder3 = true;
                          boolean decompiledFrameRemainder2 = true;
                          boolean decompiledFrameRemainder0 = true;
                          var4 = this.field_k;
                          if (var4 == 0) {
                            if (param2 != 1) {
                              break regionExit1;
                            }
                            this.b(1, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          } else {
                            if ((var4 != 1) &&
                              (decompiledFrameRemainder0 = (2 != var4)) &&
                              (decompiledFrameRemainder2 = (var4 != 3)) &&
                              (decompiledFrameRemainder3 = (var4 != 4 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder4 = (var4 != 5)) &&
                              (decompiledFrameRemainder5 = (var4 != 6)) &&
                              (decompiledFrameRemainder6 = (var4 != 7 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder7 = (var4 != 8)) &&
                              (decompiledFrameRemainder8 = (var4 != 9 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder9 = (30 != var4 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder10 = (var4 != 10)) &&
                              (decompiledFrameRemainder11 = (11 != var4)) &&
                              (decompiledFrameRemainder12 = (var4 != 12)) &&
                              (decompiledFrameRemainder13 = (var4 != 13)) &&
                              (decompiledFrameRemainder14 = (var4 != 14 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder15 = (var4 != 15)) &&
                              (decompiledFrameRemainder16 = (var4 != 16 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder17 = (var4 != 17 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder18 = (18 != var4)) &&
                              (decompiledFrameRemainder19 = (31 != var4)) &&
                              (decompiledFrameRemainder20 = (32 != var4)) &&
                              (decompiledFrameRemainder21 = (var4 != 19 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder22 = (20 != var4))) {
                              if (var4 == 21 &&
                                var5 == 0) {
                                break regionExit9;
                              }
                              if (var4 == 29) {
                                break regionExit8;
                              }
                              if (var4 == 22) {
                                break regionExit7;
                              }
                              if (var4 == 23 &&
                                var5 == 0) {
                                break regionExit6;
                              }
                              if (var4 == 24) {
                                break regionExit5;
                              }
                              if (var4 == 25 &&
                                var5 == 0) {
                                break regionExit4;
                              }
                              if (var4 == 26) {
                                break regionExit3;
                              }
                              if (27 == var4 &&
                                var5 == 0) {
                                break regionExit2;
                              }
                              decompiledFrameRemainder1 = (var4 != 34);
                              if (decompiledFrameRemainder1) {
                                break regionExit1;
                              }
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder6) &&
                            (decompiledFrameRemainder5) &&
                            (decompiledFrameRemainder4) &&
                            (decompiledFrameRemainder3) &&
                            (decompiledFrameRemainder2) &&
                            (decompiledFrameRemainder1) &&
                            (decompiledFrameRemainder0)) {
                            if (param2 != 2) {
                              break regionExit1;
                            }
                            this.b(2, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder6) &&
                            (decompiledFrameRemainder5) &&
                            (decompiledFrameRemainder4) &&
                            (decompiledFrameRemainder3) &&
                            (decompiledFrameRemainder2) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 != 3) {
                              break regionExit1;
                            }
                            this.b(3, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder6) &&
                            (decompiledFrameRemainder5) &&
                            (decompiledFrameRemainder4) &&
                            (decompiledFrameRemainder3) &&
                            (decompiledFrameRemainder1)) {
                            if (2 != param2) {
                              if (param2 != 4) {
                                break regionExit1;
                              }
                              this.b(5, param1 - 30656);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            this.b(4, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder6) &&
                            (decompiledFrameRemainder5) &&
                            (decompiledFrameRemainder4) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 != 4) {
                              break regionExit1;
                            }
                            this.b(5, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder6) &&
                            (decompiledFrameRemainder5) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 == 2) {
                              this.b(6, -30659);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            if (param2 == 6) {
                              this.b(8, -30659);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            if (7 == param2) {
                              this.b(9, -30659);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            if (param2 != 9) {
                              break regionExit1;
                            }
                            this.b(10, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder6) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 != 18 &&
                              5 != param2 &&
                              param2 != 9) {
                              break regionExit1;
                            }
                            this.b(7, param1 ^ 30656);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 != 6) {
                              if (param2 == 7) {
                                this.b(9, param1 ^ 30656);
                                if (var5 == 0) {
                                  break regionExit1;
                                }
                              }
                              if (param2 != 9) {
                                break regionExit1;
                              }
                              this.b(10, param1 - 30656);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            this.b(8, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 == 2) {
                              this.b(30, -30659);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            if (param2 != 14) {
                              break regionExit1;
                            }
                            this.b(12, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 == 2) {
                              this.b(30, -30659);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            if (14 != param2) {
                              break regionExit1;
                            }
                            this.b(12, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 == 2) {
                              this.b(11, -30659);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            if (param2 != 14) {
                              break regionExit1;
                            }
                            this.b(12, param1 ^ 30656);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 != 14) {
                              break regionExit1;
                            }
                            this.b(12, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 != 14) {
                              break regionExit1;
                            }
                            this.b(12, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder1)) {
                            if (this.field_s ||
                              param2 != 6) {
                              if (this.field_o ||
                                param2 != 7) {
                                if (param2 != 2) {
                                  break regionExit1;
                                }
                                if (!this.field_s) {
                                  this.b(13, -30659);
                                  if (var5 == 0) {
                                    break regionExit1;
                                  }
                                }
                                if (this.field_o) {
                                  this.b(31, param1 - 30656);
                                  if (var5 == 0) {
                                    break regionExit1;
                                  }
                                }
                                this.b(16, param1 - 30656);
                                if (var5 == 0) {
                                  break regionExit1;
                                }
                              }
                              this.b(17, param1 - 30656);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            this.b(14, param1 ^ 30656);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder1)) {
                            if (6 != param2) {
                              break regionExit1;
                            }
                            this.b(14, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 == 14) {
                              if (!this.field_o) {
                                this.b(16, param1 - 30656);
                                if (var5 != 0) {
                                  this.b(31, -30659);
                                }
                              } else {
                                this.b(31, -30659);
                              }
                            }
                            if (2 != param2) {
                              break regionExit1;
                            }
                            this.b(15, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder1) &&
                            (14 == param2)) {
                            if (!this.field_o) {
                              this.b(16, -30659);
                              if (var5 != 0) {
                                this.b(31, -30659);
                              }
                            } else {
                              this.b(31, -30659);
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder1)) {
                            if (7 != param2) {
                              break regionExit1;
                            }
                            this.b(17, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 == 14) {
                              if (!this.field_s) {
                                this.b(13, param1 - 30656);
                                if (var5 != 0) {
                                  this.b(31, -30659);
                                }
                              } else {
                                this.b(31, -30659);
                              }
                            }
                            if (param2 != 2) {
                              break regionExit1;
                            }
                            this.b(18, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder1) &&
                            (14 == param2)) {
                            if (!this.field_s) {
                              this.b(13, -30659);
                              if (var5 != 0) {
                                this.b(31, -30659);
                              }
                            } else {
                              this.b(31, -30659);
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 != 2) {
                              break regionExit1;
                            }
                            this.b(32, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 != 2) {
                              break regionExit1;
                            }
                            this.b(19, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder1)) {
                            if (param2 != 3) {
                              break regionExit1;
                            }
                            this.b(20, param1 - 30656);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if (decompiledFrameRemainder1) {
                            if (2 == param2) {
                              this.b(21, -30659);
                            }
                            if (param2 != 16) {
                              break regionExit1;
                            }
                            this.b(29, param1 - 30656);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                        }
                        if (decompiledFrameRemainder1) {
                          if (param2 != 16) {
                            break regionExit1;
                          }
                          this.b(29, -30659);
                          if (var5 == 0) {
                            break regionExit1;
                          }
                        }
                      }
                      if (decompiledFrameRemainder1) {
                        if (param2 != 17) {
                          break regionExit1;
                        }
                        this.b(22, -30659);
                        if (var5 == 0) {
                          break regionExit1;
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      if (10 != param2) {
                        break regionExit1;
                      }
                      this.b(23, -30659);
                      if (var5 == 0) {
                        break regionExit1;
                      }
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    if (11 != param2) {
                      break regionExit1;
                    }
                    this.b(24, -30659);
                    if (var5 == 0) {
                      break regionExit1;
                    }
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (param2 != 12) {
                    break regionExit1;
                  }
                  this.b(25, -30659);
                  if (var5 == 0) {
                    break regionExit1;
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                if (param2 != 2) {
                  break regionExit1;
                }
                this.b(26, param1 - 30656);
                if (var5 == 0) {
                  break regionExit1;
                }
              }
            }
            if (decompiledFrameRemainder1) {
              if (param2 != 2) {
                break regionExit1;
              }
              this.b(27, -30659);
              if (var5 == 0) {
                break regionExit1;
              }
            }
          }
          if (decompiledFrameRemainder1) {
            if (param2 != 13 &&
              param2 != 15) {
              break regionExit1;
            }
            if (!this.c((byte) -62)) {
              break regionExit1;
            }
            this.b(28, param1 - 30656);
            if (var5 == 0) {
              break regionExit1;
            }
          }
          if (param2 == 2) {
            this.field_j = 0;
          }
        }
    }

    final void f(int param0) {
        int stackIn_13_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_23_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_28_1 = 0;
        int stackIn_29_2 = 0;
        int var2;
        int var3;
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        var2 = 40;
        if (this.field_k != 33) {
          if (this.field_c) {
            var2 = this.field_a;
            if (ArmiesOfGielinor.obfuscationControl) {
              var2 = 0;
            }
          }
        } else {
          var2 = 0;
        }
        if (0 < this.field_m) {
          this.field_m = this.field_m - 1;
          if (this.field_m == 0) {
            this.b(-1, -3, 1);
          }
        }
        var3 = 0 / ((-9 - param0) / 47);
        if (var2 < this.field_j) {
          var4 = -var2 + this.field_j;
          stackIn_13_1 = this.field_j;
          if (var4 > 5) {
            stackIn_14_2 = 5;
          } else {
            stackIn_14_2 = var4;
          }
          this.field_j = stackIn_13_1 - stackIn_14_2;
        }
        if (var2 > this.field_j) {
          var4Lifetime1 = -this.field_j + var2;
          stackIn_18_1 = this.field_j;
          if (5 < var4Lifetime1) {
            stackIn_19_2 = 5;
          } else {
            stackIn_19_2 = var4Lifetime1;
          }
          this.field_j = stackIn_18_1 + stackIn_19_2;
        }
        if (this.field_g > this.field_f) {
          var4Lifetime2 = this.field_g - this.field_f;
          stackIn_23_1 = this.field_g;
          if (var4Lifetime2 > 5) {
            stackIn_24_2 = 5;
          } else {
            stackIn_24_2 = var4Lifetime2;
          }
          this.field_g = stackIn_23_1 - stackIn_24_2;
        }
        if (this.field_f > this.field_g) {
          var4Lifetime3 = this.field_f - this.field_g;
          stackIn_28_1 = this.field_g;
          if (var4Lifetime3 > 5) {
            stackIn_29_2 = 5;
          } else {
            stackIn_29_2 = var4Lifetime3;
          }
          this.field_g = stackIn_28_1 + stackIn_29_2;
        }
    }

    private final void b(byte param0) {
        if (param0 <= 72) {
          return;
        }
        this.field_q.field_jc = true;
    }

    private final void g(int param0) {
        int var2 = 103 / ((param0 + 42) / 55);
        uh.a(sb.field_g, 125);
    }

    private final void g(byte param0) {
        int var2 = -88 % ((param0 - 8) / 48);
        this.field_q.field_Ab = true;
    }

    private final void b(int param0, int param1) {
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_c = true;
        this.field_k = param0;
        this.d((byte) 37);
        if (param1 != -30659) {
          this.field_g = -114;
        }
        regionExit1: {
          regionExit2: {
            regionExit3: {
              regionExit4: {
                regionExit5: {
                  regionExit6: {
                    regionExit7: {
                      regionExit8: {
                        regionExit9: {
                          regionExit10: {
                            boolean decompiledFrameRemainder23 = true;
                            boolean decompiledFrameRemainder22 = true;
                            boolean decompiledFrameRemainder21 = true;
                            boolean decompiledFrameRemainder20 = true;
                            boolean decompiledFrameRemainder19 = true;
                            boolean decompiledFrameRemainder18 = true;
                            boolean decompiledFrameRemainder17 = true;
                            boolean decompiledFrameRemainder16 = true;
                            boolean decompiledFrameRemainder15 = true;
                            boolean decompiledFrameRemainder14 = true;
                            boolean decompiledFrameRemainder13 = true;
                            boolean decompiledFrameRemainder12 = true;
                            boolean decompiledFrameRemainder11 = true;
                            boolean decompiledFrameRemainder10 = true;
                            boolean decompiledFrameRemainder9 = true;
                            boolean decompiledFrameRemainder8 = true;
                            boolean decompiledFrameRemainder7 = true;
                            boolean decompiledFrameRemainder6 = true;
                            boolean decompiledFrameRemainder5 = true;
                            boolean decompiledFrameRemainder4 = true;
                            boolean decompiledFrameRemainder3 = true;
                            boolean decompiledFrameRemainder2 = true;
                            boolean decompiledFrameRemainder1 = true;
                            boolean decompiledFrameRemainder0 = true;
                            var3 = this.field_k;
                            if (var3 == 0 &&
                              var4 == 0) {
                              this.field_w = 2;
                              this.field_m = 150;
                              this.field_e = TutorialController.field_f[0];
                              break regionExit2;
                            } else if (var3 != 1 ||
                              var4 != 0) {
                              decompiledFrameRemainder0 = (2 != var3 ||
                                var4 != 0);
                              if ((decompiledFrameRemainder0) &&
                                (decompiledFrameRemainder1 = (var3 != 3 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder2 = (4 != var3)) &&
                                (decompiledFrameRemainder3 = (var3 != 5 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder4 = (var3 != 6)) &&
                                (decompiledFrameRemainder5 = (7 != var3 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder6 = (8 != var3 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder7 = (var3 != 9)) &&
                                (decompiledFrameRemainder8 = (var3 != 30 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder9 = (var3 != 10)) &&
                                (decompiledFrameRemainder10 = (11 != var3 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder11 = (12 != var3)) &&
                                (decompiledFrameRemainder12 = (13 != var3 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder13 = (var3 != 14 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder14 = (var3 != 15)) &&
                                (decompiledFrameRemainder15 = (var3 != 16 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder16 = (17 != var3)) &&
                                (decompiledFrameRemainder17 = (var3 != 18 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder18 = (var3 != 31)) &&
                                (decompiledFrameRemainder19 = (var3 != 32)) &&
                                (decompiledFrameRemainder20 = (var3 != 19)) &&
                                (decompiledFrameRemainder21 = (var3 != 20 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder22 = (var3 != 21)) &&
                                (decompiledFrameRemainder23 = (var3 != 22))) {
                                if (var3 == 23) {
                                  break regionExit10;
                                }
                                if (var3 == 24 &&
                                  var4 == 0) {
                                  break regionExit9;
                                }
                                if (var3 == 25) {
                                  break regionExit8;
                                }
                                if (26 == var3) {
                                  break regionExit7;
                                }
                                if (var3 == 27 &&
                                  var4 == 0) {
                                  break regionExit6;
                                }
                                switch (var3) {
                                  case 28:
                                    break regionExit5;
                                  case 29:
                                    break regionExit4;
                                  case 34:
                                    break regionExit3;
                                  default:
                                    this.a(this.field_e, (byte) 112);
                                    break regionExit1;
                                }
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder4) &&
                              (decompiledFrameRemainder3) &&
                              (decompiledFrameRemainder2) &&
                              (decompiledFrameRemainder1) &&
                              (decompiledFrameRemainder0)) {
                              this.field_e = TutorialController.field_f[1];
                              this.field_w = 0;
                              break regionExit2;
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder4) &&
                              (decompiledFrameRemainder3) &&
                              (decompiledFrameRemainder2) &&
                              (decompiledFrameRemainder1)) {
                              this.field_e = null;
                              this.a(3, 4, param1 + 30685);
                              this.field_w = 2;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder4) &&
                              (decompiledFrameRemainder3) &&
                              (decompiledFrameRemainder2)) {
                              this.d(-4);
                              this.field_e = TutorialController.field_f[2];
                              this.field_w = 0;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder4) &&
                              (decompiledFrameRemainder3)) {
                              this.field_e = TutorialController.field_f[3];
                              this.field_w = 1;
                              this.a((byte) -122);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder4)) {
                              this.field_e = TutorialController.field_f[4];
                              this.field_w = 0;
                              this.f((byte) -34);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5)) {
                              this.field_w = 1;
                              this.field_e = TutorialController.field_f[5];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6)) {
                              this.field_w = 1;
                              this.field_e = TutorialController.field_f[6];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7)) {
                              this.field_w = 0;
                              this.field_e = TutorialController.field_f[8];
                              this.field_s = true;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8)) {
                              this.field_o = true;
                              this.field_w = 0;
                              this.field_e = TutorialController.field_f[7];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9)) {
                              this.field_w = 0;
                              this.field_e = TutorialController.field_f[25];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10)) {
                              this.b((byte) 113);
                              this.field_w = 1;
                              this.field_e = TutorialController.field_f[9];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11)) {
                              this.b((byte) 111);
                              this.field_w = 1;
                              this.field_e = TutorialController.field_f[10];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12)) {
                              this.field_w = 0;
                              this.field_e = TutorialController.field_f[11];
                              this.e(31);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13)) {
                              this.field_w = 1;
                              this.field_e = TutorialController.field_f[12];
                              this.g(26);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14)) {
                              this.field_e = TutorialController.field_f[8];
                              this.f((byte) -34);
                              this.field_s = true;
                              this.field_w = 0;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15)) {
                              this.field_e = TutorialController.field_f[14];
                              this.f((byte) -34);
                              this.b((byte) 120);
                              this.field_w = 1;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16)) {
                              this.field_e = TutorialController.field_f[13];
                              this.field_w = 1;
                              this.a(5);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17)) {
                              this.field_e = TutorialController.field_f[7];
                              this.f((byte) -34);
                              this.field_w = 0;
                              this.field_o = true;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18)) {
                              this.field_e = TutorialController.field_f[14];
                              this.f((byte) -34);
                              this.b((byte) 90);
                              this.field_w = 1;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19)) {
                              this.field_e = TutorialController.field_f[26];
                              this.field_w = 0;
                              this.j((byte) -119);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20)) {
                              this.field_e = TutorialController.field_f[27];
                              this.field_w = 0;
                              this.k((byte) -120);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21)) {
                              this.field_w = 2;
                              this.field_e = null;
                              this.c(param1 ^ -30659);
                              this.a(13, 17, 26);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22)) {
                              this.field_w = 0;
                              this.field_e = TutorialController.field_f[15];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if (decompiledFrameRemainder23) {
                              this.field_e = TutorialController.field_f[16];
                              this.field_w = 1;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            this.field_e = TutorialController.field_f[17];
                            this.field_w = 1;
                            if (var4 == 0) {
                              break regionExit2;
                            }
                          }
                          this.field_e = TutorialController.field_f[18];
                          this.field_w = 1;
                          if (var4 == 0) {
                            break regionExit2;
                          }
                        }
                        this.field_e = TutorialController.field_f[19];
                        this.field_w = 1;
                        if (var4 == 0) {
                          break regionExit2;
                        }
                      }
                      this.field_e = TutorialController.field_f[20];
                      this.field_w = 0;
                      this.g((byte) 59);
                      if (var4 == 0) {
                        break regionExit2;
                      }
                    }
                    this.field_w = 0;
                    this.field_e = TutorialController.field_f[21];
                    this.e((byte) 115);
                    if (var4 == 0) {
                      break regionExit2;
                    }
                  }
                  this.field_e = TutorialController.field_f[22];
                  this.f((byte) -34);
                  this.field_w = 1;
                  if (var4 == 0) {
                    break regionExit2;
                  }
                }
                this.field_e = TutorialController.field_f[23];
                this.field_w = 3;
                this.i((byte) 44);
                if (var4 == 0) {
                  break regionExit2;
                }
              }
              this.field_w = 1;
              this.field_e = TutorialController.field_f[24];
              if (var4 == 0) {
                break regionExit2;
              }
            }
            this.field_e = vl.field_m[this.field_p];
            this.field_w = 1;
          }
          this.a(this.field_e, (byte) 112);
        }
    }

    private final void a(int param0) {
        uh.a(m.field_a, 124);
        if (param0 != 5) {
          this.field_a = 30;
        }
    }

    private final void c(int param0) {
        this.field_q.battlefield.tiles[9 + this.field_q.battlefield.mapWidth * 12].terrainType = 10;
        nk.a((byte) 106);
        this.field_q.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new SummonEvent(0, 9, 12, -4, 1)));
        this.field_q.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new SummonEvent(0, 15, 13, param0, 1)));
        this.field_q.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new SummonEvent(5, 16, 17, 0, 1)));
        this.field_v = true;
    }

    private final void a(byte param0) {
        if (param0 != -122) {
          this.f((byte) 104);
        }
        uh.a(f.field_D, 125);
    }

    final void h(byte param0) {
        int stackIn_12_0;
        int stackIn_12_1;
        int stackIn_12_2;
        int stackIn_12_3;
        RgbSprite[] stackIn_12_4;
        int[] stackIn_13_5 = null;
        int stackIn_20_0 = 0;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 21) {
          this.field_a = -21;
        }
        if (this.field_k == 0) {
          ol.field_y.g(db.a(true, 320) - (ol.field_y.field_y >> 1), u.a(100, (byte) 94));
          fe.b(this.field_e, db.a(true, 320), u.a(130, (byte) 94));
          fe.c(this.field_e, db.a(true, 320), u.a(130, (byte) 94), nd.field_b, false);
          this.field_j = 40;
        }
        if (0 == this.field_j) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        var2 = so.field_b.field_a;
        var3 = so.field_b.field_g;
        SoftwareRaster.f(-10 + var2 - this.field_g, -this.field_j + var3 - 10, -10 + var2, var3);
        fe.b(-10 + (-this.field_g + var2), -10 - this.field_j + var3, this.field_g, this.field_j, io.field_m, nd.field_b, 0, 192);
        if (4 != this.field_w) {
          stackIn_12_0 = -5 + var2 - this.field_g;
          stackIn_12_1 = -45 + var3;
          stackIn_12_2 = this.field_g - 10;
          stackIn_12_3 = 30;
          stackIn_12_4 = DisplacedUnitMarker.field_s;
          if (this.field_w != 2 &&
            wg.a(param0 - 54, -5 - this.field_g + var2, var2 - 15, -45 + var3, var3 - 15)) {
            stackIn_13_5 = TutorialController.field_e;
          } else {
            stackIn_13_5 = nd.field_b;
          }
          fe.a(stackIn_12_0, stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_12_4, stackIn_13_5, 0, 192, true);
          if (this.field_w == 0) {
            fe.c(qf.field_c, -10 + (-120 + var2), -16 + var3, 0, true);
            decompiledFrameRemainder0 = (var5 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (this.field_w == 1) {
              stackIn_20_0 = (this.field_k != 34) ? 0 : 1;
              var4 = stackIn_20_0;
              if (!this.field_c) {
                if (var4 != 0) {
                  stackIn_24_0 = vg.field_k;
                } else {
                  stackIn_24_0 = DeployAction.field_z;
                }
                fe.c(stackIn_24_0, var2 - this.field_g / 2 - 10, var3 - 16, 0, true);
                if (var5 != 0) {
                  if (var4 == 0) {
                    stackIn_28_0 = jk.field_a;
                  } else {
                    stackIn_28_0 = SkeletonLimitMarker.field_t;
                  }
                  fe.c(stackIn_28_0, -10 + (var2 - this.field_g / 2), var3 - 16, 0, true);
                }
              } else {
                if (var4 == 0) {
                  stackIn_28_0 = jk.field_a;
                } else {
                  stackIn_28_0 = SkeletonLimitMarker.field_t;
                }
                fe.c(stackIn_28_0, -10 + (var2 - this.field_g / 2), var3 - 16, 0, true);
              }
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.field_w == 2) {
                fe.c(bc.field_f, -120 + var2 - 10, -16 + var3, 0, true);
                decompiledFrameRemainder0 = (var5 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (this.field_w == 3) {
                  fe.c(ac.field_u, -10 + var2 - 120, -16 + var3, 0, true);
                  decompiledFrameRemainder0 = (var5 != 0);
                }
                if ((decompiledFrameRemainder0) &&
                  (this.field_w == 5)) {
                  fe.c(GlobalSpell.field_m, -120 + var2 - 10, var3 - 16, 0, true);
                  if (var5 != 0) {
                    fe.a(-5 - this.field_g + var2, -45 + var3, -10 + this.field_g, 30, DisplacedUnitMarker.field_s, jh.field_k, 0, 192, true);
                  }
                }
              }
            }
          }
        } else {
          fe.a(-5 - this.field_g + var2, -45 + var3, -10 + this.field_g, 30, DisplacedUnitMarker.field_s, jh.field_k, 0, 192, true);
        }
        if (this.field_e != null) {
          SoftwareRaster.f(var2 - this.field_g, -this.field_j + var3, var2 - 10, var3 - 45);
          rs.field_n.a(this.field_e, -this.field_g + var2, -this.field_j + var3, 220, 400, 16777215, -1, 0, 0, 0);
        }
        SoftwareRaster.a();
    }

    private final void a(int param0, int param1, int param2) {
        if (param2 != 26) {
          return;
        }
        this.field_q.c(25, param0, param1);
    }

    final void d(byte param0) {
        this.field_q.field_fc = false;
        this.field_q.field_Mb = false;
        this.field_q.field_Ab = false;
        this.field_q.field_ac = false;
        if (param0 != 37) {
          field_i = (String) null;
        }
    }

    private final void a(int param0, int param1) {
        if (param1 != 13567) {
          return;
        }
        this.field_p = param0;
        this.b(34, -30659);
    }

    private final void e(byte param0) {
        if (param0 <= 90) {
          return;
        }
        uh.a(DeployAction.field_s, -91);
    }

    private final void i(byte param0) {
        RevivalEvent.d((byte) 113);
        int var2 = 47 / ((param0 + 75) / 34);
        this.field_q.a(0, (byte) 30, 255);
    }

    final void a(boolean param0) {
        int var3;
        boolean stackIn_13_1 = false;
        int stackIn_18_1 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0) {
          this.a((byte) -26);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_w != 0) {
          if (1 != this.field_w) {
            if (this.field_w == 3) {
              this.field_q.d(114, true);
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if ((decompiledFrameRemainder0) &&
              (this.field_w == 5)) {
              this.field_k = 33;
              if (var3 != 0) {
                stackIn_13_1 = !(this.field_c);
                this.field_c = stackIn_13_1;
                if (!this.field_c) {
                  if (this.field_k != 34) {
                    stackIn_18_1 = 240;
                  } else {
                    stackIn_18_1 = 100;
                  }
                } else {
                  stackIn_18_1 = 240;
                }
                this.field_f = stackIn_18_1;
                this.b(-1, -3, 2);
              }
            }
          } else {
            stackIn_13_1 = !(this.field_c);
            this.field_c = stackIn_13_1;
            if (!this.field_c) {
              if (this.field_k != 34) {
                stackIn_18_1 = 240;
              } else {
                stackIn_18_1 = 100;
              }
            } else {
              stackIn_18_1 = 240;
            }
            this.field_f = stackIn_18_1;
            if (var3 != 0) {
              this.b(-1, -3, 2);
            }
          }
        } else {
          this.b(-1, -3, 2);
        }

    }

    private final void j(byte param0) {
        if (param0 > -95) {
          this.field_p = 95;
        }
        this.field_q.field_fc = true;
    }

    private final void d(int param0) {
        this.field_q.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new SummonEvent(0, 3, 4, 5, 0, true)));
        int var2 = -44 % ((-70 - param0) / 43);
    }

    private final int a(int param0, byte param1) {
        int var3;
        int var4;
        if (param1 > -108) {
          return -34;
        }
        var3 = this.field_q.battlefield.tiles[param0].terrainType;
        var4 = var3;
        if (var4 == 7) {
          return 6;
        }
        if (var4 == 8) {
          return 7;
        }
        if (9 == var4) {
          return 8;
        }
        return 9;
    }

    private final void k(byte param0) {
        if (param0 > -55) {
          return;
        }
        this.field_q.field_Mb = true;
    }

    private final void f(byte param0) {
        si.b(13829);
        if (param0 != -34) {
          this.field_s = false;
        }
    }

    final static int a(int param0, String param1, int param2, BitmapFont param3, String[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = param3.a(param1);
          if (param0 >= var5_int &&
            param1.indexOf("<br>") == -1) {
            param4[0] = param1;
            stackIn_4_0 = 1;
            return stackIn_4_0;
          }
          if (param2 != 7502) {
            iu.b(6);
          }
          var6 = (-1 + var5_int + param0) / param0;
          param0 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param1.length();
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 <= var9))) {
            var10 = param1.charAt(var9);
            stackIn_21_0 = var10;
            stackIn_21_1 = 32;
            if (var13 == 0) {
              if (stackIn_21_0 == stackIn_21_1 ||
                45 == var10) {
                var11 = param1.substring(var7, var9 + 1).trim();
                var12 = param3.a(var11);
                if (var12 >= param0) {
                  incrementValue$0 = var6Lifetime1;
                  var6Lifetime1++;
                  param4[incrementValue$0] = var11;
                  var7 = 1 + var9;
                }
              }
              if (var10 == 62 &&
                param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param4[incrementValue$1] = param1.substring(var7, -3 + var9).trim();
                var7 = var9 + 1;
              }
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_21_0 = var8;
            stackIn_21_1 = var7;
          }
          if (stackIn_21_0 > stackIn_21_1) {
            incrementValue$2 = var6Lifetime1;
            var6Lifetime1++;
            param4[incrementValue$2] = param1.substring(var7, var8).trim();
          }
          stackIn_25_0 = var6Lifetime1;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("iu.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    private final void e(int param0) {
        this.field_q.field_ac = true;
        if (param0 != 31) {
          this.field_e = (String) null;
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_u = null;
        field_l = null;
        if (param0 != 1) {
          return;
        }
        field_d = null;
        field_b = null;
        field_r = null;
    }

    iu(GameplayController param0, int param1) {
        this.field_g = 240;
        this.field_w = 0;
        this.field_m = 0;
        this.field_k = 0;
        this.field_j = 40;
        try {
          this.field_a = 40;
          this.field_q = param0;
          this.a(param1, 13567);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "iu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    iu(GameplayController param0) {
        this.field_g = 240;
        this.field_w = 0;
        this.field_m = 0;
        this.field_k = 0;
        this.field_j = 40;
        try {
          this.field_a = 40;
          this.field_q = param0;
          this.field_s = false;
          this.field_v = false;
          this.field_o = false;
          this.b(0, -30659);
          this.field_q.battlefield.tiles[DeployAction.field_s[0]].ownerPlayer = 1;
          this.field_q.battlefield.field_f = true;
          this.field_q.battlefield.field_z[1][1] = 1;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "iu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = 0;
        field_b = "Change display name";
        field_l = "Year";
        field_i = "Offline";
        field_x = 4;
        field_h = false;
        field_r = "This unit already has a poisonous attack.";
        field_u = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
