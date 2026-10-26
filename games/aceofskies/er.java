/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er {
    static String field_c;
    private DualLinkNode field_a;
    private DualLinkNode field_b;

    final void a(DualLinkNode param0, byte param1) {
        if (param0.previousSecondaryNode != null) {
          param0.unlinkSecondaryNode(-123);
        }
        param0.previousSecondaryNode = this.field_a;
        param0.nextSecondaryNode = this.field_a.nextSecondaryNode;
        param0.previousSecondaryNode.nextSecondaryNode = param0;
        if (param1 <= 122) {
          return;
        }
        try {
          param0.nextSecondaryNode.previousSecondaryNode = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "er.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final DualLinkNode b(int param0) {
        if (param0 != -18520) {
          return (DualLinkNode) null;
        }
        DualLinkNode var2 = this.field_a.nextSecondaryNode;
        if (var2 != this.field_a) {
          var2.unlinkSecondaryNode(-121);
          return var2;
        }
        return null;
    }

    final static void a(byte param0) {
        double var16_double = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var26 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (null != ScorchMark.field_f) {
            return;
          }
          ScorchMark.field_f = new int[65536];
          double var1_double = -0.015 + Math.random() * 0.03 + 0.7;
          if (param0 != -128) {
            er.d(65);
          }
          for (int var3 = 0; 65536 > var3; var3++) {
            double var4 = 0.0078125 + (double)((var3 & 64725) >> 10) / 64.0;
            double var6 = 0.0625 + (double)((1017 & var3) >> 7) / 8.0;
            double var8 = (double)(127 & var3) / 128.0;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (0.0 != var6) {
              if (var8 < 0.5) {
                var16_double = var8 * (1.0 + var6);
              } else {
                var16_double = -(var6 * var8) + (var8 + var6);
              }
              double var18_double = 2.0 * var8 - var16_double;
              double var20 = var4 + 0.3333333333333333;
              if (var20 > 1.0) {
                var20 = var20 - 1.0;
              }
              double var22 = var4;
              double var24 = -0.3333333333333333 + var4;
              if (!(var22 * 6.0 < 1.0)) {
                if (!(var22 * 2.0 < 1.0)) {
                  if (3.0 * var22 < 2.0) {
                    var12 = (-var18_double + var16_double) * (-var22 + 0.6666666666666666) * 6.0 + var18_double;
                  } else {
                    var12 = var18_double;
                  }
                } else {
                  var12 = var16_double;
                }
              } else {
                var12 = (-var18_double + var16_double) * 6.0 * var22 + var18_double;
              }
              if (var24 < 0.0) {
                var24 = var24 + 1.0;
              }
              if (var20 * 6.0 < 1.0) {
                var10 = var20 * ((-var18_double + var16_double) * 6.0) + var18_double;
              } else {
                if (2.0 * var20 < 1.0) {
                  var10 = var16_double;
                } else {
                  if (var20 * 3.0 < 2.0) {
                    var10 = 6.0 * ((-var20 + 0.6666666666666666) * (-var18_double + var16_double)) + var18_double;
                  } else {
                    var10 = var18_double;
                  }
                }
              }
              if (1.0 > var24 * 6.0) {
                var14 = var18_double + 6.0 * (-var18_double + var16_double) * var24;
              } else {
                if (!(var24 * 2.0 < 1.0)) {
                  if (3.0 * var24 < 2.0) {
                    var14 = var18_double + 6.0 * ((-var24 + 0.6666666666666666) * (-var18_double + var16_double));
                  } else {
                    var14 = var18_double;
                  }
                } else {
                  var14 = var16_double;
                }
              }
              var10 = Math.pow(var10, var1_double);
              var12 = Math.pow(var12, var1_double);
              var14 = Math.pow(var14, var1_double);
              var16 = (int)(var10 * 256.0);
              var17 = (int)(256.0 * var12);
              var18 = (int)(256.0 * var14);
              var19 = (var16 << 16) - (-(var17 << 8) - var18);
              ScorchMark.field_f[var3] = var19;
            } else {
              var10 = Math.pow(var10, var1_double);
              var12 = Math.pow(var12, var1_double);
              var14 = Math.pow(var14, var1_double);
              var16 = (int)(var10 * 256.0);
              var17 = (int)(256.0 * var12);
              var18 = (int)(256.0 * var14);
              var19 = (var16 << 16) - (-(var17 << 8) - var18);
              ScorchMark.field_f[var3] = var19;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "er.C(" + param0 + ')');
        }
    }

    final int c(int param0) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        int var2 = param0;
        DualLinkNode var3 = this.field_a.nextSecondaryNode;
        while (var3 != this.field_a) {
          var3 = var3.nextSecondaryNode;
          var2++;
        }
        return var2;
    }

    final void a(int param0, DualLinkNode param1) {
        try {
          if (param1.previousSecondaryNode != null) {
            param1.unlinkSecondaryNode(-124);
          }
          param1.previousSecondaryNode = this.field_a.previousSecondaryNode;
          param1.nextSecondaryNode = this.field_a;
          param1.previousSecondaryNode.nextSecondaryNode = param1;
          if (param0 != 2) {
            this.a(-73);
          }
          param1.nextSecondaryNode.previousSecondaryNode = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "er.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkNode e(int param0) {
        DualLinkNode var2 = this.field_b;
        if (var2 == this.field_a) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.nextSecondaryNode;
        if (param0 == 31542) {
          return var2;
        }
        return (DualLinkNode) null;
    }

    public static void d(int param0) {
        int var1 = 118 % ((67 - param0) / 57);
        field_c = null;
    }

    final DualLinkNode a(int param0) {
        if (param0 != 3) {
          this.field_b = (DualLinkNode) null;
          DualLinkNode var2 = this.field_a.previousSecondaryNode;
          if (var2 != this.field_a) {
            var2.unlinkSecondaryNode(-114);
            return var2;
          }
          return null;
        }
        DualLinkNode var2Lifetime1 = this.field_a.previousSecondaryNode;
        if (var2Lifetime1 != this.field_a) {
          var2Lifetime1.unlinkSecondaryNode(-114);
          return var2Lifetime1;
        }
        return null;
    }

    public er() {
        this.field_a = new DualLinkNode();
        this.field_a.previousSecondaryNode = this.field_a;
        this.field_a.nextSecondaryNode = this.field_a;
    }

    final DualLinkNode b(byte param0) {
        DualLinkNode var2 = this.field_a.nextSecondaryNode;
        if (this.field_a == var2) {
          this.field_b = null;
          return null;
        }
        if (param0 >= 13) {
          this.field_b = var2.nextSecondaryNode;
          return var2;
        }
        this.field_a = (DualLinkNode) null;
        this.field_b = var2.nextSecondaryNode;
        return var2;
    }

    static {
        field_c = "Unpacking sound effects";
    }
}
